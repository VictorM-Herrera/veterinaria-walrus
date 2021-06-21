package com.jmissart.models.people;

import com.jmissart.models.exception.NotAClientObjectExcpetion;
import com.jmissart.utils.ICollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

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
    public void create() {
        // TODO verificar si ya existe con hashCode, verificaciones en general.
        Scanner scan = new Scanner(System.in);
        String name, lastName, DNI, phone, address, paymentMethod;
        System.out.println("Nombre: ");
        name = scan.nextLine();
        System.out.println("Apellido: ");
        lastName = scan.nextLine();
        System.out.println("DNI: ");
        DNI = scan.nextLine();
        System.out.println("Teléfono: ");
        phone = scan.nextLine();
        System.out.println("Dirección: ");
        address = scan.nextLine();
        System.out.println("Forma de Pago: ");
        paymentMethod = scan.nextLine();
        Client aux = new Client(name, lastName, DNI, phone, address, paymentMethod);

        if(aux != null) {
            clientSet.add(aux);
        }
    }

    @Override
    public String showCollection() {
        StringBuilder builder = new StringBuilder();
        Iterator<Client> it = clientSet.iterator();
        while (it.hasNext())
        {
            Client aux = (Client)it.next();
            builder.append(aux+"\n");
        }
        return builder.toString();
    }

    @Override
    public void update(Object e) {

    }

    @Override
    public Object search(String data) {
        Iterator<Client> it = clientSet.iterator();
        Client found = null;
        while (it.hasNext())
        {
            Client aux = (Client)it.next();
            if(aux.getDNI().equals(data)) {
                found = aux;
                break;
            }
        }
        return found;
    }

    @Override
    public String showElementByX(String data) {
        return null;
    }

    @Override
    public void remove(Object e) {

    }
}
