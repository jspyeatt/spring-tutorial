package my.spring.core.javaconfig.base.autowire.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class VehicleConfiguration {

    // we add the @Primary here so that if the getBean() method isn't specific enough it picks this one.
    // for example @Autowire in Person class has an issue.. Without the @Primary you will get an exception thrown
    // because Spring doesn't know whether to return the bike or the car.
    @Bean
    @Primary
    public Vehicle bike() {
        return new Bike();
    }
    @Bean
    public Vehicle car() {
        return new Car();
    }
    @Bean
    public Person person() {
        return new Person();
    }
}
