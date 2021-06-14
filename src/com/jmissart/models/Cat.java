package com.jmissart.models;

public class Cat extends Pet{

    public Cat(){
        super();
    }


    @Override
    public String getRace() {
        return "Gato";
    }
}
