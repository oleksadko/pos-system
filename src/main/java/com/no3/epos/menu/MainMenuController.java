package com.no3.epos.menu;

import com.no3.epos.utility.SceneControl;
import com.no3.epos.utility.XMLReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.w3c.dom.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenuController {
    private final XMLReader reader = new XMLReader();
    private List<Element> elementList = new ArrayList<>();
    private SceneControl scene;

    @FXML
    private HBox buttbox;
    @FXML
    private VBox vboxx;

    @FXML
    public void readFish(ActionEvent e) {
//        try {
//            scene.switchToItems();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
        elementList = reader.getNodes("fishnchips");
        List<Button> buttonlist = new ArrayList<>(); //our Collection to hold newly created Buttons
            for (Element element : elementList) {
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                buttonlist.add(new Button(name));
            }
            vboxx.getChildren().clear();
//            buttbox.getChildren().clear();
//            buttbox.getChildren().addAll(buttonlist);
    }

    public void readCalzone(ActionEvent e){
        elementList = reader.getNodes("calzone");
    }


}

