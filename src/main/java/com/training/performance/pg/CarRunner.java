package com.training.performance.pg;

import java.util.ArrayList;
import java.util.List;

public class CarRunner {

    private final List<Car> cars = new ArrayList<>();

    public static void main(final String[] args) {
        Car carLoc = new Car();
        CarRunner carRunnerLoc = new CarRunner();
        carLoc = null;
        carRunnerLoc.myMethod();
    }

    public void myMethod() {
        int a = 100;
        Integer ai = 100;
        Car carLoc = null;
        for (int iLoc = 0; iLoc < 1_000_000_000; iLoc++) {
            carLoc = new Car();
            this.cars.add(carLoc);
            if ((iLoc % 1_000) == 0) {
                Thread.yield();
            }
        }
        try {
            Thread.sleep(10_000_000L);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
