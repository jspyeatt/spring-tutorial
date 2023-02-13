package my.spring.core.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;

/**
 * This is better than MessageListener because I can have one class listen for multiple events.
 */
@Component
public class MessageListenerAsAnnotation {
    private static final Logger log = LoggerFactory.getLogger(MessageListenerAsAnnotation.class);
    @EventListener
    public void onApplicationEvent(MessageEvent event) {
        log.info("onApplicationEvent:MessageEvent({})", event);
    }
    @EventListener
    public void onApplicationEvent(DateTimeEvent event) {
        log.info("onApplicationEvent:DateTimeEvent({})", event.getDateTime());
    }

    @EventListener
    public void onApplicationEvent(ContextStartedEvent event) {
        log.info("context started {}", event);
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("context refresh {}", event);
    }

    @EventListener
    public void onApplicationEvent(ContextStoppedEvent event) {
        log.info("context stopped {}", event);
    }
    @EventListener
    public void onApplicationEvent(ContextClosedEvent event) {
        log.info("context closed {}", event);
    }
}
