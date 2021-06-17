package com.jmissart.models.animals;

public abstract class Pet {
    private String name;
    private int age;
    private char sex;//m o f
    private String race;
    private float weight;
    private float height;
    private String dniOwner;
    private boolean status;//true=exist or false=removed

    public Pet()
    {
        name="";
        age=0;
        sex='m';
        race="";
        weight= 0f;
        height= 0f;
        dniOwner= "";
        status=true;
    }
    public Pet(String name, int age, char sex,float weight, float height, String dniOwner)
    {
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.weight= weight;
        this.height= height;
        this.dniOwner=dniOwner;
        status=true;
    }
    public abstract String getRace();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", dniOwner='" + dniOwner + '\'' +
                ", status=" + status +
                '}';
    }
}