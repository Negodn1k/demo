package com.example.demo;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginController extends Application {
    @FXML
    TextField loginField;
    @FXML
    PasswordField passwordField;
    @FXML
    Hyperlink pizzaLabel;
    @FXML
    Button loginButton;
    @FXML
    AnchorPane window;


    @FXML
    public void onLoginButtonClick() throws IOException {
        if (loginField.getText().equals("admin") && passwordField.getText().equals("admin")) {
            mainWindowOpen();
        }
    }

    public void onLinkClick(ActionEvent actionEvent) {
        getHostServices().showDocument("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }

    @Override
    public void start(Stage stage) throws Exception {

    }

    private void mainWindowOpen() throws IOException {
        FXMLLoader loader = new FXMLLoader(LoginController.class.getResource("main-view.fxml"));
        Scene scene = new Scene(loader.load(), 400, 200);
        Stage stage = new Stage();
        stage.setTitle("IT'S PIZZA TIME!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        Stage thisStage = (Stage) loginButton.getScene().getWindow();
        thisStage.close();
    }

    @FXML
    protected void keys() {
        window.setOnKeyPressed(keyEvent -> {
            switch (keyEvent.getCode()) {
                case ENTER -> {
                    try {
                        onLoginButtonClick();
                    } catch (IOException ignored) {

                    }
                }
                case ESCAPE -> {
                    System.exit(0);
                }
            }
        });
    }
}