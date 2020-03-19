package fr.polytech.team.n;

import java.util.Calendar;

public class Delivery {
    private int id;
    private Calendar date;

    public Delivery() {
    }

    public Delivery(int id, Calendar date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
}