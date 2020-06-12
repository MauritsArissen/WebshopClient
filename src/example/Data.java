package example;

import service.Customer;
import service.MyService;

public class Data {
    public static Customer customer;
    public static final service.IMyService service = new MyService().getBasicHttpBindingIMyService();
}
