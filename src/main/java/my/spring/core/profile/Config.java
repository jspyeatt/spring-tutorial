package my.spring.core.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("my.spring.core.profile")
public class Config {

    public DatabaseConfigurationHandler databaseConfigurationHandler() {
        return new DatabaseConfigurationHandler();
    }
}
