module com.example.lab_1_nirajan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.lab_1_nirajan to javafx.fxml;
    exports com.example.lab_1_nirajan;
}