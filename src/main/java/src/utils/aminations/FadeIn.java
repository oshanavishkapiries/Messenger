package src.utils.aminations;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class FadeIn {
    private final FadeTransition fadeTransition;

    public FadeIn(Node node, int durationMillis) {
        fadeTransition = new FadeTransition(Duration.millis(durationMillis), node);
        fadeTransition.setFromValue(0.0);
        fadeTransition.setToValue(1.0);
        fadeTransition.play();
    }

    public FadeTransition getTransition() {
        return fadeTransition;
    }
}