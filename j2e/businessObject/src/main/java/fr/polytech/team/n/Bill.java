package fr.polytech.team.n;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Bill {
    private int id;
    private double amount;
    private Calendar creationDate;
    private BillStatus status;
    private Set<Package> packages = new HashSet<>();

    public Bill(int id, double amount) {
        this.id = id;
        this.amount = amount;
        this.creationDate = Calendar.getInstance();
        this.status = BillStatus.PENDING;
    }
}