package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class DetailController extends Application {
    @FXML
    TextField addressField;
    @FXML
    TextField pNumberField;

    @FXML
    protected void confirmButtonClick() {
        Alert messageBox = new Alert(Alert.AlertType.INFORMATION);

        if (addressField.getText().isEmpty()) {
            messageBox.setTitle("Address wrong(");
            messageBox.setHeaderText(null);
            messageBox.setContentText("Enter your address, otherwise you won't receive pizza!");
            messageBox.show();
            return;
        }
        messageBox.setTitle("IT'S PIZZA TIME!!!");
        messageBox.setHeaderText("Address - " + addressField.getText() + ", Phone Number - " + pNumberField.getText());
        messageBox.setContentText("Expect your pizza within half an hour, but in the meantime enjoy some pleasant music)");
        messageBox.show();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                getHostServices().showDocument("https://www.youtube.com/watch?v=pLT99PuEOmY");
            }
        };
        timer.schedule(task, 5000);

        task = new TimerTask() {
            @Override
            public void run() {
                System.exit(0);
            }
        };

        timer.schedule(task, 15000);
    }

    @Override
    public void start(Stage stage) {

    }
}
