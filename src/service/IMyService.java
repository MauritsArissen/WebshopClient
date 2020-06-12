
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IMyService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IMyService {


    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns service.Customer
     */
    @WebMethod(operationName = "LoginCheck", action = "http://tempuri.org/IMyService/LoginCheck")
    @WebResult(name = "LoginCheckResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "LoginCheck", targetNamespace = "http://tempuri.org/", className = "service.LoginCheck")
    @ResponseWrapper(localName = "LoginCheckResponse", targetNamespace = "http://tempuri.org/", className = "service.LoginCheckResponse")
    public Customer loginCheck(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://tempuri.org/")
        String password);

    /**
     * 
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RegisterCheck", action = "http://tempuri.org/IMyService/RegisterCheck")
    @WebResult(name = "RegisterCheckResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegisterCheck", targetNamespace = "http://tempuri.org/", className = "service.RegisterCheck")
    @ResponseWrapper(localName = "RegisterCheckResponse", targetNamespace = "http://tempuri.org/", className = "service.RegisterCheckResponse")
    public String registerCheck(
        @WebParam(name = "username", targetNamespace = "http://tempuri.org/")
        String username);

    /**
     * 
     * @param id
     * @return
     *     returns service.Customer
     */
    @WebMethod(operationName = "GetCustomerById", action = "http://tempuri.org/IMyService/GetCustomerById")
    @WebResult(name = "GetCustomerByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCustomerById", targetNamespace = "http://tempuri.org/", className = "service.GetCustomerById")
    @ResponseWrapper(localName = "GetCustomerByIdResponse", targetNamespace = "http://tempuri.org/", className = "service.GetCustomerByIdResponse")
    public Customer getCustomerById(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @param id
     * @return
     *     returns service.Product
     */
    @WebMethod(operationName = "GetProductById", action = "http://tempuri.org/IMyService/GetProductById")
    @WebResult(name = "GetProductByIdResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProductById", targetNamespace = "http://tempuri.org/", className = "service.GetProductById")
    @ResponseWrapper(localName = "GetProductByIdResponse", targetNamespace = "http://tempuri.org/", className = "service.GetProductByIdResponse")
    public Product getProductById(
        @WebParam(name = "id", targetNamespace = "http://tempuri.org/")
        Integer id);

    /**
     * 
     * @return
     *     returns service.ArrayOfProduct
     */
    @WebMethod(operationName = "GetProducts", action = "http://tempuri.org/IMyService/GetProducts")
    @WebResult(name = "GetProductsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProducts", targetNamespace = "http://tempuri.org/", className = "service.GetProducts")
    @ResponseWrapper(localName = "GetProductsResponse", targetNamespace = "http://tempuri.org/", className = "service.GetProductsResponse")
    public ArrayOfProduct getProducts();

    /**
     * 
     * @param customerId
     * @return
     *     returns service.ArrayOfProduct
     */
    @WebMethod(operationName = "GetProductsFromCustomer", action = "http://tempuri.org/IMyService/GetProductsFromCustomer")
    @WebResult(name = "GetProductsFromCustomerResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetProductsFromCustomer", targetNamespace = "http://tempuri.org/", className = "service.GetProductsFromCustomer")
    @ResponseWrapper(localName = "GetProductsFromCustomerResponse", targetNamespace = "http://tempuri.org/", className = "service.GetProductsFromCustomerResponse")
    public ArrayOfProduct getProductsFromCustomer(
        @WebParam(name = "customerId", targetNamespace = "http://tempuri.org/")
        Integer customerId);

    /**
     * 
     * @param product
     * @param customer
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "BuyProduct", action = "http://tempuri.org/IMyService/BuyProduct")
    @WebResult(name = "BuyProductResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "BuyProduct", targetNamespace = "http://tempuri.org/", className = "service.BuyProduct")
    @ResponseWrapper(localName = "BuyProductResponse", targetNamespace = "http://tempuri.org/", className = "service.BuyProductResponse")
    public String buyProduct(
        @WebParam(name = "product", targetNamespace = "http://tempuri.org/")
        Product product,
        @WebParam(name = "customer", targetNamespace = "http://tempuri.org/")
        Customer customer);

}
