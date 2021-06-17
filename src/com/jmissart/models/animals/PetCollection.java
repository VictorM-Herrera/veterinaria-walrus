package com.jmissart.models.animals;

import com.jmissart.models.animals.Pet;

import java.util.ArrayList;

public class PetCollection<E extends Pet> {

    private ArrayList<E> petList;

    public PetCollection() {
        petList = new ArrayList<E>();
    }
}
