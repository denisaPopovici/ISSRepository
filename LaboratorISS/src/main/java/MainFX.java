import controller.LogInController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/views/LogInView.fxml"));
        AnchorPane root = loader.load();

        LogInController ctrl = loader.getController();

        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.setTitle("Log in:");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
