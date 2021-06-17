package com.jmissart.models;

public abstract class Person {
    private String name;
    private String lastName;
    private String DNI;
    private String phone;
    private String address;
    private boolean status;

    public Person() {
        name = "";
        lastName = "";
        DNI = "";
        phone = "";
        address = "";
        status = true;
    }

    public Person(String name, String lastName, String DNI, String phone, String address)
    {
        this.name = name;
        this.lastName = lastName;
        this.DNI = DNI;
        this.phone = phone;
        this.address=address;
        status = true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DNI='" + DNI + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
