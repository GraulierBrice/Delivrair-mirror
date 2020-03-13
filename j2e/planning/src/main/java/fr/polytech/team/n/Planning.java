package fr.polytech.team.n;

import javax.ejb.Local;
import java.util.Calendar;
import java.util.List;

@Local
public class Planning implements PlanningManager {
    
    private PackageInformation packageInformation;

// Temporaire pour le MVP
    @Override
    public String plan(Calendar calendar, int id) {
        Package pack = packageInformation.getPackageById(id);
        return pack.toString();
    }

    @Override
    public boolean addDelivery(Calendar calendar, Package pack) {
        return false;
    }

    @Override
    public void cancelDelivery(Delivery delivery) {
        return;
    }

    @Override
    public List<Delivery> getDeliveries() {
        return null;
    }


}
