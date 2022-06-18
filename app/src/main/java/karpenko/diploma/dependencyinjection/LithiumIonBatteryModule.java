package karpenko.diploma.dependencyinjection;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class LithiumIonBatteryModule {

    @Provides
    CarBattery provideCarBattery( LithiumIonBattery lithiumIonBattery){
        lithiumIonBattery.logBatteryType();
        return lithiumIonBattery;
    }

}
