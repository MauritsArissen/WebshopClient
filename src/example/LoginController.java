package example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import service.Customer;
import service.MyService;
import service.Product;

import java.util.ArrayList;
import java.util.List;

public class LoginController {
    @FXML
    private TextField userField;
    @FXML
    private PasswordField passField;
    @FXML
    private Label error;
    @FXML
    private Label notify;

    public void pressLoginBtn(ActionEvent event) throws Exception {
        if (userField.getText().equals("")) {
            error.setText("Username field empty");
            notify.setText("");
            return;
        } else if (passField.getText().equals("")) {
            error.setText("Password field empty");
            notify.setText("");
            return;
        }
        Customer c1 = Data.service.loginCheck(userField.getText(), passField.getText());
        if (c1 == null) {
            error.setText("Username/password don't match");
            notify.setText("");
        } else {
            Data.customer = c1;
            error.setText("");
            changeScene("main", (Stage) error.getScene().getWindow());
        }
    }

    public void pressRegisterBtn(ActionEvent event) {
        if (userField.getText().equals("")) {
            error.setText("Username field empty");
            notify.setText("");
            return;
        }
        String pass = Data.service.registerCheck(userField.getText());
        error.setText("");
        passField.setText(pass);
        notify.setText("Geregistreerd! Wachtwoord: " + pass);
    }

    private void changeScene(String direction, Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(direction + ".fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.show();
    }
}
