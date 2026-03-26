module com.adz1q.colors {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adz1q.colors to javafx.fxml;
    exports com.adz1q.colors;
}