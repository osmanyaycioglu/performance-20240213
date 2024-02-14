package training.performance.springapp;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ScheduleMe {

    @Scheduled(fixedDelay = 1_000)
    public void method(){
        for (int i = 0; i < 1_000_000; i++) {
            String uuid = UUID.randomUUID().toString();
        }
    }

}
