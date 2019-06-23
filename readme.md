#1、在https://start.spring.io/下载spring-boot项目
#2、在eclipse中导入
#3、使用mvn spring-boot:run启动
#热部署 在pom.xml加入
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<optional>true</optional>
		</dependency>