package fr.polytech.team.n;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double amount;
    private Calendar creationDate;
    private BillStatus status;
    @ElementCollection
    private Set<Package> packages = new HashSet<>();
    @ManyToOne
    private Shipper shipper;

    public Bill(){ }

    public Bill(Long id, double amount) {
        this.id = id;
        this.amount = amount;
        this.creationDate = Calendar.getInstance();
        this.status = BillStatus.PENDING;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BillStatus getStatus() {
        return status;
    }

    public void setStatus(BillStatus status) {
        this.status = status;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public Set<Package> getPackages() {
        return packages;
    }

    public void setPackages(Set<Package> packages) {
        this.packages = packages;
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
        Bill bill = (Bill) o;
        return id.equals(bill.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, creationDate);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "amount=" + amount +
                ", creationDate=" + creationDate +
                ", status=" + status +
                '}';
    }
}