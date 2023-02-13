package my.spring.core.events;

import org.springframework.context.ApplicationEvent;

import java.util.Calendar;
import java.util.Date;

public class DateTimeEvent extends ApplicationEvent {
    private final Date dateTime;
    public DateTimeEvent(Object source) {
        super(source);
        this.dateTime = Calendar.getInstance().getTime();
    }

    public Date getDateTime() {
        return dateTime;
    }
}
