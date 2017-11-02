package com.example.alinemokfa.kaiju;

/**
 * Created by alinemokfa on 01/11/2017.
 */

public class Godzilla extends Kaiju {

    public Godzilla(String name, int healthVal, int attackVal) {

        super(name, healthVal, attackVal);

    }

    public String roar(){
        return "ROAR";
    }
}