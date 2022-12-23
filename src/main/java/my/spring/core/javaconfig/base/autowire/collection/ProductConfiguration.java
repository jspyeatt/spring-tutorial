package my.spring.core.javaconfig.base.autowire.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    public ProductViewer productViewer() {
        return new ProductViewer();
    }
    @Bean
    public Product product1() {
        return new Product("123", "cheese tray");
    }
    @Bean
    public Product product2() {
        return new Product("124", "cutting board");
    }
    @Bean
    public Product product3() {
        return new Product("125", "bacon stretcher");
    }

    @Bean
    public Product product4() {
        return new Product("126", "blinker fluid");
    }
}
