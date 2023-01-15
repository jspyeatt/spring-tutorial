package my.spring.core.lifecycle.postprocessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("my.spring.core.lifecycle.postprocessor")
public class BeanConfiguration {

    @Bean("run")
    public Action action1() {
        return new Action("run");
    }
    @Bean("walk")
    public Action action2() {
        return new Action("walk");
    }
}
