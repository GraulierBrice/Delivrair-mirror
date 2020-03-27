package fr.polytech.team.n;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lastName;
    private String firstName;
    @OneToMany(mappedBy = "customer")
    private Set<Package> packages;

    public Customer(){ }

    public Customer(Long id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Set<Package> getPackages() {
        return packages;
    }

    public void setPackages(Set<Package> packages) {
        this.packages = packages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return getId().equals(customer.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}