package fr.polytech.team.n;

public class Package {
    private int id;
    private String address;
    private Customer customer;

    public Package(int id, String address, Customer customer) {
        this.id = id;
        this.address = address;
        this.customer = customer;
    }
}