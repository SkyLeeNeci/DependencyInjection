package karpenko.diploma.dependencyinjection;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class CarChassisModule {

    private int weight;


    public CarChassisModule(int weight) {
        this.weight = weight;
    }

    @Provides
     CarChassi provideCarChassis(){
        Log.d(CarUtils.TAG, "Car chassis " + weight);
        return new CarChassi();
    }

}
