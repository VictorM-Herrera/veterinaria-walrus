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
    //Constructor Vacio
    public Turn() {

    }

    public Client getClient() {
        return client;
    }

    public String getReason() {
        return reason;
    }

    public Date getDate() {
        return date;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Turn{" + super.toString() +
                "client=" + client +
                ", reason='" + reason + '\'' +
                ", date=" + date +
                '}';
    }
}
