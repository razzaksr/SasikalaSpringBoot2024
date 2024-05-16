//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.16 at 09:42:04 AM IST 
//


package soap.card;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap.card package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap.card
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BlockCardRequest }
     * 
     */
    public BlockCardRequest createBlockCardRequest() {
        return new BlockCardRequest();
    }

    /**
     * Create an instance of {@link BlockCardResponse }
     * 
     */
    public BlockCardResponse createBlockCardResponse() {
        return new BlockCardResponse();
    }

    /**
     * Create an instance of {@link SwipeCardRequest }
     * 
     */
    public SwipeCardRequest createSwipeCardRequest() {
        return new SwipeCardRequest();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link SwipeCardResponse }
     * 
     */
    public SwipeCardResponse createSwipeCardResponse() {
        return new SwipeCardResponse();
    }

}
