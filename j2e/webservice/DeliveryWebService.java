package fr.polytech.team.n;

import java.util.Calendar;

import javax.jws.WebResult;

@WebService(name = "DeliveryWebService", targetNamespace = "lol.fr")
public interface DeliveryWebService {

    @WebMethod
    @WebResult(name = "package_information")
    String planDelivery(@WebParam(name = "calendar") Calendar calendar, @WebParam(name = "idPackage") int idPackage);
}