package com.no3.epos;

import com.no3.epos.utility.SceneControl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startup extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        SceneControl.initialize();
        SceneControl.primaryStage.setScene(SceneControl.mainMenuScene);
        SceneControl.primaryStage.setTitle("no3");
        SceneControl.primaryStage.show();
    }
}