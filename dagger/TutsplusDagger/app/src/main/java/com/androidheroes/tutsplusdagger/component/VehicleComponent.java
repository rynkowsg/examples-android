package com.androidheroes.tutsplusdagger.component;

import com.androidheroes.tutsplusdagger.model.Vehicle;
import com.androidheroes.tutsplusdagger.module.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by grzecho on 4/16/15.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
