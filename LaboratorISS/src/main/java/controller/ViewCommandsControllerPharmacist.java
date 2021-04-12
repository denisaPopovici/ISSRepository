package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class ViewCommandsControllerPharmacist {
    public void setService() {

    }

    @FXML
    private void initialize() {
    }

    @FXML
    public void anuleazaComanda(){
        MessageAlert.showMessage(null, Alert.AlertType.INFORMATION,"Succes!","Comanda anulata cu succes!");

    }

    @FXML
    public void onoreazaComanda(){
        MessageAlert.showMessage(null, Alert.AlertType.INFORMATION,"Succes!","Comanda onorata cu succes!");

    }
}
