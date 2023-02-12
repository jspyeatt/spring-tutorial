package my.spring.core.executors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfiguration.class);

        context.getBean(SpringTaskExecutor.class).doExecute(new MyRunnable(3,1500));
        context.getBean(SpringTaskExecutor.class).doExecute(new MyRunnable(2,2500));
        context.getBean(SpringTaskExecutor.class).doExecute(new MyRunnable(4,500));
        context.getBean(SpringTaskExecutor.class).doExecute(new MyRunnable(3,1000));

    }
}
