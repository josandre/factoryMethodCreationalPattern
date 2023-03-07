package com.example.factorymethod.View;

import com.example.factorymethod.BL.Bl;
import com.example.factorymethod.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class MainScene {
    @FXML
    public TextField  file;

    @FXML
    public AnchorPane idAnchorPane;

    private Bl bl = Bl.getInstanciaBl();

    Stage stage;

    {
        if (idAnchorPane != null) {
            stage = (Stage) idAnchorPane.getScene().getWindow();
        }
    }

    public void handleFile() throws IOException {
        this.file.setEditable(false);
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Opening JSON file");
        File file = fileChooser.showOpenDialog(stage);

        if (file != null) {
            bl.readJSONFile(file.getAbsolutePath());
            this.file.setText(file.getAbsolutePath());
            Main.changeScene("MonsterList");
        }
    }
}
