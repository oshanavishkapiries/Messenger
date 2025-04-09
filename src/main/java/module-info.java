module src {
    requires javafx.controls;
    requires javafx.fxml;


    opens src.controllers to javafx.fxml;
    opens src.controllers.components to javafx.fxml;
    exports src;
}