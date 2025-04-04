module com.example.youtubevideo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.youtubevideo to javafx.fxml;
    exports com.example.youtubevideo;
}