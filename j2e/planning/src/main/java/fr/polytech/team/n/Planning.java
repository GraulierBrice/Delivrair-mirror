package fr.polytech.team.n;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;


@Stateless
public class Planning implements PlanningManager
{

    @EJB
    protected Set<Delivery> planningSet = new TreeSet<Delivery>();

    @Override
    public boolean addDelivery(Calendar calendar, Package pack){
        planningSet.add(new Delivery(3l, calendar));
        return false;
    }


}
