package my.spring.core.javaconfig.base.autowire.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductConfiguration.class);
        ProductViewer viewer = applicationContext.getBean(ProductViewer.class);
        viewer.viewProducts();
    }
}
