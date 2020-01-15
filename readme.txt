1.建立普通maven工程(不选archetype)为父工程springcloud,把src删除,设置pom.xml

14.右击父工程new module, 新建maven普通子工程springcloud-api(不选archetype),设置pom.xml
16.创建数据库DB01 新建dept表
17.springcloud-api中新建实体类dept(此module只负责管理实体类)

18.右击父工程new module, 新建maven普通子工程springcloud-provider-dept-8001(不选archetype),设置pom.xml
19.配置application.properties
20.写mapper层,新建DeptMapper接口
21.service层及实现类,启动类及注解@EnableEurekaClient

22.新建maven普通子工程springcloud-consumer-dept-80(不选archetype),设置pom.xml
23.配置application.properties
24.编写controller层
25.编写ConfigBean配置类

25.新建maven普通子工程springcloud-eureka-server-7001,设置pom.xml
26.配置application.properties
27.启动类加注解@EnableEurekaServer

28.配置Eureka集群,new module(2个)springcloud-eureka-server-7002/7003, 设置pom.xml
29.编写启动类，配置application.properties, Eureka集群相互关联
30.修改服务提供者配置文件，把服务提供者注册在集群中
31.新建项目