module com.example.finalassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens amitoz.ass3 to javafx.fxml;
    exports amitoz.ass3;
}