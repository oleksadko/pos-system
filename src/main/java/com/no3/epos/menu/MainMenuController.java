package com.no3.epos.menu;

import com.no3.epos.utility.SceneControl;
import com.no3.epos.utility.XMLReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
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

    @FXML
    private GridPane itemPane;
    @FXML
    private HBox buttonBox;

    public void readFish(ActionEvent e) {
        elementList = reader.getNodes("fishnchips");
        ItemController fishnchips = new ItemController(elementList, buttonBox);
        fishnchips.populateGrid(itemPane);
    }

    public void readCalzone(ActionEvent e){
        elementList = reader.getNodes("calzone");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void readPizza(ActionEvent e){
        elementList = reader.getNodes("pizza");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void readGB(ActionEvent e){
        elementList = reader.getNodes("garlic_bread");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void readBurgers(ActionEvent e){
        elementList = reader.getNodes("burgers");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void readKebabs(ActionEvent e){
        elementList = reader.getNodes("kebabs");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void readSides(ActionEvent e){
        elementList = reader.getNodes("sides");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void readDrinks(ActionEvent e){
        elementList = reader.getNodes("drinks");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void readSpecials(ActionEvent e){
        elementList = reader.getNodes("specials");
        ItemController calzone = new ItemController(elementList, buttonBox);
        calzone.populateGrid(itemPane);
    }

    public void backButton(ActionEvent e){

    }

}

