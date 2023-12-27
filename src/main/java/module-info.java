module com.example.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task6 to javafx.fxml;
    exports com.example.task6;
    exports com.example.task6.figure;
    opens com.example.task6.figure to javafx.fxml;
}