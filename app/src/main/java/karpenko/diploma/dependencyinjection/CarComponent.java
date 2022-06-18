package karpenko.diploma.dependencyinjection;

import dagger.Component;

@Component(modules = {CarChassisModule.class, LithiumIonBatteryModule.class})
public interface CarComponent {

    /*Car getCar();*/

    void inject(MainActivity mainActivity);

}
