package com.no3.epos.utility;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class SceneControl {
    public static Stage primaryStage;
    public static Scene mainMenuScene;
    public static Scene itemMenuScene;


    public static void initialize() throws IOException {
        primaryStage = new Stage();
        primaryStage.setFullScreen(true);

        mainMenuScene = new Scene(FXMLLoader.load(SceneControl.class.getResource("/fxml/MainMenu.fxml")));
        itemMenuScene = new Scene(FXMLLoader.load(SceneControl.class.getResource("/fxml/ItemMenu.fxml")));
    }

//
//    public void switchToMenu(){
//        try {
//            primaryStage.setScene(new Scene(FXMLLoader.load(SceneControl.class.getResource("/fxml/MainMenu.fxml"))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    protected void activate(String name){
//        try {
//            mainMenuScene.setRoot(new Scene(FXMLLoader.load(SceneControl.class.getResource("/fxml/ItemMenu.fxml"))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}


//
//    public void switchToItems() throws IOException {
//        primaryStage.setScene(FXMLLoader.load(SceneControl.class.getResource("/fxml/ItemMenu.fxml")));
//    }
//

//}