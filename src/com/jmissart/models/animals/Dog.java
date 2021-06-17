package com.jmissart.models;

public class Dog extends Pet{

    public Dog() {
        super();
    }

    public Dog(String name, int age, char sex,float weight, float height, String dniOwner) {
        super(name, age, sex, weight, height, dniOwner);
    }

    @Override
    public String getRace() {
        return "Perro";
    }
}
