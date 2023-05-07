package com.example.fx_tarea;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class VentanaNombre {
    public TextField cajatexto;

    public Label Etiqueta;
    public Label Mostrar;



    public void botonClick(ActionEvent actionEvent) {

        String nombre=cajatexto.getText();
        Mostrar.setText("Hola mundo "+nombre);


    }
}
