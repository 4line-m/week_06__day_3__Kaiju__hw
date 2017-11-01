package com.example.alinemokfa.kaiju;

/**
 * Created by alinemokfa on 01/11/2017.
 */

public abstract class Kaiju{
    String name;
    int healthVal;
    int attackVal;

    public Kaiju(String name, int healthVal, int attackVal){
        this.name = name;
        this.healthVal = healthVal;
        this.attackVal = attackVal;
    }

    public String getName(){
        return this.name;
    }

    public int getAttackVal(){
        return this.attackVal;
    }

    public int getHealthVal(){
        return this.healthVal;
    }

}