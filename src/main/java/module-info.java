module src {
    requires javafx.controls;
    requires javafx.fxml;


    opens src.controllers to javafx.fxml;
    exports src;
}