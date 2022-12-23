package my.spring.core.javaconfig.base.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    // this needs to be defined here so we can @Autowired it in the userService().
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    // This is slightly contrived. Normally you would only have 1 userservice. But I created
    // two here to demonstrate that each service autowires the same instance of the user
    // repository. So with autowiring, userRepository is really a singleton.
    @Bean(name="userService1")
    public UserService userService1() {
        return new UserService();
    }

    @Bean(name="userService2")
    public UserService userService2() {
        return new UserService();
    }
}
