package my.spring.core.javaconfig.base.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("my.spring.core.javaconfig.base.scope")
public class ProductConfiguration {

    @Bean
    public Product laptop() { return new Product("1", "Laptop");}
    @Bean
    public Product mobile() { return new Product("2", "Mobile");}

    // we don't define this method as a @Bean. Its scope is 'prototype'.
    // if we add @Bean we will get a runtime error
    public Cart shoppingCart() { return new Cart();}
}
