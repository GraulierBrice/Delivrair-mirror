
package stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PlanDelivery_QNAME = new QName("http://www.n.team.polytech.fr/deliverywebservice/", "planDelivery");
    private final static QName _PlanDeliveryResponse_QNAME = new QName("http://www.n.team.polytech.fr/deliverywebservice/", "planDeliveryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlanDelivery }
     * 
     */
    public PlanDelivery createPlanDelivery() {
        return new PlanDelivery();
    }

    /**
     * Create an instance of {@link PlanDeliveryResponse }
     * 
     */
    public PlanDeliveryResponse createPlanDeliveryResponse() {
        return new PlanDeliveryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanDelivery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.n.team.polytech.fr/deliverywebservice/", name = "planDelivery")
    public JAXBElement<PlanDelivery> createPlanDelivery(PlanDelivery value) {
        return new JAXBElement<PlanDelivery>(_PlanDelivery_QNAME, PlanDelivery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanDeliveryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.n.team.polytech.fr/deliverywebservice/", name = "planDeliveryResponse")
    public JAXBElement<PlanDeliveryResponse> createPlanDeliveryResponse(PlanDeliveryResponse value) {
        return new JAXBElement<PlanDeliveryResponse>(_PlanDeliveryResponse_QNAME, PlanDeliveryResponse.class, null, value);
    }

}
