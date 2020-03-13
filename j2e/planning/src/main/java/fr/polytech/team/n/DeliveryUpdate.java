package fr.polytech.team.n;

import javax.ejb.Local;

@Local
public interface DeliveryUpdate {
    void update(Drone drone);
}