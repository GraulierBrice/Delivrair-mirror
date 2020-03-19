package api;


import stubs.DeliveryWebService;
import stubs.DeliveryWebServiceService;

import javax.xml.ws.BindingProvider;
import java.net.URL;

public class DDPublicAPI {

	public DeliveryWebService deliveries;

	public DDPublicAPI(String host, String port) {
		initDelivery(host, port);
	}

	private void initDelivery(String host, String port) {
		URL wsdlLocation = DDPublicAPI.class.getResource("/DeliveryWS.wsdl");
		DeliveryWebServiceService planning = new DeliveryWebServiceService(wsdlLocation);
		this.deliveries = planning.getDeliveryWebServicePort();
		String address = "http://" + host + ":" + port + "/DeliveryWebServicePort";
		((BindingProvider) deliveries).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, address);
	}
}
