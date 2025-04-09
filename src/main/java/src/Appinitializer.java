package src;

import javafx.application.Application;
import javafx.stage.Stage;
import src.utils.ViewNavigator;

public class Appinitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        ViewNavigator.setMainStage(primaryStage);
        ViewNavigator.loadView("main");
    }
}