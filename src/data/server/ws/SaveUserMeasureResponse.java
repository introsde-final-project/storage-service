
package data.server.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for saveUserMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="saveUserMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measure" type="{http://ws.server.data/}healthMeasureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveUserMeasureResponse", propOrder = {
    "measure"
})
public class SaveUserMeasureResponse {

    protected HealthMeasureHistory measure;

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public HealthMeasureHistory getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthMeasureHistory }
     *     
     */
    public void setMeasure(HealthMeasureHistory value) {
        this.measure = value;
    }

}
