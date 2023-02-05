package my.spring.core.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Action implements BeanFactoryAware {
    private static final Logger log = LoggerFactory.getLogger(Action.class);
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("setBeanFactory({})", beanFactory);
    }
}
