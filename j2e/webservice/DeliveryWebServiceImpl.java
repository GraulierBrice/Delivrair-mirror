package fr.polytech.team.n;

import java.util.Calendar;

@WebService(targetNamespace = "lol.fr")
@Stateless(name = "DeliveryWS")
public class DeliveryWebServiceImpl implements DeliveryWebService {

	@EJB private PlanningManager pm;

	@Override
	public String planDelivery(int calendar, int idPackage) {
        return pm.plan(calendar, id);
    }
}