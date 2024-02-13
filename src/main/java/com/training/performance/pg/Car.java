package com.training.performance.pg;

import java.util.Objects;

public class Car {

    private String  name;
    private Integer hp;
    private String  name1;
    private Integer hp1;
    private String  name2;
    private Integer hp2;
    private String  name3;
    private Integer hp3;
    private String  name4;
    private Integer hp4;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(final Integer hpParam) {
        this.hp = hpParam;
    }

    @Override
    public boolean equals(final Object oParam) {
        if (this == oParam) {
            return true;
        }
        if (oParam == null || getClass() != oParam.getClass()) {
            return false;
        }
        Car carLoc = (Car) oParam;
        return Objects.equals(name,
                              carLoc.name)
               && Objects.equals(hp,
                                 carLoc.hp)
               && Objects.equals(name1,
                                 carLoc.name1)
               && Objects.equals(hp1,
                                 carLoc.hp1)
               && Objects.equals(name2,
                                 carLoc.name2)
               && Objects.equals(hp2,
                                 carLoc.hp2)
               && Objects.equals(name3,
                                 carLoc.name3)
               && Objects.equals(hp3,
                                 carLoc.hp3)
               && Objects.equals(name4,
                                 carLoc.name4)
               && Objects.equals(hp4,
                                 carLoc.hp4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
                            hp,
                            name1,
                            hp1,
                            name2,
                            hp2,
                            name3,
                            hp3,
                            name4,
                            hp4);
    }
}
