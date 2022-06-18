package karpenko.diploma.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private CarEngine carEngine;
    private CarBattery carBattery;
    private CarChassi carChassi;

    @Inject
    public Car(CarEngine carEngine, CarBattery carBattery, CarChassi carChassi) {
        this.carEngine = carEngine;
        this.carBattery = carBattery;
        this.carChassi = carChassi;
    }

    public void setCarChassi(CarChassi carChassi) {
        this.carChassi = carChassi;
    }

    public void move(){
        Log.d(CarUtils.TAG, "Car is Moving");
    }

}
