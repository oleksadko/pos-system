package com.no3.epos.menu;

import com.no3.epos.utility.SceneControl;
import com.no3.epos.utility.XMLReader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import org.w3c.dom.Element;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    @FXML
    private GridPane itemPane;
    @FXML
    private HBox buttonBox;
    @FXML
    private VBox receiptBox;

    public ItemController(){}


    public void populateGrid(List<Element> elementList){
        //itemPane.getChildren().clear();
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
            buttonlist.get(i).setOnAction(event -> {
                Label item = new Label();
                item.setText(((Button)event.getSource()).getText());
                receiptBox.getChildren().add(item);
            });
            itemPane.setFillWidth(buttonlist.get(i), true);
            itemPane.setFillHeight(buttonlist.get(i), true);
            buttonlist.get(i).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            itemPane.add(buttonlist.get(i), i % 6, i / 6);
        }
        buttonBox.getChildren().add(back);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
