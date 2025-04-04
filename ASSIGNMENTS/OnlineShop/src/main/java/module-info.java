module com.example.onlineshop {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.onlineshop to javafx.fxml;
    exports com.example.onlineshop;
}