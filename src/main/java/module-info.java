module com.example.durak {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.durak to javafx.fxml;
    exports com.example.durak;
}