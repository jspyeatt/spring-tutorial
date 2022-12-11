package my.spring.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This example demonstrates using xml configuration to construct product beans.
 *
 * You create the context then create the beans based on their names in the xml file.
 */
public class ProductMain {
    private static final Logger log = LoggerFactory.getLogger(ProductMain.class);
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // cast the bean to a Product
        Product product1 = (Product) context.getBean("product1");
        // define the return type as the second argument.
        Product product2 = context.getBean("product2", Product.class);
        log.info("{}", product1);
        log.info("{}", product2);
    }
}
