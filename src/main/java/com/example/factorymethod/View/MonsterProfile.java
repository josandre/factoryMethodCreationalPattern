package com.example.factorymethod.View;

import com.example.factorymethod.BL.Bl;
import com.example.factorymethod.Main;
import com.example.factorymethod.Product.Monster;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

import java.io.IOException;

public class MonsterProfile {
    private Bl blInstance = Bl.getInstanciaBl();

    @FXML
    public Label IdName;

    @FXML
    public Label upperExtremity;

    @FXML
    public Label lowerExtremity;

    @FXML
    public Label body;

    @FXML
    public Label tail;

    @FXML
    public Label live;

    @FXML
    public Label type1;

    @FXML
    public Label type2;

    @FXML
    public Label life;

    @FXML
    public Label force;

    @FXML
    public Label defense;

    public void initialize(){
        Monster currentMonster = blInstance.getCurrentMonster();
        IdName.setText(currentMonster.getName());
        upperExtremity.setText(String.valueOf(currentMonster.getUpperExtremity()));
        lowerExtremity.setText(String.valueOf(currentMonster.getLowerExtremity()));
        body.setText(currentMonster.getBody());
        tail.setText(currentMonster.isTail() ? "I have a tail" : "I don't have a tail");
        live.setText(currentMonster.getHabitat());
        type1.setText(currentMonster.getType1());
        type2.setText(currentMonster.getType2());
        life.setText(String.valueOf(currentMonster.getLife()));
        force.setText(String.valueOf(currentMonster.getForce()));
        defense.setText(String.valueOf(currentMonster.getDefense()));
    }

    public void handleBack() throws IOException {
        Main.changeScene("MonsterList");
    }
}
