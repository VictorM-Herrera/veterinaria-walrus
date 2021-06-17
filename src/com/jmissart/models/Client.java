package com.jmissart.models;

public class Client {
    private static int clientsQuantity = 0;
    private int id;
    private String paymentMethod;
    private PetCollection<Pet> petList;

    public Client() {
        clientsQuantity++;
        id = clientsQuantity;
        paymentMethod = "";
        petList = new PetCollection<Pet>();
    }

    public Client(String paymentMethod) {
        clientsQuantity++;
        id = clientsQuantity;
        this.paymentMethod = paymentMethod;
        petList = new PetCollection<Pet>();
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", petList=" + petList +
                '}';
    }
}
