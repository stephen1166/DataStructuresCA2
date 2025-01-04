module com.example.ca2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens Main to javafx.fxml;
    exports Main;
    opens Controller to javafx.fxml;
    exports Controller;
}