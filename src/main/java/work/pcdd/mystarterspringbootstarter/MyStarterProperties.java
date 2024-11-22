package work.pcdd.mystarterspringbootstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * created at 2021/5/10 8:12
 */
@Data
@ConfigurationProperties(prefix = "pcdd.mystarter")
public class MyStarterProperties {
    private String name;
    private Integer age;
    private String sex = "M";
}
