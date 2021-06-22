package com.jmissart.models.people;

import java.io.Serializable;

public abstract class Person implements Serializable {
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

    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
