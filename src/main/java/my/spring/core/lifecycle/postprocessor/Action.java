package my.spring.core.lifecycle.postprocessor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class Action {
    private static final Logger log = LoggerFactory.getLogger(Action.class);
    private String action;

    public Action(String action) {
        log.info("creating {}", action);
        this.action = action;
    }

    @PostConstruct
    public void init() {
        log.info("init() " + action);
    }
}
