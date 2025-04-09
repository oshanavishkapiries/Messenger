package src.utils.aminations;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class FadeOut {
    private final FadeTransition fadeTransition;

    public FadeOut(Node node, int duration) {
        fadeTransition = new FadeTransition(Duration.millis(duration), node);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.play();
    }

    public FadeTransition getTransition() {
        return fadeTransition;
    }
} 