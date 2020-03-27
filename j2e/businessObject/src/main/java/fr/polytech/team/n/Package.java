package fr.polytech.team.n;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Shipper shipper;

    public Package(){}

    public Package(Long id, String address, Customer customer) {
        this.id = id;
        this.address = address;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Shipper getShipper() {
        return shipper;
    }

    public void setShipper(Shipper shipper) {
        this.shipper = shipper;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package aPackage = (Package) o;
        return getId() == aPackage.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Package{" +
                "address='" + address + '\'' +
                ", customer=" + customer +
                '}';
    }
}