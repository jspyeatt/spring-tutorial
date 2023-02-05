package my.spring.core.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware {
    private static final Logger log = LoggerFactory.getLogger(Person.class);
    @Override
    public void setBeanName(String name) {
        log.info("setBeanName({})", name);
    }
}
