package my.spring.core.javaconfig.base.autowire.multi.locations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstrumentConfiguration {

    @Bean
    public Instrument instrument() {
        return new Instrument("Piano");
    }
}
