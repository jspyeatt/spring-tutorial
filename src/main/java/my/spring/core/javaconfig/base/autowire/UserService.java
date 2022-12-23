package my.spring.core.javaconfig.base.autowire;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    // notice that even though there are no setters. Also, the scope is private, yet spring can still
    // instantiate the userRepository
    @Autowired
    private UserRepository userRepository;

    public UserService() {
        log.info("constructing");
    }
    public void save() {
        log.info("saving");
        Objects.requireNonNull(userRepository);
        userRepository.save();
    }
}
