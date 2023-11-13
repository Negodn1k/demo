package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CartController {
    @FXML
    ListView<String> orderList;
    @FXML
    Label price;
    public void initData(ObservableList<String> order, int orderPrice) {
        orderList.setItems(order);
        price.setText(orderPrice + "$");
    }

    @FXML
    protected void openDetailWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(CartController.class.getResource("detail-view.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.getIcons().add(new Image("https://img.freepik.com/free-vector/flying-slice-of-pizza-cartoon-vector-illustration-fast-food-concept-isolated-vector-flat-cartoon-style_138676-1934.jpg?w=740"));
        stage.setResizable(false);
        stage.setTitle("IT'S PIZZA DETAIL!");
        stage.show();
    }
}
