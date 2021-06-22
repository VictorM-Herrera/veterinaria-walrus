package com.jmissart.models.animals;

import java.io.Serializable;
import java.util.ArrayList;

public class PetCollection<E extends Pet> implements Serializable {

    private ArrayList<E> petList;

    public PetCollection() {
        petList = new ArrayList<E>();
    }
}