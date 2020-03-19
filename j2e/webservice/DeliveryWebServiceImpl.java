package webservice;

import java.util.Calendar;

@WebService(targetNamespace = "todo.fr")
@Stateless(name = "DeliveryWS")
public class DeliveryWebServiceImpl implements DeliveryWebService {

	@EJB(name="stateless-delivery") private PlanningManager pm;

	@Override
	public String planDelibery(int calendar, int idPackage) {
        return pm.plan(calendar, id);
    }
}