package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class CartController {
    @FXML
    ListView<String> orderList;
    @FXML
    Label price;
    void initialize() {}
    public void initData(ObservableList<String> order, int orderPrice) {
        orderList.setItems(order);
        price.setText(orderPrice + "$");
    }

    @FXML
    protected void refreshOrderList() {
    }


}
