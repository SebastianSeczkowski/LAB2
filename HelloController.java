package com.example.demo3;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public Button btnMain;

    public void onBtnAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr " + ++clickCounter);
        if (clickCounter == 1)
                btnMain.setText("I jeszcze raz");
        }
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}