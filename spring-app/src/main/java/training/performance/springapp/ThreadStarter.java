package training.performance.springapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ThreadStarter implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(ThreadStarter.class);

    @Override

    public void run(final ApplicationArguments args) throws Exception {
        for (int i = 0; i < 5; i++) {
            MyThread threadLoc = new MyThread();
            threadLoc.setName("MyThread-" + i);
            threadLoc.start();
        }
    }


    public static class MyThread extends Thread {
        private        long             counter;
        private static Object           object = new Object();
        private static Map<String, Car> map    = new ConcurrentHashMap<>(100_000_000,
                                                                         0.9f,
                                                                         10_000);

        @Override
        public void run() {
            while (true) {
                try {
                    counter++;
                    String stringLoc = "deneme" + counter + "test";
                    if (counter % 10_000 == 0) {
                        map.put("bwm" + counter,
                                Car.builder()
                                   .withName("bwm" + counter)
                                   .withHp(180)
                                   .withYear(2016)
                                   .withModel("5")
                                   .withLocation("istanbul")
                                   .build());
//                        synchronized (object) {
//                            Thread.sleep(1_000);
//                        }
                        // Thread.sleep(0, 1_000);
                    }
                    if (counter % 1_000_000 == 0) {
                        System.out.println("%%%%%%% SIZE %%%%% : " + map.size());
                    }
                } catch (Exception exp) {
                    logger.error("[MyThread][run]-> *Error* : " + exp.getMessage(),
                                 exp);
                }
            }
        }
    }

}
