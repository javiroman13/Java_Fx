package com.example.fx_tarea;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VentanaPrincipal extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VentanaPrincipal.class.getResource("Ventana.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 540);

        stage.setTitle("Hola Mundo");
        stage.setScene(scene);
        stage.show();
    }
}
