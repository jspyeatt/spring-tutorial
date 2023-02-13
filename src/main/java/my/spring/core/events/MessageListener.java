package my.spring.core.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * The downside of this way of listening to events is that you can only listen to one event type.
 *
 * The @EventListener annotation is a better way.
 */
@Component
public class MessageListener implements ApplicationListener<MessageEvent> {
    private static final Logger log = LoggerFactory.getLogger(MessageListener.class);

    @Override
    public void onApplicationEvent(MessageEvent event) {
        log.info("onApplicationEvent() : {} {}", event.getSource(), event.getTimestamp());
    }
}
