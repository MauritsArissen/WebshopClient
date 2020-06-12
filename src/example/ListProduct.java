package example;

import javafx.beans.property.SimpleStringProperty;
import service.Product;

public class ListProduct {

    private SimpleStringProperty name;
    private SimpleStringProperty price;
    private SimpleStringProperty stock;
    private SimpleStringProperty amount;
    private Product product;

    public ListProduct(String name, String price, String stock, Product product) {
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleStringProperty(price);
        this.stock = new SimpleStringProperty(stock);
        this.product = product;
    }

    public ListProduct(String name, String price, String amount, boolean bool, Product product) {
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleStringProperty(price);
        this.amount = new SimpleStringProperty(amount);
        this.product = product;
    }

    public String getName() {
        return name.get();
    }

    public String getPrice() {
        return price.get();
    }

    public String getStock() {
        return stock.get();
    }

    public String getAmount() {
        return amount.get();
    }

    public Product getProduct() {
        return product;
    }
}
