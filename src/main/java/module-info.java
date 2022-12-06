module com.example.cssexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.cssexample to javafx.fxml;
    exports com.example.cssexample;
}