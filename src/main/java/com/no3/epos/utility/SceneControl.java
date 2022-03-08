package com.no3.epos.utility;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneControl {

    public static Stage primaryStage;

    public static Scene mainMenuScene;

//    public void switchToItems() throws IOException {
//        primaryStage.setScene(FXMLLoader.load(SceneControl.class.getResource("/fxml/ItemMenu.fxml")));
//    }

    public static void initialize() throws IOException {
        primaryStage = new Stage();
        primaryStage.setFullScreen(true);
        primaryStage.setResizable(false);

        mainMenuScene = new Scene(FXMLLoader.load(SceneControl.class.getResource("/fxml/MainMenu.fxml")));
        mainMenuScene.setFill(Color.DARKGREY);
    }
}