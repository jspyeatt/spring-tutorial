package my.spring.core.lifecycle.postprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PrintBeanNameBeanPostProcessor implements BeanPostProcessor {
    private static final Logger log = LoggerFactory.getLogger(PrintBeanNameBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("postProcessBeforeInitialization  {} {}", bean.getClass().getSimpleName(), beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("postProcessAfterInitialization {} {}", bean.getClass().getSimpleName(), beanName);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
