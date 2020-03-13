package fr.polytech.team.n;

import javax.ejb.Local;
import java.util.Calendar;
import java.util.List;

@Local
public interface DeliveryInformation {
    List<Delivery> getDeliveries(Calendar calendar);
}