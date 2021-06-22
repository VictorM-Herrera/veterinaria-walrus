package com.jmissart.models.people;

import com.jmissart.models.exception.NotAClientObjectExcpetion;
import com.jmissart.utils.ICollections;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ClientCollection implements ICollections {
    public HashSet<Client> clientSet;
    FileOutputStream fos;
    ObjectOutputStream fobj;
    File file;

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
    public void create(String e) {
        // TODO verificar si ya existe con hashCode, verificaciones en general.
        Scanner scan = new Scanner(System.in);
        String name, lastName, DNI, phone, address, paymentMethod;
        DNI = e;
        System.out.println("Nombre: ");
        name = scan.nextLine();
        System.out.println("Apellido: ");
        lastName = scan.nextLine();
        System.out.println("Teléfono: ");
        phone = scan.nextLine();
        System.out.println("Dirección: ");
        address = scan.nextLine();
        System.out.println("Forma de Pago: ");
        paymentMethod = scan.nextLine();
        Client aux = new Client(name, lastName, DNI, phone, address, paymentMethod);

        if(aux != null) {
            writeClient(aux);
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
            if(aux.isStatus()) {
                builder.append(aux).append("\n");
            }
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
    public void showElementByX(String data) {
        Iterator<Client> it = clientSet.iterator();
        Client found = null;
        while (it.hasNext())
        {
            Client aux = (Client)it.next();
            if(aux.getDNI().equals(data)) {
                found = aux;
                System.out.println(found.toString());
                break;
            }
        }
    }

    @Override
    public void remove(Object e) {
        if(e instanceof Client) {
            ((Client) e).setStatus(false);
            clientSet.add((Client) e);
        }
    }

    private void writeClient(Client c) { // Recibimos un cliente c
        file = new File("Clients.dat");
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println(file.getName() + " ha sido creado.");
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fos = new FileOutputStream("Clients.dat"); // Inicializamos el constructor del archivo
            fobj = new ObjectOutputStream(fos); // Inicializamos el OutputStream de Objetos y le pasamos el constructor del archivo)
            fobj.writeObject(c); // Guardamos el objeto.
        }
        catch(FileNotFoundException e) { // Excepcion para Archivos
            e.printStackTrace();
        } catch (IOException e) { // Excepcion de no se que
            e.printStackTrace();
        }
        finally { // Cerramos los streams de outputs
            try{
                fos.close();
                fobj.close();
            }
            catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}

