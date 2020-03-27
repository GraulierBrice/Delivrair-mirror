package fr.polytech.team.n;

import java.util.Calendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "DeliveryWebService", targetNamespace = "http://www.n.team.polytech.fr/deliverywebservice/")
public interface DeliveryWebService {

    @WebMethod
    @WebResult(name = "package_information")
    String planDelivery(@WebParam(name = "calendar") int calendar, @WebParam(name = "idPackage") Long idPackage);
}