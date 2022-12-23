package my.spring.core.javaconfig.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    private static final Logger log = LoggerFactory.getLogger(ProductConfiguration.class);

    @Bean
    public Product product() {
        Product product = new Product();
        product.setProductId("123");
        product.setProductDesc("First prod");
        return product;
    }

    @Bean
    public Address address() {
        return new Address("123 Main Street", "Chicago");
    }
}
