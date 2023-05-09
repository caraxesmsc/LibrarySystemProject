package com.example.libraryproject54fx8may;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hanna!");
        Image icon = new Image("C:\\Users\\mdzhs\\IdeaProjects\\LibraryProject54FX8MAY\\src\\Logoicon.png");
        Image BG = new Image("C:\\Users\\mdzhs\\IdeaProjects\\LibraryProject54FX8MAY\\src\\Background-for-main-screen.jpg");
        stage.getIcons().add(icon);
        stage.setWidth(1200);
        stage.setHeight(800);
        stage.setFullScreen(false);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}