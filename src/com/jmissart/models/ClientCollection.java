package com.jmissart.models;

import com.jmissart.utils.IClientCollection;

import java.util.HashSet;

public class ClientCollection implements IClientCollection {
    private HashSet<Client> clientSet;

    ClientCollection() {
        clientSet = new HashSet<Client>();
    }

    @Override
    public void clientCreate() {

    }

    @Override
    public String clientList() {
        return null;
    }

    @Override
    public String clientListByDNI() {
        return null;
    }

    @Override
    public String clientUpdate() {
        return null;
    }

    @Override
    public void clientRemove() {

    }
}
