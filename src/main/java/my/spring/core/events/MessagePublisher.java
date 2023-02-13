package my.spring.core.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
public class MessagePublisher implements ApplicationEventPublisherAware {
    private static final Logger log = LoggerFactory.getLogger(MessagePublisher.class);
    private ApplicationEventPublisher publisher;
    private static Map<Integer, String> messages = Map.of(
            1, "msg 1",
            2, "msg 2",
            3, "msg 3",
            4, "msg 4",
            5, "msg 5");

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        publisher = applicationEventPublisher;
    }

    public void publishMessage() {

        new SimpleAsyncTaskExecutor().execute(() -> {
            for (int i = 0; i < 5; i++) {
                int id = new Random().nextInt(5);
                MessageEvent messageEvent = new MessageEvent(messages.get(++id));
                try {
                    log.info("publishMessage() {}", id);
                    publisher.publishEvent(messageEvent);
                    publisher.publishEvent(new DateTimeEvent(new Date()));
                    TimeUnit.MILLISECONDS.sleep(750);
                } catch (Exception e) {
                    // no opt
                }
            }
        });
    }
}
