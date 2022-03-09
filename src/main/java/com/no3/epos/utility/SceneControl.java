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
//    private HashMap<String, Pane> screenMap = new HashMap<>();
//    private Scene main;
    public static Stage primaryStage;
    public static Scene mainMenuScene;
    public static Scene itemMenuScene;

//    public SceneControl(Scene main) {
//        this.main = main;
//    }

    public static void initialize() throws IOException {
        primaryStage = new Stage();
        primaryStage.setFullScreen(true);
        //primaryStage.setResizable(false);

        Parent root = FXMLLoader.load(SceneControl.class.getResource("/fxml/MainMenu.fxml"));
        mainMenuScene = new Scene(root);
        //itemMenuScene = new Scene(FXMLLoader.load(SceneControl.class.getResource("/fxml/ItemMenu.fxml")));
    }

    public void switchToItem(){
        primaryStage.setScene(itemMenuScene);
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