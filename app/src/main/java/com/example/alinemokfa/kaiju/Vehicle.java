package com.example.alinemokfa.kaiju;

/**
 * Created by alinemokfa on 02/11/2017.
 */

public abstract class Vehicle {
    String type;
    int healthVal;

    public Vehicle(String tupe, int healthVal) {
        this.type = type;
        this.healthVal = healthVal;
    }

    public String getType() {
        return this.type;
    }
}