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
        ItemController items;
        switch(((Button)e.getSource()).getId()){
            case "fishBtn":
                elementList = reader.getNodes("fishnchips");
                System.out.println("fish");
                break;
            case "calzoneBtn":
                elementList = reader.getNodes("calzone");
                System.out.println("calzone");
                break;
            case "pizzaBtn":
                break;
            case "gbBtn":
                break;
            case "burgerBtn":
                break;
            case "kebabBtn":
                break;
            case "sideBtn":
                break;
            case "drinkBtn":
                break;
            case "pieBtn":
                break;
            case "specialBtn":
                break;
            default:
                System.out.println("Default");
        }
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ItemMenu.fxml"));
        Parent root = loader.load();
        items = loader.getController();
        items.populateGrid(elementList);
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public void readCalzone(ActionEvent e){
        elementList = reader.getNodes("calzone");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readPizza(ActionEvent e){
        elementList = reader.getNodes("pizza");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readGB(ActionEvent e){
        elementList = reader.getNodes("garlic_bread");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readBurgers(ActionEvent e){
        elementList = reader.getNodes("burgers");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readKebabs(ActionEvent e){
        elementList = reader.getNodes("kebabs");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readSides(ActionEvent e){
        elementList = reader.getNodes("sides");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readDrinks(ActionEvent e){
        elementList = reader.getNodes("drinks");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readSpecials(ActionEvent e){
        elementList = reader.getNodes("specials");
        ItemController calzone = new ItemController();
        //calzone.populateGrid();
    }

    public void readPie(ActionEvent e){
        elementList = reader.getNodes("pie");
        ItemController pie = new ItemController();
        //pie.populateGrid();
    }

    public void backButton(ActionEvent e){

    }

}

