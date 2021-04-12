package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class MakeOrderController {
    public void setService() {

    }

    @FXML
    private void initialize() {
    }


    @FXML
    public void ok(){
        MessageAlert.showMessage(null, Alert.AlertType.INFORMATION,"Felicitari!","Comanda realizata cu succes!");

    }
}
