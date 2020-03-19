import java.util.Calendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "DeliveryWebService", targetNamespace = "lol.fr")
public interface DeliveryWebService {

    @WebMethod
    @WebResult(name = "package_information")
    String planDelivery(@WebParam(name = "calendar") Calendar calendar, @WebParam(name = "idPackage") int idPackage);
}