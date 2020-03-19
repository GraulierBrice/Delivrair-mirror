package webservice;

import java.util.Calendar;

import javax.jws.WebResult;

@WebService(name = "DeliveryWebService", targetNamespace = "todo.fr")
public interface DeliveryWebService {

    @WebMethod
    @WebResult(name = "package_information")
	String planDelibery(@WebParam(name = "calendar") Calendar calendar,
							   @WebParam(name = "idPackage") int idPackage);
}