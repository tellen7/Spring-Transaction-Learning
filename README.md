## Spring 事务管理

### Spring将事务管理分成两类

**编程式事务管理**
- 手动编写代码进行事务管理。*（很少用）*

**声明式事务管理**
- 基于TransactionProxyFactoryBean的方式*(很少用)*
   * 需要为每个进行事务管理的类配置一个TransactionProxyFactoryBean进行增强。
- 基于Aspectj的xml方式。*（常用）*
   * 一旦配置好，类上不需要添加任何东西。不需要修改业务代码。
- 基于注解的方式*（常用）*
   * 配置简单，需要在业务类上添加注解@Transactional注解

**NOTE**:
1. 测试发生异常的业务代码中，异常`int a= 1/0;`被注释掉了，测试时放开注释即可。
2. dbconfig.properties配置文件内容根据自己数据库及配置进行修改。

MOOC教学视频==>[spring事务管理](http://www.imooc.com/learn/478)，非常感谢！
