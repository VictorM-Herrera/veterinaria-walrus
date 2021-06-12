package veterinaria.utils;

import java.util.Scanner;

public class Menu {
    Scanner scan;

    public void menu() {
        scan = new Scanner(System.in);
        int option; //opcion del usuario
        int option2; //opcion del menu del cliente
        int option3; //opcion del menu de agenda
        int option4; //opcion del menu de tienda



        do {
            //Llamamos al primer menu
            option = firstMenu();

            switch (option) {
                case 1:
                    do{
                        option2 = clientMenu();

                        switch (option2){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                option2= 0;
                                    break;
                        }
                    } while (option2 != 0);
                    break;
                case 2:
                    do{
                        option3 = scheduleMenu();

                        switch (option3){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                option3 = 0;
                                break;
                        }
                    } while(option3 != 0);
                    break;
                case 3:
                    do{
                       option4 = storeMenu();

                       switch (option4){
                           case 1:
                               break;
                           case 2:
                               break;
                           case 3:
                               break;
                           case 4:
                               break;
                           case 5:
                               option4 = 0;
                               break;
                       }
                    } while(option4 != 0);
                    break;
                case 4:
                    option = 0;
                    break;
            }

        } while (option != 0);

        scan.close();
    }

    public int firstMenu() {
        int option;
        System.out.println("1 - Menu de clientes/Mascotas");
        System.out.println("2 - Agenda");
        System.out.println("3 - Tienda");
        System.out.println("4 - Salir");
        option = scan.nextInt();

        return option;
    }

    public int clientMenu() {
        int option;
        System.out.println("1 - Registrar cliente");
        System.out.println("2 - Buscar cliente");
        System.out.println("3 - Modificar cliente");
        System.out.println("4 - Eliminar cliente");
        System.out.println("5 - Volver al menu");
        option = scan.nextInt();

        return option;
    }

    public int scheduleMenu() {
        int option;
        System.out.println("1 - Registrar cita");
        System.out.println("2 - Buscar cita");
        System.out.println("3 - Modificar cita");
        System.out.println("4 - Eliminar cita");
        System.out.println("5 - Volver al menu");
        option = scan.nextInt();

        return option;
    }

    public int storeMenu() {
        int option;
        System.out.println("1 - Registrar producto");
        System.out.println("2 - Buscar producto");
        System.out.println("3 - Modificar producto");
        System.out.println("4 - Eliminar producto");
        System.out.println("5 - Volver al menu");
        option = scan.nextInt();

        return option;
    }
}



