
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Customers" type="{http://schemas.datacontract.org/2004/07/WebshopService}Customer" minOccurs="0"/>
 *         &lt;element name="PaymentRuleId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://schemas.datacontract.org/2004/07/WebshopService}Product" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentRule", namespace = "http://schemas.datacontract.org/2004/07/WebshopService", propOrder = {
    "amount",
    "customers",
    "paymentRuleId",
    "product"
})
public class PaymentRule {

    @XmlElement(name = "Amount")
    protected Integer amount;
    @XmlElementRef(name = "Customers", namespace = "http://schemas.datacontract.org/2004/07/WebshopService", type = JAXBElement.class, required = false)
    protected JAXBElement<Customer> customers;
    @XmlElement(name = "PaymentRuleId")
    protected Integer paymentRuleId;
    @XmlElementRef(name = "Product", namespace = "http://schemas.datacontract.org/2004/07/WebshopService", type = JAXBElement.class, required = false)
    protected JAXBElement<Product> product;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public JAXBElement<Customer> getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public void setCustomers(JAXBElement<Customer> value) {
        this.customers = value;
    }

    /**
     * Gets the value of the paymentRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentRuleId() {
        return paymentRuleId;
    }

    /**
     * Sets the value of the paymentRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentRuleId(Integer value) {
        this.paymentRuleId = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public JAXBElement<Product> getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Product }{@code >}
     *     
     */
    public void setProduct(JAXBElement<Product> value) {
        this.product = value;
    }

}
