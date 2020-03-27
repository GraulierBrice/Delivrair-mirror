package fr.polytech.team.n;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private long flightTime;
    private int battery;
    private DroneStatus status;

    public Drone(){}

    public Drone(Long id, long flightTime, int battery, DroneStatus status) {
        this.id = id;
        this.flightTime = flightTime;
        this.battery = battery;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(long flightTime) {
        this.flightTime = flightTime;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public DroneStatus getStatus() {
        return status;
    }

    public void setStatus(DroneStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drone drone = (Drone) o;
        return getId() == drone.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Drone{" +
                "flightTime=" + flightTime +
                ", battery=" + battery +
                ", status=" + status +
                '}';
    }
}