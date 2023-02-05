package my.spring.core.aware;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentInspector implements EnvironmentAware {
    private static final Logger log = LoggerFactory.getLogger(EnvironmentInspector.class);
    @Override
    public void setEnvironment(Environment environment) {
        log.info("setEnvironment()", environment.getProperty("last"));
    }
}
