package my.spring.core.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileConfiguration {

    // the init() method will be called after the constructor is called.
    // the destroy() method will be called when we close() the application context.
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public FileContext fileContext() {
        return new FileContext();
    }

    @Bean FileMaker fileMaker() {
        return new FileMaker();
    }
}
