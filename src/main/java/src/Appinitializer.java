package src;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import src.utils.ViewNavigator;

import java.io.IOException;

public class Appinitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewNavigator.setMainStage(primaryStage);
        ViewNavigator.loadView("main");
        //ViewNavigator.loadView("LoginPage",false);
    }
}