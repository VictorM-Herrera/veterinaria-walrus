package com.jmissart;

import com.jmissart.models.people.Client;
import com.jmissart.models.schedule.Schedule;
import com.jmissart.models.schedule.Turn;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        Menu mainMenu = new Menu();
        mainMenu.menu();*/

        Client julian = new Client("");
        Schedule schedule;
        schedule = new Schedule();


        Turn turno, turno2;
        turno = new Turn(julian,"lala",new Date());
        turno2 = new Turn(julian,"lala2",new Date());
        //System.out.println(turno.toString());

        schedule.add(turno);
        schedule.add(turno2);
        System.out.println(schedule.showCollection());




    }
}