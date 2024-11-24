# spb-boot-starter

SpringBoot 2 自定义 Starter 写法（3 除了装配写法变了其他都一样）

additional-spring-configuration-metadata.json 用于自定义 application.yml 中的注释

## v2.7 之前的写法

META-INF/spring.factories 文件里添加 org.springframework.boot.autoconfigure.EnableAutoConfiguration=YouAutoConfiguration

## v2.7 写法

1. 直接在 META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports 文件里添加配置类名称，每行包含一个配置类全限定名

2. 兼容 META-INF/spring.factories 方式

文档： https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.7-Release-Notes#changes-to-auto-configuration

## v3.0 新写法

移除 META-INF/spring.factories 方式，只支持
META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports 方式

文档：https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-3.0-Migration-Guide#auto-configuration-files