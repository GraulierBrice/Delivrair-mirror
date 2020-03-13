package fr.polytech.team.n;

import org.json.JSONObject;
import org.apache.cxf.jaxrs.client.WebClient;
public class ShipperApi {

    private String url;

    public ShipperApi(String host, String port) {
        this.url = "http://" + host + ":" + port;
    }

    public ShipperApi() {
        this("localhost", "9090");
    }

    public boolean performPayment(Package pack) throws ExternalPartnerException {
        // Retrieving the payment status
        JSONObject payment;
        try {
            String response = WebClient.create(url).path("parcels/by_id/" + pack.getId() ).get(String.class);
            payment = new JSONObject(response);
        } catch (Exception e) {
            throw new ExternalPartnerException(url + "parcels/by_id/" + pack.getId(), e);
        }
        // Assessing the payment status
        return (payment.getInt("Status") == 0);
    }

}
