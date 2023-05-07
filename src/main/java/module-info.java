module com.example.fx_tarea {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fx_tarea to javafx.fxml;
    exports com.example.fx_tarea;
}