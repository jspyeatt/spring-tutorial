package my.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {
    @Bean(name = "myartist")
    public Artist artist1() {
        return new Artist("John", "Doe");
    }
    @Bean(name = "yourartist")
    public Artist artist2() {
        return new Artist("Jane", "Smith");
    }
}
