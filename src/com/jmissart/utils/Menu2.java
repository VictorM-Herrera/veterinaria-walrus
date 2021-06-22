package com.jmissart.utils;

//1 - Clientes y Mascotas
//'ingrese dni'
//1.1 Cliente
//1.1.1 Ver Datos del Cliente
//1.1.2 Modificar
//1.1.3 Eliminar
//1.2 Mascotas
//1.2.1 Buscar y Mostrar lista de mascotas
//1.2.2 Modificar Lista de Mascotas (Elegir cual mascota dentro)
//1.2.3 Eliminar Mascota
//1.2.4 Registrar Mascota
//1.3 Agenda
//1.3.1 Crear Turno
//1.3.2 Eliminar Turno
//1.3.3 Modificar Turno
//2 - Tienda
//// TODO WIP
//3 - Ver Turnos
//// Mostrar Lista de Turnos

import com.jmissart.models.people.Client;
import com.jmissart.models.people.ClientCollection;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class Menu2 {
    Scanner scan;
    ClientCollection clientCollection;
    FileInputStream fis;
    ObjectInputStream fois;
    File file;
    FileOutputStream fos;
    ObjectOutputStream fobj;
    String collectionList;

    public void Menu2() {
        scan = new Scanner(System.in);
        clientCollection = new ClientCollection();
        file = new File("Clients.dat");
        if (file.exists()) {
            loadClientsFile();
        }
        int option;

        do {
        System.out.println("~~~ Veterinaria Walrus ~~~");

        option = baseMenu();

        switch(option) {
            case 1:
                clientPetMenu();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                collectionList = clientCollection.showCollection();
                System.out.println(collectionList);
                break;
        }

        }while(option != 0);

    }

    private int baseMenu() {
        int option;
        System.out.println("1 - Menu de clientes/Mascotas");
        System.out.println("2 - Tienda");
        System.out.println("3 - Ver Turnos");
        System.out.println("4 - Ver Clientes");
        System.out.println("0 - Salir");
        option = scan.nextInt();

        return option;
    }

    private void clientPetMenu() {
        int option;
        String DNI;
        System.out.println("Ingrese DNI del Cliente: ");
        DNI = scan.next();
        System.out.println("1 - Menú del Cliente");
        System.out.println("2 - Menú de Mascotas");

        option = scan.nextInt();
        switch (option) {
            case 1:
                clientMenu(DNI);
                break;
            case 2:
                break;
        }
    }

    private void clientMenu(String DNI) {
        int option, verification;
        Client aux;
        verification = verifyClient(DNI);

        if (verification == 0) {
            System.out.println("El DNI " + DNI + " no se encuentra en el sistema, ingrese los datos para registrar al cliente.");
            clientCollection.create(DNI);
        } else {
            do {
                aux = (Client) clientCollection.search(DNI);
                System.out.println("Menú de Cliente " + aux.getName() + " " + aux.getLastName() + ".");
                System.out.println("1 - Buscar y Mostrar datos del Cliente actual.");
                System.out.println("2 - Modificar Cliente.");
                System.out.println("3 - Eliminar Cliente.");

                option = scan.nextInt();
                switch (option) {
                    case 1:
                        clientCollection.showElementByX(DNI);
                        break;
                    case 2:
                        break;
                    case 3:
                        clientCollection.clientSet.remove(aux); // Remueve el viejo cliente
                        clientCollection.remove(aux); // Configura el nuevo estado del cliente y lo actualiza.
                        break;
                }
            }while(option != 0);
        }
    }

    // Verifica si el cliente ya existe en nuestro sistema, devuelve 0 si no existe, y devuelve 1 si ya existe.
    private int verifyClient(String DNI) {
        Client aux = null;
        int result;
        aux = (Client) clientCollection.search(DNI);
        if (aux == null) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }

    private void loadClientsFile() {
        try {
            fis = new FileInputStream("Clients.dat");
            fois = new ObjectInputStream(fis);
            Client client;
            do {
                client = (Client) fois.readObject();
                if(client != null) {
                    clientCollection.clientSet.add(client);
                    System.out.println("Cliente cargado");
                }
            }while( (client = (Client) fois.readObject()) != null);

        } catch (EOFException e) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
