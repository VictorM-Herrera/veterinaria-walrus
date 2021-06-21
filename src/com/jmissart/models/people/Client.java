package com.jmissart.models.people;

import com.jmissart.models.animals.PetCollection;
import com.jmissart.models.animals.Pet;

public class Client extends Person {
    private static int clientsQuantity = 0;
    private int id;
    private String paymentMethod;
    private PetCollection<Pet> petList;

    public Client() {
        super();
        clientsQuantity++;
        id = clientsQuantity;
        paymentMethod = "";
        petList = new PetCollection<Pet>();
    }

    public Client(String name, String lastName, String DNI, String phone, String address, String paymentMethod) {
        super(name, lastName, DNI, phone, address);
        clientsQuantity++;
        id = clientsQuantity;
        this.paymentMethod = paymentMethod;
        petList = new PetCollection<Pet>();
    }

    public static int getClientsQuantity() {
        return clientsQuantity;
    }

    public static void setClientsQuantity(int clientsQuantity) {
        Client.clientsQuantity = clientsQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PetCollection<Pet> getPetList() {
        return petList;
    }

    public void setPetList(PetCollection<Pet> petList) {
        this.petList = petList;
    }

    // TODO mostrar lista de mascotas
    @Override
    public String toString() {
        return super.toString() + "Client{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", petList=" + petList +
                '}';
    }
}
