package src.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ViewNavigator {

    private static Stage mainStage;

    public static void setMainStage(Stage stage) {
        ViewNavigator.mainStage = stage;
    }

    public static void loadView(String fxmlPath) {

        String path = "/view/" + fxmlPath + ".fxml";

        try {
            FXMLLoader loader = new FXMLLoader(ViewNavigator.class.getResource(path));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            mainStage.setScene(scene);
            mainStage.setTitle("Messenger");
            mainStage.getIcons().add(new Image(Objects.requireNonNull(ViewNavigator.class.getResourceAsStream("/assets/logo_48.png"))));
            mainStage.setResizable(true);
            mainStage.setMinHeight(600);
            mainStage.setMinWidth(800);
            mainStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

