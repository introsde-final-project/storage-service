
package data.server.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="goalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="goalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "goalId",
    "goalName",
    "goalDescription"
})
public class Goal {

    protected int goalId;
    protected String goalName;
    protected String goalDescription;

    /**
     * Gets the value of the goalId property.
     * 
     */
    public int getGoalId() {
        return goalId;
    }

    /**
     * Sets the value of the goalId property.
     * 
     */
    public void setGoalId(int value) {
        this.goalId = value;
    }

    /**
     * Gets the value of the goalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalName() {
        return goalName;
    }

    /**
     * Sets the value of the goalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalName(String value) {
        this.goalName = value;
    }

    /**
     * Gets the value of the goalDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoalDescription() {
        return goalDescription;
    }

    /**
     * Sets the value of the goalDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoalDescription(String value) {
        this.goalDescription = value;
    }

}
