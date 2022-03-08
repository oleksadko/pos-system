package com.no3.epos.menu;

import com.no3.epos.utility.SceneControl;
import com.no3.epos.utility.XMLReader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.w3c.dom.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ItemController {

    private final List<Element> elementList;
    private HBox buttonBox;


    public ItemController(List<Element> elements, HBox btnbox){
        elementList = elements;
        buttonBox = btnbox;
    }

    public void populateGrid(GridPane grid){

        grid.getChildren().clear();
        List<Button> buttonlist = new ArrayList<>();
        Button back = new Button("Back");
        back.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        HBox.setHgrow(back, Priority.ALWAYS);
        back.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                try {
                    back.getScene().setRoot(FXMLLoader.load(SceneControl.class.getResource("/fxml/MainMenu.fxml")));
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        });
        for (Element element : elementList) {
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            buttonlist.add(new Button(name));
        }
        for (int i = 0; i < buttonlist.size(); i++) {
            GridPane.setFillWidth(buttonlist.get(i), true);
            GridPane.setFillHeight(buttonlist.get(i), true);
            buttonlist.get(i).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            grid.add(buttonlist.get(i), i % 4, i / 4);

            buttonBox.getChildren().add(back);

        }
    }
}
