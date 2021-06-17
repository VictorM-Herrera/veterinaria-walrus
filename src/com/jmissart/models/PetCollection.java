package com.jmissart.models;

import com.jmissart.utils.IPetCollection;

import java.util.ArrayList;

public class PetCollection<E extends Pet> implements IPetCollection<E> {

    private ArrayList<E> petList;

    public PetCollection() {
        petList = new ArrayList<E>();
    }


    @Override
    public void add(Pet pet) {
        petList.add((E) pet);
    }

    @Override
    public void remove(Pet pet) {
        petList.remove(pet);
    }

    @Override
    public int count() {
        return petList.size();
    }

    @Override
    public String list() {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < petList.size(); i++) {
            builder.append(petList.get(i).toString());
        }

        return builder.toString();
    }
}
