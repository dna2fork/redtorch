package xyz.redtorch.common.compile;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class DynamicCompileEngine {

	private static final Logger logger = LoggerFactory.getLogger(DynamicCompileEngine.class);

	// 单例
	private static DynamicCompileEngine instance = new DynamicCompileEngine();

	public static DynamicCompileEngine getInstance() {
		return instance;
	}

	private ClassLoader parentClassLoader;
	private String classpath;

	private DynamicCompileEngine() {
		// 获取类加载器
		this.parentClassLoader = this.getClass().getClassLoader();
		// 创建classpath
		try {
			this.buildClassPath();
		} catch (IOException e) {
			logger.error("建立ClassPath错误",e);
		}
	}


	private void buildClassPath() throws IOException {
		this.classpath = null;
		if (this.parentClassLoader instanceof URLClassLoader) {
			
			ClassLoader cl = parentClassLoader;
			List<String> paths = new ArrayList<String>();
			while (cl instanceof URLClassLoader) {
				for (URL url : ((URLClassLoader) cl).getURLs()) {
					if (url.openConnection() instanceof JarURLConnection) {
						// extract the file URL from the jar URL
						JarURLConnection connection = (JarURLConnection) url.openConnection();
						url = connection.getJarFileURL();
					}
					String decodedPath = URLDecoder.decode(url.getPath(), "UTF-8");
					paths.add(new File(decodedPath).getAbsolutePath());
				}
				cl = cl.getParent();
			}
			StringBuilder sb = new StringBuilder();
			for (String path : paths) {
				if(StringUtils.isNoneBlank(path)) {
					sb.append(path).append(File.pathSeparator);
				}
			}
			this.classpath = sb.toString();
		} else {
			this.classpath = System.getProperty("java.class.path");
		}
	}

	public Class<?> javaCodeToClass(String fullClassName, String javaCode, String classPath) throws IllegalAccessException, InstantiationException {
		// 获取系统编译器
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		// 建立DiagnosticCollector对象
		DiagnosticCollector<JavaFileObject> diagnosticCollector = new DiagnosticCollector<>();

		// 建立用于保存被编译文件名的对象
		// 每个文件被保存在一个从JavaFileObject继承的类中
		ClassFileManager fileManager = new ClassFileManager(compiler.getStandardFileManager(diagnosticCollector, null, null));

		List<JavaFileObject> jfiles = new ArrayList<>();
		jfiles.add(new CharSequenceJavaFileObject(fullClassName, javaCode));

		// 使用编译选项可以改变默认编译行为。编译选项是一个元素为String类型的Iterable集合
		List<String> options = new ArrayList<>();
		options.add("-encoding");
		options.add("UTF-8");
		options.add("-classpath");
		if(StringUtils.isBlank(classPath)) {
			options.add(this.classpath);
		}else {
			options.add(this.classpath+File.pathSeparator+classPath+File.pathSeparator);
		}
		// 不使用SharedNameTable （jdk1.7自带的软引用，会影响GC的回收，jdk1.9已经解决）
		options.add("-XDuseUnsharedTable");

		JavaCompiler.CompilationTask compilationTask = compiler.getTask(null, fileManager, diagnosticCollector, options, null, jfiles);

		// 编译源程序
		boolean success = compilationTask.call();

		if (success) {
			// 如果编译成功，用类加载器加载该类
			JavaClassObject jco = fileManager.getJavaClassObject();
			DynamicClassLoader dynamicClassLoader = new DynamicClassLoader(this.parentClassLoader);
			Class<?> clazz = dynamicClassLoader.loadClass(fullClassName, jco);
			try {
				dynamicClassLoader.close();
			} catch (IOException e) {
				logger.error("关闭动态类加载器错误", e);
			}
			return clazz;
		} else {
			// 如果想得到具体的编译错误，可以对Diagnostics进行扫描
			for (Diagnostic<?> diagnostic : diagnosticCollector.getDiagnostics()) {
				String error = compilePrint(diagnostic);
				logger.error("编译错误,\n" + error);
			}
			return null;
		}
	}

	/**
	 * @MethodName : compilePrint
	 * @Description : 输出编译错误信息
	 * @param diagnostic
	 * @return
	 */
	private String compilePrint(Diagnostic<?> diagnostic) {
		System.out.println("Code:" + diagnostic.getCode());
		System.out.println("Kind:" + diagnostic.getKind());
		System.out.println("Position:" + diagnostic.getPosition());
		System.out.println("Start Position:" + diagnostic.getStartPosition());
		System.out.println("End Position:" + diagnostic.getEndPosition());
		System.out.println("Source:" + diagnostic.getSource());
		System.out.println("Message:" + diagnostic.getMessage(null));
		System.out.println("LineNumber:" + diagnostic.getLineNumber());
		System.out.println("ColumnNumber:" + diagnostic.getColumnNumber());
		StringBuffer res = new StringBuffer();
		res.append("Code:[" + diagnostic.getCode() + "]\n");
		res.append("Kind:[" + diagnostic.getKind() + "]\n");
		res.append("Position:[" + diagnostic.getPosition() + "]\n");
		res.append("Start Position:[" + diagnostic.getStartPosition() + "]\n");
		res.append("End Position:[" + diagnostic.getEndPosition() + "]\n");
		res.append("Source:[" + diagnostic.getSource() + "]\n");
		res.append("Message:[" + diagnostic.getMessage(null) + "]\n");
		res.append("LineNumber:[" + diagnostic.getLineNumber() + "]\n");
		res.append("ColumnNumber:[" + diagnostic.getColumnNumber() + "]\n");
		return res.toString();
	}
}