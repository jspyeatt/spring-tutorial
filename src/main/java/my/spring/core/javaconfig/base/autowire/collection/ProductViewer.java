package my.spring.core.javaconfig.base.autowire.collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class ProductViewer {
    private static final Logger log = LoggerFactory.getLogger(ProductViewer.class);

    // This is a bit creepy, but the Autowire will populate the products array with
    // every Product bean in the configuration.
    @Autowired
    private Product[] products;

    public void viewProducts() {
        Arrays.stream(products).forEach(p -> log.info("{}", p));
    }
}
