package src.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.animation.PauseTransition;
import javafx.util.Duration;
import src.utils.aminations.FadeOut;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane loader;

    @FXML
    private AnchorPane screen;

    @FXML
    public void initialize() {
        screen.setOpacity(1);

        PauseTransition pause = new PauseTransition(Duration.seconds(3));
        pause.setOnFinished(event -> {
            FadeOut fadeOut = new FadeOut(loader, 300);
            fadeOut.getTransition().setOnFinished(e -> {
                loadChatComponent();
                loader.setVisible(false);
            });
        });

        pause.play();
    }

    private void loadChatComponent() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/components/chatscreen.fxml"));
            AnchorPane chatPane = loader.load();

            chatPane.setPrefWidth(screen.getPrefWidth());
            chatPane.setPrefHeight(screen.getPrefHeight());

            screen.getChildren().add(chatPane);

            AnchorPane.setTopAnchor(chatPane, 0.0);
            AnchorPane.setBottomAnchor(chatPane, 0.0);
            AnchorPane.setLeftAnchor(chatPane, 0.0);
            AnchorPane.setRightAnchor(chatPane, 0.0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
