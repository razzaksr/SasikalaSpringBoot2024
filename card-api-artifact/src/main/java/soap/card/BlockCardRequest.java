//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.16 at 09:42:04 AM IST 
//


package soap.card;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cardPin" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cardNumber",
    "cardPin"
})
@XmlRootElement(name = "blockCardRequest")
public class BlockCardRequest {

    protected long cardNumber;
    protected int cardPin;

    /**
     * Gets the value of the cardNumber property.
     * 
     */
    public long getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     */
    public void setCardNumber(long value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardPin property.
     * 
     */
    public int getCardPin() {
        return cardPin;
    }

    /**
     * Sets the value of the cardPin property.
     * 
     */
    public void setCardPin(int value) {
        this.cardPin = value;
    }

}
