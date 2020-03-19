
package stubs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for planDelivery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="planDelivery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPackage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "planDelivery", propOrder = {
    "calendar",
    "idPackage"
})
public class PlanDelivery {

    protected int calendar;
    protected int idPackage;

    /**
     * Gets the value of the calendar property.
     * 
     */
    public int getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     */
    public void setCalendar(int value) {
        this.calendar = value;
    }

    /**
     * Gets the value of the idPackage property.
     * 
     */
    public int getIdPackage() {
        return idPackage;
    }

    /**
     * Sets the value of the idPackage property.
     * 
     */
    public void setIdPackage(int value) {
        this.idPackage = value;
    }

}
