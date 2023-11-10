package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class MainController {
    HashMap<String, Integer> order = new HashMap<>();

    @FXML
    protected void bigNNAddButtonClick() {
        order.put("Big Ninety Nine", 5);
    }

    @FXML
    protected void nSAddButtonClick() {
        order.put("Ninety Six", 10);
    }

    @FXML
    protected void lBSAddButtonClick() {
        order.put("Large Big Six", 15);
    }

    @FXML
    protected void bigSmokeAddButtonClick() {
        order.put("Big Smoke", 20);
    }

    @FXML
    protected void groveStreetAddButtonClick() {
        order.put("Grove Street", 25);
    }

    @FXML
    protected void onCartButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(MainController.class.getResource("cart-view.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("IT'S PIZZA CART!");
        stage.show();
    }
}
