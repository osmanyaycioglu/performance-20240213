package training.performance.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAppApplication.class,
                              args);

        Car buildLoc = Car.builder()
                          .withName("bwm")
                          .withHp(180)
                          .withYear(2016)
                          .withModel("5")
                          .withLocation("istanbul")
                          .build();

        Car carLoc = new Car();
        carLoc.setName("bwm");
        String a = args[0];
        carLoc.setHp(180);

        List<String> listLoc = List.of("osman",
                                       "ali",
                                       "veli",
                                       "mehmet");

        List<Car> collectLoc = listLoc.parallelStream()
                                      .map(s -> Car.builder()
                                                   .withName(s)
                                                   .build())
                                      .collect(Collectors.toList());

    }

}
