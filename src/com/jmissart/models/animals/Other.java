package com.jmissart.models;

public class Other extends Pet{
    private String specie;

    public Other(){
        super();
    }

    @Override
    public String getRace() {
        return specie;
    }
}
