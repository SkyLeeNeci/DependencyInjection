package karpenko.diploma.dependencyinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;
    CarComponent carComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*EngineFlap e = new EngineFlap();
        CarEngine carEngine = new CarEngine(e);
        CarBattery carBattery = new CarBattery();
        CarChassi carChassi = new CarChassi();*/

        /*carComponent = DaggerCarComponent.create();*/
        carComponent = DaggerCarComponent.builder()
                .carChassisModule(new CarChassisModule(123)).build();
        /*car = carComponent.getCar();*/
        carComponent.inject(this);


        car.move();
    }
}