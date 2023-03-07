package com.example.factorymethod;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Scene mainScene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 804, 400);
        stage.setTitle("Hello!");
        mainScene = scene;
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeScene(String sceneName) throws IOException {
        String scene = sceneName + ".fxml";
        Parent parent = null;
        parent = FXMLLoader.load(Main.class.getResource(scene));
        mainScene.setRoot(parent);
    }
}