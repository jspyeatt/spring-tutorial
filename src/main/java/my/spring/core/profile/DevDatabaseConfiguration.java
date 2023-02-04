package my.spring.core.profile;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "dev")
public class DevDatabaseConfiguration implements DatabaseConfiguration{
    private static final Logger log = LoggerFactory.getLogger(DevDatabaseConfiguration.class);
    @Override
    public void doSetup() {
        log.info("doSetup()");
    }
}
