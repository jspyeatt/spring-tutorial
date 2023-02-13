package my.spring.core.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

public class MessageEvent extends ApplicationEvent {
    private static final Logger log = LoggerFactory.getLogger(MessageEvent.class);
    private static AtomicInteger messageCounter = new AtomicInteger(0);
    public MessageEvent(String source) {
        super(generateMessage(source));
    }
    private static String generateMessage(String src) {
        StringBuilder sb = new StringBuilder(src).append(" ");
        sb.append(Calendar.getInstance().getTime()).append(" counter ");
        sb.append(messageCounter.incrementAndGet());
        return sb.toString();
    }
}
