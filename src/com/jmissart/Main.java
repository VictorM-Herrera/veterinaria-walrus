package com.jmissart;

import com.jmissart.models.people.Client;
import com.jmissart.models.people.ClientCollection;
import com.jmissart.models.schedule.Schedule;
import com.jmissart.models.schedule.Turn;
import com.jmissart.utils.Menu;
import com.jmissart.utils.Menu2;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Menu2 mainMenu = new Menu2();
        mainMenu.Menu2();

        /*
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
*/
  /*      Client julian = new Client("VISA");
        Turn turno = new Turn(julian, "lala", new Date());
        ClientCollection clientcoll = new ClientCollection();

        clientcoll.add(turno);
*/

        /*
        ClientCollection ct = new ClientCollection();
        ct.create();
        ct.create();

        System.out.println("Colección de clientes: ");


        Client asdf;
        asdf = (Client) ct.search("30");
        System.out.println("Cliente encontrado: " + (asdf.toString()));
*/

    }
}