# redtorch

`但知行好事，莫要问前程。`

*在您下载和使用本项目前,请务必阅读相关协议和注意事项*




## 项目简介

项目是基于Java语言开发的开源量化交易程序开发框架。

项目仓库地址：[ https://github.com/sun0x00/redtorch](https://github.com/sun0x00/redtorch " https://github.com/sun0x00/redtorch")

## 提示

###  当前版本1.1.0

#### 下一个版本2.0.0升级计划的重要提示。

本项目自建立均以实际使用需求为导向，经过长时间的使用和总结，决定在2.0.0版本对本项目进行重构和精简。

按照监管要求，基金公司的内部一般要求保证公平、风险隔离、交易安全。账户统一管理，交易部门按权限交易，基金经理或其开发的策略独立下达指令。
在作者所在的公司实际使用中，对于交易信号的生成，大多由各策略负责人通过其他复杂手段生成，而后通过脚本策略形式接入本项目进行交易。
本项目中诸多复杂功能并未得到有效利用，常用功能为，查询投资组合（账户、持仓），获取交易过程（委托、成交），获取基本数据（合约），订阅行情。
在这些功能的基础上，额外开发了风险监控，交易监控等。

**因此2.0.0版本主要目标是将本项目作为交易管理的核心系统，而非一站式量化系统，增强安全性，增强容错，移除不必要的功能。**

 + 所有存入Zookeeper的数据将会使用3DES二次加密脱敏。（安全增强）
 + 项目将会使用Kotlin语言重写。（Kotlin语言对Java语言和类库兼容性良好，且对于空指针更为安全）
 + web管理服务将会被移除。（安全增强，技术堆栈精简）
 + 启动服务器可通过参数决定是否同时启动管理GUI,GUI由JavaFX实现。（增强便利性）
 + web交易页面也会被移除。如有需求建议单独开发。（安全增强）
 + 操作员（operator）和用户将会进行合并。（精简逻辑）
 + 数据传输移除Protobuf，使用RFC 6902作为替换。同时测试对比了RFC 7396，性能不佳。
 + 数据同步将利用RFC 6902进行差异化操作，移除复杂的RPC over HTTP/WebSocket。
 + 停止对Python客户端的支持。如有需求仍然可以自行开发。（Python重构测试坑太多）
 + 移除行情记录功能。（非业务必须功能，常有特殊需求）
 + 移除历史数据访问，K线计算等功能。（不合理的读取会导致网络传输拥堵）
 + **升级到JDK16+ JavaFX16+ Gradle7+**

#### 1.1.0升级内容

更新依赖的第三方库版本
Session通过Zookeeper管理
代码优化。

#### 1.0.0升级内容

此分支大幅精简了0.3.0版本中的通讯协议，增加了HTTP WebSocket混合RPC模式，
这极大的改善了性能，但是通讯模型理解难度增大; 此外，这个分支修复了大量拼写错误、
优化了Desktop模块的渲染方式、修复了诸多BUG、修改了接入认证方式。

由于改动幅度较大,**尚未经过充分测试**,请谨慎使用。

web页面和Python客户端对应的1.0.0分支也已经发布，与0.3.0不兼容。



## 开发语言
Java

## 项目文档
此项目仅供代码相互学习，不提供文档，部分问题可在FAQ查找答案 。

## FAQ

##### 这些项目都是做什么用的（redtorch、redtorch-web-react、redtorch-python-client、redtorch-resources）？

+ redtorch 整套开源框架的核心，承载主要业务逻辑，Gradle管理，有进一步细分的模块，详见代码


+ redtorch-web-react redtorch的web页面，此项目主要使用typescript react开发，使用node yarn构建，编译后被集成在redtorch/rt-master中


+ redtorch-python-client redtorch有三种主要访问形式，web、python、desktop,此项目提供了Python接入的模板


+ redtorch-resources 项目涉及到的第三方资源，JNI封装说明、源码等内容


##### 项目如何使用和部署?


+ 项目部署可分为主节点（rt-master）、从节点（rt-slave）、桌面端（rt-desktop）、python-client。
    主节点用于管理配置、接入数据库数据库、登录鉴权等，这个模块默认还包含Web服务，提供基本的用户操作接口。
    从节点属于容器，承载网关等组件。
  
+ 桌面端可选，这个模块提供更高性能的用户监控和操作接口，并可拓展开发图形化组件。 
  
+ 主节点、从节点、桌面端模块都在项目redtorch中，使用Gradle bootJar命令打包为 .jar 文件后，一般情况下，可通过java -jar <文件名>.jar 运行
    主节点的默认web访问端口为9099， admin用户的密码使用SHA-256加密，配置在主节点配置文件中
  
+ 从节点接入主节点之前，请现在主节点中生成从节点信息，将token配置到从节点的配置文件中 
  
+ 桌面端和python-client接入使用用户名密码，这也需要提前在主节点中配置，或直接使用admin用户 
  
+ 其它接入方式，可通过websocket使用任意语言接入，数据结构请遵循redtorch/rt-pb中Protobuf配置文件中的数据结构
  
+ 配置网关请指定一个存在的从节点ID，否则网关将无法被加载


##### 修改主节点（rt-master）、从节点（rt-slave）、桌面端（rt-desktop）中的配置文件一定要重新编译打包吗?


+ 如果在jar文件所在运行目录中加入配置文件application.properties,其配置会默认覆盖打包在jar中的配置文件，这一点将十分便于生产部署，配置分离。


##### 支持哪些操作系统？

+ 本系统已经在windows和linux中应用
  
+ 支持MAC，但是请注意，rt-slave模块依赖一些第三方运行库，例如ctp相关的dll和so，这些第三方库不一定支持mac，因此无法完全兼容


##### 如何编写策略？


+ 在redtorch-python-client中，提供了一些策略模板，可作为参照
    
+ 如果需要编写Java策略，请自行拓展开发


##### 是否支持回测？


+ 目前不支持回测，由于历史数据存在诸多不同，很多使用旧版的朋友都遇到了回测困难的问题，因此移除了Java策略引擎和回测引擎
    未来，可能会有一个新的精简项目，用于处理此类问题（不能保证）


##### 复杂的异构部署接入和直接使用其他Python量化项目有什么区别？

+ 如果你是一般用户，建议不要在此项目投入过多时间。 
  
+ 如果你是非高频类的一般小型机构，此项目或许能带来帮助，在开发效率，维护便利性和性能上提供一定的保证。


##### 只能用来做国内期货吗？
```
    此项目的的网关可自行拓展开发，同时此项目使用了非常复杂的数据键，因此可以支持复杂的账户定位，合约定位。
    在实际使用中已有接入国内证券（受限于政策，只读）和外盘接口的先例。
```


## 协议（License）
MIT

## 重要提示

**用户在遵循MIT协议的同时，如果用户下载、安装、使用本项目中所提供的软件，软件作者对任何原因在使用本项目中提供的软件时可能对用户自己或他人造成的任何形式的损失和伤害不承担任何责任。如果用户不同意上述内容，用户可以自行删除本项目。**

**作者不参与何形式的商业支持，任何关于本项目的商业活动或涉及金钱的内容均与作者无关**

**市场莫测 风险自负**

**请务必充分理解各类相关风险**