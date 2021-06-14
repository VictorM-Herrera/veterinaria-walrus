package com.jmissart.models;

public class Dog extends Pet{

    public Dog() {
        super();
    }

    @Override
    public String getRace() {
        return "Perro";
    }
}
