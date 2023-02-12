package my.spring.core.aop.basic;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class CalculatorLoggingAspect {
    private static final Logger log = LoggerFactory.getLogger(CalculatorConfiguration.class);

    // passing in the class and method we are identifying
    @Before("execution(* ArithmeticCalculator.multiply(..))")
    public void logBefore() {
        log.info("Before multiplication");
    }
    @After("execution(* ArithmeticCalculator.addition(..))")
    public void logAfter() {
        log.info("After addition");
    }

    @AfterReturning(pointcut = "(execution(* ArithmeticCalculator.addition(..)))", returning = "reslt")
    public void logAfterReturning(Object reslt) {
        log.info("Afterreturning addition result = {}", reslt);
    }

    @AfterThrowing(pointcut = "(execution (* ArithmeticCalculator.divide(..)))", throwing = "ex")
    public void logAfterThrowing(Throwable ex) {
        log.info("after throwing: {}", ex.getMessage());
    }

    @Before("execution(* ArithmeticCalculator.multiply(..))")
    public void joinPointInfo(JoinPoint joinPoint) {
        log.info("joinPoint Kind: {} Signature {} : {} args: {} target {} this {}",
                joinPoint.getKind(),
                joinPoint.getSignature().getName(),
                joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getArgs(),
                joinPoint.getTarget(),
                joinPoint.getThis());
    }

    @Around("execution(* ArithmeticCalculator.multiply(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("Around advice: args {}",
                Arrays.toString(proceedingJoinPoint.getArgs()));

        try {
            return proceedingJoinPoint.proceed(); // needs to be called so things proceed.

            // could also call proceedJoinPoint.proceed with arguments to change the
            // behavior of the multiply method. Wow. That's horrible.
        } catch (Throwable t) {
            throw t;
        }
    }
}
