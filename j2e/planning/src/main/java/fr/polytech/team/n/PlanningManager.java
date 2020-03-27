package fr.polytech.team.n;

import javax.ejb.Local;
import java.util.Calendar;
import java.util.List;

@Local
public interface PlanningManager {
    String plan(int calendar, Long id);

    boolean addDelivery(Calendar calendar, Package pack);

    void cancelDelivery(Delivery delivery);

    List<Delivery> getDeliveries();
}