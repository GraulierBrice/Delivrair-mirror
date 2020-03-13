package fr.polytech.team.n;

import javax.ejb.Local;
import java.util.Calendar;
import java.util.List;

@Local
public interface PlanningManager {

    boolean addDelivery(Calendar calendar, Package pack);


    //void cancelDelivery(Delivery delivery);
    //List<Delivery> getDeliveries();
}