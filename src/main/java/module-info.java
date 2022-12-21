module com.example.labb2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labb2 to javafx.fxml;
    exports com.example.labb2;
}