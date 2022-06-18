package karpenko.diploma.dependencyinjection;

import android.util.Log;

import javax.inject.Inject;

public class LithiumIonBattery implements CarBattery{

    @Override
    public void logBatteryType() {
        Log.d(CarUtils.TAG, "Li-Ion Battery");
    }

    @Inject
    public LithiumIonBattery() {
    }
}
