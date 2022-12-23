package my.spring.core.javaconfig.base.dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class Config {

    @Bean
    @DependsOn("init") // the initialization class requires that the Init class be loaded first.
    public Initialization initialization() {
        return new Initialization();
    }
    @Bean
    public Init init() {
        return new Init();
    }
}
