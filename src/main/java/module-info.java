module com.gerardoramos.proyectomail_tap_21130599 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gerardoramos.proyecto to javafx.fxml;
    exports com.gerardoramos.proyecto;
}