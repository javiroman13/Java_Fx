package com.example.fx_tarea;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class VNombrePrincipal extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(VNombrePrincipal.class.getResource("VentanaNombre.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 540);

        stage.setTitle("Hola Mundo");
        stage.setScene(scene);
        stage.show();
    }
}
