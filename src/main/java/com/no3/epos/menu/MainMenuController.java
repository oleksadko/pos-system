package com.no3.epos.menu;

import com.no3.epos.utility.SceneControl;
import com.no3.epos.utility.XMLReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import org.w3c.dom.Element;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainMenuController {
    private final XMLReader reader = new XMLReader();
    private List<Element> elementList = new ArrayList<>();

    public void readButton(ActionEvent e) throws IOException {
        switch(((Button)e.getSource()).getId()){
            case "fishBtn":
                elementList = reader.getNodes("fishnchips");
                break;
            case "calzoneBtn":
                elementList = reader.getNodes("calzone");
                break;
            case "pizzaBtn":
                elementList = reader.getNodes("pizza");
                break;
            case "gbBtn":
                elementList = reader.getNodes("gb");
                break;
            case "burgerBtn":
                elementList = reader.getNodes("burger");
                break;
            case "kebabBtn":
                elementList = reader.getNodes("kebab");
                break;
            case "sideBtn":
                elementList = reader.getNodes("side");
                break;
            case "drinkBtn":
                elementList = reader.getNodes("drink");
                break;
            case "pieBtn":
                elementList = reader.getNodes("pie");
                break;
            case "specialBtn":
                elementList = reader.getNodes("special");
                break;
            default:
                System.out.println("Default");
        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ItemMenu.fxml"));
        Parent root = loader.load();
        ItemController items = loader.getController();
        items.populateGrid(elementList);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }


    public void backButton(ActionEvent e){

    }

}

