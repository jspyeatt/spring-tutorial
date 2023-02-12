package my.spring.core.aop.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculator implements BasicCalculator {
    private static final Logger log = LoggerFactory.getLogger(ArithmeticCalculator.class);
    @Override
    public double addition(double a, double b) {
        log.info("addition({},{}) = {}", a , b, (a+b));
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        log.info("subtraction({},{}) = {}", a , b, a-b);
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        log.info("multiply({},{}) = {}", a , b, a*b);
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        log.info("divide({},{}) = {}", a , b, a/b);
        return a / b;
    }
}
