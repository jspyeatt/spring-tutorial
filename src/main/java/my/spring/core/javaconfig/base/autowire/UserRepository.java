package my.spring.core.javaconfig.base.autowire;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserRepository {
    private static final Logger log = LoggerFactory.getLogger(UserRepository.class);

    public UserRepository() {
        log.info("constructing");
    }
    public void save() {
        log.info("SAVING");
    }
}
