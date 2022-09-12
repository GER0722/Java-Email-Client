package com.gerardoramos.proyecto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController {
    //La notacion @FXML es necesaria para indicar que la variable vien declarada en el archivo fxml
    @FXML
    private TextField tfDestino, tfAsunto;
    @FXML
    private TextArea tfCuerpo;

    @FXML
    public void onEnviarButtonClick(ActionEvent actionEvent) {
        System.out.println(tfDestino.getText()+"\n"+tfAsunto.getText()+"\n"+tfCuerpo.getText());
    }
}
