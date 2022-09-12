package com.gerardoramos.proyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
            Las aplicaciones de java fx siguen una estructura en jerarquia, en orden descente:
                -Stage es el contenedor principal.
                -Scene es un panel de fondo para los elementos de la interfaz.
                -UI elements son los elementos propios en el panel

            fxmlLoader carga un archivo fxml y lo pasa como scena para mostrarlo
            Es necesario poner una escena en el stage, ya que el stage es solo el contenedor principal
            el scene es el contenedor de los elementos visibles
        */
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("client-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}