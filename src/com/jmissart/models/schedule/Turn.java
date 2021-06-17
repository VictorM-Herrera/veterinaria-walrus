package com.jmissart.models.schedule;

import com.jmissart.models.people.Client;

import java.util.ArrayList;
import java.util.Date;

public class Turn {
    private Client client;
    private String reason;
    private Date date;

    public Turn(Client client, String reason, Date date) {
        this.client = client;
        this.reason = reason;
        this.date = date;
    }

}
