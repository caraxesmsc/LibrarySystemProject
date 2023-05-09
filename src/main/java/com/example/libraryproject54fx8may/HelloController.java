package com.example.libraryproject54fx8may;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class HelloController {
    @FXML
    private Label welcomeText;
    public void login(ActionEvent de){
        System.out.println("HANNAAAAAAAAA");

    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}