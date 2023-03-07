package com.example.factorymethod.View;

import com.example.factorymethod.Main;
import com.example.factorymethod.Product.Monster;
import com.example.factorymethod.BL.Bl;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class MonsterList {

    ObservableList<Monster> monstersLIst = FXCollections.observableArrayList();

    @FXML
    public TableView<Monster> tblMonsters;

    @FXML
    public TableColumn<Monster, String> colName;

    @FXML
    public TableColumn<Monster, String> colUpperExtremity;

    @FXML
    public TableColumn<Monster, String> colLowerExtremity;

    @FXML
    public TableColumn<Monster, String> colBody;

    @FXML
    public TableColumn<Monster, String> colTail;

    @FXML
    public TableColumn<Monster, String> colHabitat;



    private Bl blInstance = Bl.getInstanciaBl();

    private Monster selectedMonster;

    public void initialize(){

        tblMonsters.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        colName.setCellValueFactory(monster -> new SimpleStringProperty(monster.getValue().getName()));
        colUpperExtremity.setCellValueFactory(monster -> new SimpleStringProperty(String.valueOf(monster.getValue().getUpperExtremity())));
        colLowerExtremity.setCellValueFactory(monster -> new SimpleStringProperty(String.valueOf(monster.getValue().getUpperExtremity())));
        colBody.setCellValueFactory(monster -> new SimpleStringProperty(monster.getValue().getBody()));
        colTail.setCellValueFactory(monster -> new SimpleStringProperty(monster.getValue().isTail() ? "Yes" : "No"));
        colHabitat.setCellValueFactory(monster -> new SimpleStringProperty(monster.getValue().getHabitat()));

        System.out.println("initializing");

        tblMonsters.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, monster) -> {
                    try {
                        getMonsterData(monster);
                    } catch (IOException e) {
                        throw new RuntimeException(e);

                    }
                });

        loadData();
    }


    public void handleBack() throws IOException {
        Main.changeScene("mainScene");
    }


    public void loadData(){
        monstersLIst.removeAll();
        monstersLIst.addAll(blInstance.getMonsters());
        tblMonsters.setItems(monstersLIst);
    }


    private void getMonsterData(Monster monster) throws IOException {
        System.out.println(monster.toString());
        Monster monsterFound = blInstance.getMonsterById(monster.getId());
        if(monsterFound != null){
            this.selectedMonster = monsterFound;
            Main.changeScene("MonsterProfile");
        }
    }

    public Monster getSelectedMonster(){
        return this.selectedMonster;
    }


}
