# 环境搭建

## 框架
SpringBoot + StringMVC + Spring + MyBatis

## 下载地址
* [jdk1.8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* [IDEA](https://www.jetbrains.com/idea/download/#section=windows)

## 配置
### maven 依赖

```xml
<dependency>
      <groupId>org.xerial</groupId>
      <artifactId>sqlite-jdbc</artifactId>
      <version>3.23.1</version>
</dependency>

<dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid-spring-boot-starter</artifactId>
      <version>1.1.10</version>
</dependency>
```

### spring boot 配置
```
# Tomcat
server:
  tomcat:
    uri-encoding: UTF-8
    max-threads: 1000
    min-spare-threads: 30
  port: 8080
  servlet:
    context-path: /

spring:
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    driverClassName: org.sqlite.JDBC
    url: jdbc:sqlite:src/main/resources/identifier.sqlite

mybatis:
  mapper-locations: classpath:mapper/*.xml
  configuration:
    map-underscore-to-camel-case: true
```