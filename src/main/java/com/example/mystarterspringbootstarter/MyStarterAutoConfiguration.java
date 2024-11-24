package com.example.mystarterspringbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created at 2021/5/10 8:18
 */
@Configuration
@EnableConfigurationProperties(MyStarterProperties.class)
@ConditionalOnClass(MyStarterService.class)
@ConditionalOnProperty(prefix = "mystarter", value = "enable", matchIfMissing = true)
public class MyStarterAutoConfiguration {

    @Autowired
    private MyStarterProperties properties;

    @Bean
    @ConditionalOnMissingBean(MyStarterService.class)
    @ConditionalOnProperty(value = "mystarter.enable", havingValue = "true")
    public MyStarterService myStarterService() {
        return new MyStarterService(properties);
    }

}
