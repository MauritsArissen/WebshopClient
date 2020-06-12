package example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import service.Product;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    @FXML private TableView shopTable;
    @FXML private TableColumn<ListProduct, String> shopCol1;
    @FXML private TableColumn<ListProduct, String> shopCol2;
    @FXML private TableColumn<ListProduct, String> shopCol3;

    @FXML private TableView invTable;
    @FXML private TableColumn<ListProduct, String> invCol1;
    @FXML private TableColumn<ListProduct, String> invCol2;
    @FXML private TableColumn<ListProduct, String> invCol3;

    @FXML private Label balance;
    @FXML private Label error;

    public void initialize() {
        shopCol1.setCellValueFactory(new PropertyValueFactory<ListProduct,String>("name"));
        shopCol2.setCellValueFactory(new PropertyValueFactory<ListProduct,String>("price"));
        shopCol3.setCellValueFactory(new PropertyValueFactory<ListProduct,String>("stock"));

        invCol1.setCellValueFactory(new PropertyValueFactory<ListProduct,String>("name"));
        invCol2.setCellValueFactory(new PropertyValueFactory<ListProduct,String>("price"));
        invCol3.setCellValueFactory(new PropertyValueFactory<ListProduct,String>("amount"));

        refreshAll();
    }

    public void refreshShop() {
        List<Product> products = Data.service.getProducts().getProduct();
        ObservableList<ListProduct> data = FXCollections.observableArrayList();
        for (Product p : products) {
            data.add(new ListProduct(p.getName().getValue(), p.getPrice().toString(), p.getStock().toString(), p));
        }

        shopTable.setItems(data);
    }

    public void refreshInventory() {
        List<Product> products = Data.service.getProductsFromCustomer(Data.customer.getCustomerId()).getProduct();
        ObservableList<ListProduct> data = FXCollections.observableArrayList();
        for (Product p : products) {
            data.add(new ListProduct(p.getName().getValue(), p.getPrice().toString(), p.getAmount().toString(), true, p));
        }

        invTable.setItems(data);
    }

    public void refreshCustomer() {
        Data.customer = Data.service.getCustomerById(Data.customer.getCustomerId());
        balance.setText(String.valueOf((double) (Math.round(Data.customer.getBalance() * 100) / 100.0)));
    }

    public void refreshAll() {
        refreshShop();
        refreshInventory();
        refreshCustomer();
    }

    public void pressBuyBtn(ActionEvent event) {
        ListProduct selectedItem = (ListProduct) shopTable.getSelectionModel().getSelectedItem();
        if (selectedItem == null) return;
        String result = Data.service.buyProduct(selectedItem.getProduct(), Data.customer);
        if (result.startsWith("Onvoldoende")) {
            error.setText(result);
        } else {
            error.setText("");
        }
        refreshAll();
    }

}
