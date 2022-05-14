package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    public Button btnMain;
    int clickCounter = 0;

    public void onBtnAction(ActionEvent actionEvent){
        System.out.println("Kliknięcie nr " + ++clickCounter);
     
    }


    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}