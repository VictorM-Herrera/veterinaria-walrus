package com.jmissart.models;

public abstract class Pet {
    private String name;
    private int age;
    private char sex;//m o f
    private String race;

    public Pet()
    {
        name="";
        age=0;
        sex='m';
        race="";
    }
    public Pet(String name, int age, char sex)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public abstract String getRace();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", race=" + getRace() +
                '}';
    }
}
