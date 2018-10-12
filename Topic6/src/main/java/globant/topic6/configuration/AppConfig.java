package globant.topic6.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import lombok.*;
/**
 *
 * @author Emiliano
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ComponentScan(basePackages = "globant.topic6")
@ConfigurationProperties(prefix = "persistence")
public class AppConfig {
    
    String url;
    String user;
    String password;
    String driver;
}
