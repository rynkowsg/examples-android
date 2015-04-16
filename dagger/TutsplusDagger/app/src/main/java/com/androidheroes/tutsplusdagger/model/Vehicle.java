package com.androidheroes.tutsplusdagger.model;

import javax.inject.Inject;

/**
 * Created by grzecho on 4/16/15.
 */
public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor){
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
