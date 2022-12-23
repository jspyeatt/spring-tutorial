package my.spring.core.javaconfig.base.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);

        Cart shoppingCart1 = applicationContext.getBean(Cart.class);
        Product laptop = applicationContext.getBean("laptop", Product.class);
        shoppingCart1.addProduct(laptop);
        log.info("{}", shoppingCart1.getProducts());

        Cart shoppingCart2 = applicationContext.getBean(Cart.class);
        Product mobile = applicationContext.getBean("mobile", Product.class);
        shoppingCart2.addProduct(mobile);
        log.info("{}", shoppingCart2.getProducts());
    }
}
