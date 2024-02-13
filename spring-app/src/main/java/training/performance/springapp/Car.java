package training.performance.springapp;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;


@Data
@NoArgsConstructor
public class Car {

    private String  name;
    private Integer hp;
    private String  model;
    private Integer year;
    private String  location;

    @Builder(setterPrefix = "with")
    public Car(final String name,
               final Integer hp,
               final String model,
               final Integer year,
               final String location) {
        this.name     = name;
        this.hp       = hp;
        this.model    = model;
        this.year     = year;
        this.location = location;
    }
}
