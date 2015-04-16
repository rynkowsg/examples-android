package com.androidheroes.tutsplusdagger.module;

import com.androidheroes.tutsplusdagger.model.Motor;
import com.androidheroes.tutsplusdagger.model.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by grzecho on 4/16/15.
 */
@Module
public class VehicleModule {
    @Provides @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
