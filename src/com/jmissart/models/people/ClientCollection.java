package com.jmissart.models.people;

import com.jmissart.models.exception.NotAClientObjectExcpetion;
import com.jmissart.utils.ICollections;

import java.util.HashSet;

public class ClientCollection implements ICollections {
    private HashSet<Client> clientSet;

    public ClientCollection() {
        clientSet = new HashSet<Client>();
    }


    @Override
    public void add(Object e) {
        try {
            if (e instanceof Client) {
                clientSet.add((Client) e);
            } else {
                throw new NotAClientObjectExcpetion("El objeto no es un cliente.");
            }
        }catch(NotAClientObjectExcpetion ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void create(Object e) {

    }

    @Override
    public String showCollection() {
        return null;
    }

    @Override
    public void update(Object e) {

    }

    @Override
    public Object search(String data) {
        return null;
    }

    @Override
    public String showElementByX(String data) {
        return null;
    }

    @Override
    public void remove(Object e) {

    }
}
