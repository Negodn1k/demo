package com.example.demo;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainController {
    ObservableList<String> order = FXCollections.observableArrayList();
    int orderPrice = 0;
    @FXML
    protected void bigNNAddButtonClick() {
        order.add("Big Ninety Nine");
        orderPrice += 5;
    }

    @FXML
    protected void nSAddButtonClick() {
        order.add("Ninety Six");
        orderPrice += 10;
    }

    @FXML
    protected void lBSAddButtonClick() {
        order.add("Large Big Six");
        orderPrice += 15;
    }

    @FXML
    protected void bigSmokeAddButtonClick() {
        order.add("Big Smoke");
        orderPrice += 20;
    }

    @FXML
    protected void groveStreetAddButtonClick() {
        order.add("Grove Street");
        orderPrice += 25;
    }

    @FXML
    protected void onCartButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(MainController.class.getResource("cart-view.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        CartController cartController = loader.getController();
        cartController.initData(order, orderPrice);
        stage.setResizable(false);
        stage.setTitle("IT'S PIZZA CART!");
        stage.show();
    }
}
