package com.jmissart.models.animals;


public class Bird extends Pet {

    public Bird(){
        super();
    }

    public Bird(String name, int age, char sex,float weight, float height, String dniOwner){
        super(name, age, sex, weight, height, dniOwner);
    }


    @Override
    public String getRace() {
        return "Pajaro";
    }
}
