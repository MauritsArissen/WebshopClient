
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetProductsFromCustomerResult" type="{http://schemas.datacontract.org/2004/07/WebshopService}ArrayOfProduct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getProductsFromCustomerResult"
})
@XmlRootElement(name = "GetProductsFromCustomerResponse")
public class GetProductsFromCustomerResponse {

    @XmlElementRef(name = "GetProductsFromCustomerResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProduct> getProductsFromCustomerResult;

    /**
     * Gets the value of the getProductsFromCustomerResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public JAXBElement<ArrayOfProduct> getGetProductsFromCustomerResult() {
        return getProductsFromCustomerResult;
    }

    /**
     * Sets the value of the getProductsFromCustomerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *     
     */
    public void setGetProductsFromCustomerResult(JAXBElement<ArrayOfProduct> value) {
        this.getProductsFromCustomerResult = value;
    }

}
