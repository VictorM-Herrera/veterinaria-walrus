package com.jmissart.models.schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.jmissart.models.people.Client;
import com.jmissart.utils.ICollections;

public class Schedule implements ICollections{
    Scanner scan = new Scanner(System.in);


    private ArrayList<Turn> turnList;

    //Constructor Vacio
    public Schedule() {
        turnList = new ArrayList<Turn>();
    }


    @Override
    //Funcion que agrega un turno en el ArrayList de tipo Turn
    public void add(Object e) {
        if (e instanceof Turn){
            turnList.add((Turn) e);
        }else{
            System.out.println("No se pudo agregar el elemento");
        }
    }

    @Override
    public void create(Object e) {
        //Variable auxiliar tipo Turn
        Turn turn = new Turn();
        String reason = "";

        if (e instanceof Client){ //Si es de tipo turno el objeto recibido se lo asignamos
            turn.setClient((Client) e);
        }

        turn.setDate(new Date()); //Asignamos la fecha actual

        System.out.println("Ingrese la Razon del turno"); //Preguntamos razon del turno
        reason = scan.nextLine();
        turn.setReason(reason);

        turnList.add(turn); //Agregamos el turno a la lista
    }

    @Override
    public String showCollection() {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<turnList.size();i++){
            builder.append(turnList.toString());
        }
        return builder.toString();
    }

    @Override
    public void update(Object e) {

    }

    @Override
    public Object search(String data) {
        Object found = null;
        for (int i=0; i<turnList.size(); i++){
            //if(data.equals(turnList.get(i).getClient().))
        }
        return null;
    } //FUNCION SIN TERMINAR, FALTA GETTER DEL CLIENTE

    @Override
    public String showElementByX(String data) {
        return null;
    }

    @Override
    public void remove(Object e) {

    }

    @Override
    public String toString() {
        return "Schedule{" +
                "turnList=" + turnList +
                '}';
    }
}
