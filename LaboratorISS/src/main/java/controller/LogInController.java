package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LogInController {
    @FXML
    private TextField textFieldUsername;
    @FXML
    private TextField textFieldParola;

    @FXML
    private void logIn(){
        if(textFieldUsername.getText().toString().compareTo("farmacist")==0 && textFieldParola.getText().toString().compareTo("farmacist")==0){
            showMainDialogPharmacist();
        }
        else{
            if(textFieldUsername.getText().toString().compareTo("medic")==0 && textFieldParola.getText().toString().compareTo("medic")==0){
                showMainDialogMedic();
            }
            else
                MessageAlert.showMessage(null, Alert.AlertType.INFORMATION,"Logare esuata!","Datele dumneavoastra sunt incorecte!");
        }
    }

    public void setService() {

    }

    @FXML
    private void initialize() {
    }


    public void showMainDialogPharmacist() {
        try {

            // create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/views/MainWindowPharmacistView.fxml"));

            AnchorPane root = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Welcome back "+textFieldUsername.getText().toString()+" "+textFieldParola.getText().toString()+"!");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            //dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(root);
            dialogStage.setScene(scene);

            MainWindowControllerPharmacist mainController = loader.getController();

            dialogStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   @FXML
    public void showMainDialogMedic() {
        try {

            // create a new stage for the popup dialog.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/views/MainWindowMedicView.fxml"));

            AnchorPane root = (AnchorPane) loader.load();

            // Create the dialog Stage.
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Welcome back "+textFieldUsername.getText().toString()+" "+textFieldParola.getText().toString()+"!");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            //dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(root);
            dialogStage.setScene(scene);

            MainWindowControllerMedic mainController = loader.getController();

            dialogStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
