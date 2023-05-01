package xyz.redtorch.common.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Modifier;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;


public class CommonUtils {

    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);

    /**
     * 从包package中获取所有的Class
     *
     */
    public static Set<Class<?>> getClasses(String pack) {

        // 第一个class类的集合
        Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
        // 获取包的名字 并进行替换
        String packageName = pack;
        String packageDirName = packageName.replace('.', '/');
        // 定义一个枚举的集合 并进行循环来处理这个目录下的things
        Enumeration<URL> dirs;
        try {
            dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            // 循环迭代下去
            while (dirs.hasMoreElements()) {
                // 获取下一个元素
                URL url = dirs.nextElement();
                // 得到协议的名称
                String protocol = url.getProtocol();
                // 如果是以文件的形式保存在服务器上
                if ("file".equals(protocol)) {
                    logger.info("File类型的扫描");
                    // 获取包的物理路径
                    String filePath = URLDecoder.decode(url.getFile(), StandardCharsets.UTF_8);
                    // 以文件的方式扫描整个包下的文件 并添加到集合中
                    findAndAddClassesInPackageByFile(packageName, filePath, true, classes);
                } else if ("jar".equals(protocol)) {
                    // 如果是jar包文件
                    // 定义一个JarFile
                    // System.err.println("jar类型的扫描");
                    JarFile jar;
                    try {
                        // 获取jar
                        jar = ((JarURLConnection) url.openConnection()).getJarFile();
                        // 从此jar包 得到一个枚举类
                        Enumeration<JarEntry> entries = jar.entries();
                        // 同样的进行循环迭代
                        while (entries.hasMoreElements()) {
                            // 获取jar里的一个实体 可以是目录 和一些jar包里的其他文件 如META-INF等文件
                            JarEntry entry = entries.nextElement();
                            String name = entry.getName();
                            // 如果是以/开头的
                            if (name.charAt(0) == '/') {
                                // 获取后面的字符串
                                name = name.substring(1);
                            }
                            // 如果前半部分和定义的包名相同
                            if (name.startsWith(packageDirName)) {
                                int idx = name.lastIndexOf('/');
                                // 如果以"/"结尾 是一个包
                                if (idx != -1) {
                                    // 获取包名 把"/"替换成"."
                                    packageName = name.substring(0, idx).replace('/', '.');
                                }
                                // 如果是一个.class文件 而且不是目录
                                if (name.endsWith(".class") && !entry.isDirectory()) {
                                    // 去掉后面的".class" 获取真正的类名
                                    String className = name.substring(packageName.length() + 1, name.length() - 6);
                                    try {
                                        // 添加到classes
                                        classes.add(Thread.currentThread().getContextClassLoader()
                                                .loadClass(packageName + '.' + className));
                                    } catch (ClassNotFoundException e) {
                                        logger.error("添加用户自定义视图类错误 找不到此类的.class文件", e);
                                    }
                                }
                            }
                        }
                    } catch (Throwable t) {
                        logger.error("在扫描用户定义视图时从jar包获取文件出错", t);
                    }
                }
            }
        } catch (IOException e) {
            logger.error("扫描出错", e);
        }

        return classes;
    }

    /**
     * 以文件的形式来获取包下的所有Class
     *
     */
    public static void findAndAddClassesInPackageByFile(String packageName, String packagePath, final boolean recursive,
                                                        Set<Class<?>> classes) {
        // 获取此包的目录 建立一个File
        File dir = new File(packagePath);
        // 如果不存在或者 也不是目录就直接返回
        if (!dir.exists() || !dir.isDirectory()) {
            // logger.warn("用户定义包名 " + packageName + " 下没有任何文件");
            return;
        }
        // 如果存在 就获取包下的所有文件 包括目录
        File[] dirFiles = dir.listFiles(new FileFilter() {
            // 自定义过滤规则 如果可以循环(包含子目录) 或则是以.class结尾的文件(编译好的java类文件)
            public boolean accept(File file) {
                return (recursive && file.isDirectory()) || (file.getName().endsWith(".class"));
            }
        });
        if (dirFiles != null) {
            // 循环所有文件
            for (File file : dirFiles) {
                // 如果是目录 则继续扫描
                if (file.isDirectory()) {
                    findAndAddClassesInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(),
                            recursive, classes);
                } else {
                    // 如果是java类文件 去掉后面的.class 只留下类名
                    String className = file.getName().substring(0, file.getName().length() - 6);
                    try {
                        // 添加到集合中去
                        // 不可用forName,会触发static方法,没有使用classLoader的load干净
                        classes.add(Thread.currentThread().getContextClassLoader()
                                .loadClass(packageName + '.' + className));
                    } catch (ClassNotFoundException e) {
                        logger.error("添加用户自定义视图类错误 找不到此类的.class文件", e);
                    }
                }
            }
        }
    }

    /**
     * 通过接口分离实现类
     *
     * @param ifCls           接口类
     * @param classesAll      已知的类集合
     * @param includeAbstract 是否包含抽象类
     * @return
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static Set<Class<?>> getImplementsByInterface(Class ifCls, Set<Class<?>> classesAll,
                                                         boolean includeAbstract) {
        Set<Class<?>> classes = new LinkedHashSet<Class<?>>();
        // 获取指定接口的实现类
        if (ifCls.isInterface()) {
            /*
             * 循环判断路径下的所有类是否继承了指定类 并且排除父类自己
             */
            for (Class cls : classesAll) {
                if (ifCls.isAssignableFrom(cls)) {
                    if (!ifCls.equals(cls)) {// 自身并不加进去
                        if (includeAbstract) {
                            classes.add(cls);
                        } else {
                            if (!Modifier.isAbstract(cls.getModifiers())) {
                                classes.add(cls);
                            }
                        }
                    }
                }
            }

        }
        return classes;
    }

    public static double roundToPriceTick(double priceTick, double price) {
        if (priceTick <= 0) {
            logger.error("检测到错误的priceTick值:{}", priceTick);
            return price;
        }

        return Math.round(price / priceTick) * priceTick;
    }

    /**
     * 生成笛卡儿积
     *
     */
    public static <T> List<List<T>> cartesianProduct(List<List<T>> lists) {
        List<List<T>> resultLists = new ArrayList<>();
        if (lists.size() == 0) {
            resultLists.add(new ArrayList<T>());
            return resultLists;
        } else {
            List<T> firstList = lists.get(0);
            List<List<T>> remainingLists = cartesianProduct(lists.subList(1, lists.size()));
            for (T condition : firstList) {
                for (List<T> remainingList : remainingLists) {
                    ArrayList<T> resultList = new ArrayList<T>();
                    resultList.add(condition);
                    resultList.addAll(remainingList);
                    resultLists.add(resultList);
                }
            }
        }
        return resultLists;
    }

    public static Date changeDateTimeZoneFromLondonToShanghai(Date originDate) throws ParseException {
        SimpleDateFormat londonSdf = new SimpleDateFormat("yyyyMMddHHmmssSSS"); // 伦敦
        londonSdf.setTimeZone(TimeZone.getTimeZone("Europe/London")); // 设置伦敦时区

        String tmpDateTimeStr = londonSdf.format(originDate);

        SimpleDateFormat shanghaiSdf = new SimpleDateFormat("yyyyMMddHHmmssSSS"); // 北京
        shanghaiSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai")); // 设置北京时区

        return shanghaiSdf.parse(tmpDateTimeStr);

    }

    /**
     * 复制文件到临时文件夹
     */
    public static void copyFileToDirectoryForTmp(String targetDir, String originFilePath) throws IOException {
        File originFile = new File(originFilePath);
        File targetFile = new File(targetDir + File.separator + originFile.getName());
        if (targetFile.exists()) {
            targetFile.delete();
        }
        FileUtils.copyFileToDirectory(originFile, new File(targetDir));

        targetFile.deleteOnExit();
    }

    /**
     * 复制URL到临时文件夹,例如从war包中
     *
     */
    public static void copyURLToFileForTmp(String targetDir, URL sourceURL) throws IOException {
        File originFile = new File(sourceURL.getFile());
        File targetFile = new File(targetDir + File.separator + originFile.getName());
        if (targetFile.exists()) {
            targetFile.delete();
        }
        FileUtils.copyURLToFile(sourceURL, targetFile);

        targetFile.deleteOnExit();
    }

    public static String generateUuidAsBase64() {
        UUID uuid = UUID.randomUUID();
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return Base64.encodeBase64URLSafeString(bb.array());
    }

    public static String uuidToBase64(String str) {
        UUID uuid = UUID.fromString(str);
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return Base64.encodeBase64URLSafeString(bb.array());
    }

    public static String uuidFromBase64(String str) {
        byte[] bytes = Base64.decodeBase64(str);
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        UUID uuid = new UUID(bb.getLong(), bb.getLong());
        return uuid.toString();
    }

    public static LocalDateTime millsToLocalDateTime(long millis) {
        Instant instant = Instant.ofEpochMilli(millis);
        return instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalDateTime millsToLocalDateTime(long millis, String zoneId) {
        Instant instant = Instant.ofEpochMilli(millis);
        return instant.atZone(ZoneId.of(zoneId)).toLocalDateTime();
    }

    public static long localDateTimeToMills(LocalDateTime ldt, String offsetId) {
        return ldt.toInstant(ZoneOffset.of(offsetId)).toEpochMilli();
    }

    public static long localDateTimeToMills(LocalDateTime ldt) {
        return ldt.toInstant(OffsetDateTime.now().getOffset()).toEpochMilli();
    }

    public static boolean isStillAlive(String pidStr) {
        String OS = System.getProperty("os.name").toLowerCase();
        String command;
        if (OS.contains("win")) {
            logger.debug("Check alive Windows mode. Pid: [{}]", pidStr);
            command = "cmd /c tasklist /FI \"PID eq " + pidStr + "\"";
            return isProcessIdRunning(pidStr, command);
        } else if (OS.contains("nix") || OS.contains("nux")) {
            logger.debug("Check alive Linux/Unix mode. Pid: [{}]", pidStr);
            command = "ps -p " + pidStr;
            return isProcessIdRunning(pidStr, command);
        }
        logger.debug("Default Check alive for Pid: [{}] is false", pidStr);
        return false;
    }

    public static boolean isProcessIdRunning(String pid, String command) {
        logger.debug("Command [{}]", command);
        try {
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec(command);

            InputStreamReader isReader = new InputStreamReader(pr.getInputStream());
            BufferedReader bReader = new BufferedReader(isReader);
            String strLine;
            while ((strLine = bReader.readLine()) != null) {
                if (strLine.contains(" " + pid + " ")) {
                    return true;
                }
            }

            return false;
        } catch (Exception ex) {
            logger.warn("Got exception using system command [{}].", command, ex);
            return true;
        }
    }

    public static int getNumberDecimalDigits(Double value) {

        if (isInteger(value)) {
            return 0;
        }

        int decimalDigits = 0;
        String valueStr = Double.toString(value);
        int indexOf = valueStr.indexOf(".");
        if (indexOf > 0) {
            decimalDigits = valueStr.length() - 1 - indexOf;
        }
        return decimalDigits;
    }

    public static boolean isInteger(double obj) {
        double eps = 1e-10;  // 精度范围
        return obj - Math.floor(obj) < eps;
    }

    public static boolean isEquals(double d1, double d2) {
        double eps = 1e-6;
        return Math.abs(d1 - d2) < eps;
    }
}
