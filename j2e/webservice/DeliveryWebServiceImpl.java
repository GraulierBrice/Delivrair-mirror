import java.util.Calendar;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
@WebService(targetNamespace = "deliveryWebService")
@Stateless(name = "DeliveryWS")
public class DeliveryWebServiceImpl implements DeliveryWebService {

	@EJB private PlanningManager pm;

	@Override
	public String planDelivery(int calendar, int idPackage) {
        return pm.plan(calendar, idPackage);
    }
}