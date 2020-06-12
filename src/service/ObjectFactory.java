
package service;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _PaymentRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "PaymentRule");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Product_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Product");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Customer_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Customer");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfPaymentRule_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "ArrayOfPaymentRule");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _ArrayOfProduct_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "ArrayOfProduct");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _LoginCheckResponseLoginCheckResult_QNAME = new QName("http://tempuri.org/", "LoginCheckResult");
    private final static QName _RegisterCheckResponseRegisterCheckResult_QNAME = new QName("http://tempuri.org/", "RegisterCheckResult");
    private final static QName _GetProductsResponseGetProductsResult_QNAME = new QName("http://tempuri.org/", "GetProductsResult");
    private final static QName _BuyProductResponseBuyProductResult_QNAME = new QName("http://tempuri.org/", "BuyProductResult");
    private final static QName _GetProductsFromCustomerResponseGetProductsFromCustomerResult_QNAME = new QName("http://tempuri.org/", "GetProductsFromCustomerResult");
    private final static QName _GetCustomerByIdResponseGetCustomerByIdResult_QNAME = new QName("http://tempuri.org/", "GetCustomerByIdResult");
    private final static QName _CustomerPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Password");
    private final static QName _CustomerUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Username");
    private final static QName _LoginCheckPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _LoginCheckUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _PaymentRuleCustomers_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Customers");
    private final static QName _BuyProductProduct_QNAME = new QName("http://tempuri.org/", "product");
    private final static QName _BuyProductCustomer_QNAME = new QName("http://tempuri.org/", "customer");
    private final static QName _GetProductByIdResponseGetProductByIdResult_QNAME = new QName("http://tempuri.org/", "GetProductByIdResult");
    private final static QName _ProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "Name");
    private final static QName _ProductPaymentRules_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebshopService", "PaymentRules");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfProduct }
     * 
     */
    public ArrayOfProduct createArrayOfProduct() {
        return new ArrayOfProduct();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentRule }
     * 
     */
    public ArrayOfPaymentRule createArrayOfPaymentRule() {
        return new ArrayOfPaymentRule();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link PaymentRule }
     * 
     */
    public PaymentRule createPaymentRule() {
        return new PaymentRule();
    }

    /**
     * Create an instance of {@link GetCustomerById }
     * 
     */
    public GetCustomerById createGetCustomerById() {
        return new GetCustomerById();
    }

    /**
     * Create an instance of {@link GetProductsFromCustomer }
     * 
     */
    public GetProductsFromCustomer createGetProductsFromCustomer() {
        return new GetProductsFromCustomer();
    }

    /**
     * Create an instance of {@link BuyProduct }
     * 
     */
    public BuyProduct createBuyProduct() {
        return new BuyProduct();
    }

    /**
     * Create an instance of {@link GetProductByIdResponse }
     * 
     */
    public GetProductByIdResponse createGetProductByIdResponse() {
        return new GetProductByIdResponse();
    }

    /**
     * Create an instance of {@link GetProductById }
     * 
     */
    public GetProductById createGetProductById() {
        return new GetProductById();
    }

    /**
     * Create an instance of {@link LoginCheck }
     * 
     */
    public LoginCheck createLoginCheck() {
        return new LoginCheck();
    }

    /**
     * Create an instance of {@link BuyProductResponse }
     * 
     */
    public BuyProductResponse createBuyProductResponse() {
        return new BuyProductResponse();
    }

    /**
     * Create an instance of {@link GetCustomerByIdResponse }
     * 
     */
    public GetCustomerByIdResponse createGetCustomerByIdResponse() {
        return new GetCustomerByIdResponse();
    }

    /**
     * Create an instance of {@link RegisterCheck }
     * 
     */
    public RegisterCheck createRegisterCheck() {
        return new RegisterCheck();
    }

    /**
     * Create an instance of {@link GetProductsFromCustomerResponse }
     * 
     */
    public GetProductsFromCustomerResponse createGetProductsFromCustomerResponse() {
        return new GetProductsFromCustomerResponse();
    }

    /**
     * Create an instance of {@link LoginCheckResponse }
     * 
     */
    public LoginCheckResponse createLoginCheckResponse() {
        return new LoginCheckResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link RegisterCheckResponse }
     * 
     */
    public RegisterCheckResponse createRegisterCheckResponse() {
        return new RegisterCheckResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "PaymentRule")
    public JAXBElement<PaymentRule> createPaymentRule(PaymentRule value) {
        return new JAXBElement<PaymentRule>(_PaymentRule_QNAME, PaymentRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "ArrayOfPaymentRule")
    public JAXBElement<ArrayOfPaymentRule> createArrayOfPaymentRule(ArrayOfPaymentRule value) {
        return new JAXBElement<ArrayOfPaymentRule>(_ArrayOfPaymentRule_QNAME, ArrayOfPaymentRule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "ArrayOfProduct")
    public JAXBElement<ArrayOfProduct> createArrayOfProduct(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_ArrayOfProduct_QNAME, ArrayOfProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LoginCheckResult", scope = LoginCheckResponse.class)
    public JAXBElement<Customer> createLoginCheckResponseLoginCheckResult(Customer value) {
        return new JAXBElement<Customer>(_LoginCheckResponseLoginCheckResult_QNAME, Customer.class, LoginCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterCheckResult", scope = RegisterCheckResponse.class)
    public JAXBElement<String> createRegisterCheckResponseRegisterCheckResult(String value) {
        return new JAXBElement<String>(_RegisterCheckResponseRegisterCheckResult_QNAME, String.class, RegisterCheckResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsResult", scope = GetProductsResponse.class)
    public JAXBElement<ArrayOfProduct> createGetProductsResponseGetProductsResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetProductsResponseGetProductsResult_QNAME, ArrayOfProduct.class, GetProductsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BuyProductResult", scope = BuyProductResponse.class)
    public JAXBElement<String> createBuyProductResponseBuyProductResult(String value) {
        return new JAXBElement<String>(_BuyProductResponseBuyProductResult_QNAME, String.class, BuyProductResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsFromCustomerResult", scope = GetProductsFromCustomerResponse.class)
    public JAXBElement<ArrayOfProduct> createGetProductsFromCustomerResponseGetProductsFromCustomerResult(ArrayOfProduct value) {
        return new JAXBElement<ArrayOfProduct>(_GetProductsFromCustomerResponseGetProductsFromCustomerResult_QNAME, ArrayOfProduct.class, GetProductsFromCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCustomerByIdResult", scope = GetCustomerByIdResponse.class)
    public JAXBElement<Customer> createGetCustomerByIdResponseGetCustomerByIdResult(Customer value) {
        return new JAXBElement<Customer>(_GetCustomerByIdResponseGetCustomerByIdResult_QNAME, Customer.class, GetCustomerByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "PaymentRule", scope = Customer.class)
    public JAXBElement<ArrayOfPaymentRule> createCustomerPaymentRule(ArrayOfPaymentRule value) {
        return new JAXBElement<ArrayOfPaymentRule>(_PaymentRule_QNAME, ArrayOfPaymentRule.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Password", scope = Customer.class)
    public JAXBElement<String> createCustomerPassword(String value) {
        return new JAXBElement<String>(_CustomerPassword_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Username", scope = Customer.class)
    public JAXBElement<String> createCustomerUsername(String value) {
        return new JAXBElement<String>(_CustomerUsername_QNAME, String.class, Customer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = LoginCheck.class)
    public JAXBElement<String> createLoginCheckPassword(String value) {
        return new JAXBElement<String>(_LoginCheckPassword_QNAME, String.class, LoginCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = LoginCheck.class)
    public JAXBElement<String> createLoginCheckUsername(String value) {
        return new JAXBElement<String>(_LoginCheckUsername_QNAME, String.class, LoginCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = RegisterCheck.class)
    public JAXBElement<String> createRegisterCheckUsername(String value) {
        return new JAXBElement<String>(_LoginCheckUsername_QNAME, String.class, RegisterCheck.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Product", scope = PaymentRule.class)
    public JAXBElement<Product> createPaymentRuleProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, PaymentRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Customers", scope = PaymentRule.class)
    public JAXBElement<Customer> createPaymentRuleCustomers(Customer value) {
        return new JAXBElement<Customer>(_PaymentRuleCustomers_QNAME, Customer.class, PaymentRule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "product", scope = BuyProduct.class)
    public JAXBElement<Product> createBuyProductProduct(Product value) {
        return new JAXBElement<Product>(_BuyProductProduct_QNAME, Product.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customer", scope = BuyProduct.class)
    public JAXBElement<Customer> createBuyProductCustomer(Customer value) {
        return new JAXBElement<Customer>(_BuyProductCustomer_QNAME, Customer.class, BuyProduct.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductByIdResult", scope = GetProductByIdResponse.class)
    public JAXBElement<Product> createGetProductByIdResponseGetProductByIdResult(Product value) {
        return new JAXBElement<Product>(_GetProductByIdResponseGetProductByIdResult_QNAME, Product.class, GetProductByIdResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "Name", scope = Product.class)
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPaymentRule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebshopService", name = "PaymentRules", scope = Product.class)
    public JAXBElement<ArrayOfPaymentRule> createProductPaymentRules(ArrayOfPaymentRule value) {
        return new JAXBElement<ArrayOfPaymentRule>(_ProductPaymentRules_QNAME, ArrayOfPaymentRule.class, Product.class, value);
    }

}
