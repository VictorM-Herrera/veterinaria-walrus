package com.jmissart.utils;

import com.jmissart.models.Pet;

public interface IPetList<E extends Pet> {
    public void add(E pet);
    public void remove(E pet);
    public int count();
    public String list();
}
