package com.example.mystarterspringbootstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * created at 2021/5/10 8:12
 */
@Data
@ConfigurationProperties(prefix = "example.mystarter")
public class MyStarterProperties {
    private Boolean enable;
    private String name;
    private Integer age;
    private String sex = "M";
}
