
package data.server.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteMeasure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteMeasure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hmhId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteMeasure", propOrder = {
    "uId",
    "hmhId"
})
public class DeleteMeasure {

    protected int uId;
    protected int hmhId;

    /**
     * Gets the value of the uId property.
     * 
     */
    public int getUId() {
        return uId;
    }

    /**
     * Sets the value of the uId property.
     * 
     */
    public void setUId(int value) {
        this.uId = value;
    }

    /**
     * Gets the value of the hmhId property.
     * 
     */
    public int getHmhId() {
        return hmhId;
    }

    /**
     * Sets the value of the hmhId property.
     * 
     */
    public void setHmhId(int value) {
        this.hmhId = value;
    }

}
