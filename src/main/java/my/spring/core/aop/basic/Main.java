package my.spring.core.aop.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

        // Note we are referencing the BasicCalculator interface, not the concrete
        // class. If we set it to ArithmeticCalculator it would throw an exception
        // because it expects a proxy object of an interface.
        context.getBean("arithmeticCalculator", BasicCalculator.class).multiply(3.0,5.0);

        context.getBean("arithmeticCalculator", BasicCalculator.class).addition(3.0,5.0);

        try {
            context.getBean("arithmeticCalculator", BasicCalculator.class).divide(3.0, 0.0);
        } catch (IllegalArgumentException e) {
            // silent
        }
    }
}
