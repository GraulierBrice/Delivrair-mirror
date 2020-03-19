package fr.polytech.team.n;

import org.json.JSONObject;
import org.apache.cxf.jaxrs.client.WebClient;
import org.opensaml.xmlsec.signature.P;

public class ShipperApi {

    private String url;

    public ShipperApi(String host, String port) {
        this.url = "http://" + host + ":" + port;
    }

    public ShipperApi() {
        this("localhost", "9090");
    }

    public Package getPackage(int id) throws ExternalPartnerException {
        // Retrieving the payment status
        JSONObject info;
        Package pack=new Package(id);
        try {
            String response = WebClient.create(url).path("parcels/by_id/" + id ).get(String.class);
            info = new JSONObject(response);
            pack.setCustomer(new Customer(info.getInt("customerId"),info.getString("firstName"),info.getString("lastName")));
            pack.setAddress(info.getString("address"));
        } catch (Exception e) {
            throw new ExternalPartnerException(url + "parcels/by_id/" + id, e);
        }
        // Assessing the payment status
        return pack;
    }

}
