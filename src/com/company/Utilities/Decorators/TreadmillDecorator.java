package com.company.Utilities.Decorators;

import com.company.Domain.Equipment.Implementations.Treadmill;

public class TreadmillDecorator {

    protected Treadmill treadmill;

    public TreadmillDecorator (Treadmill treadmill){
        this.treadmill = treadmill;
    }

    public void activate(int speed){
        System.out.println("The treadmill is moving at "+ speed +" km/h");
    }
}
