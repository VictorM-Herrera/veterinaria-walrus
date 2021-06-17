package com.jmissart.models.animals;


public class Cat extends Pet {

    public Cat(){
        super();
    }

    public Cat(String name, int age, char sex,float weight, float height, String dniOwner){
        super(name, age, sex, weight, height, dniOwner);
    }


    @Override
    public String getRace() {
        return "Gato";
    }
}
