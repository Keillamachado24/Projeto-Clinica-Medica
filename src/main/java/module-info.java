module org.example.projeto_clinica_medica {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.projeto_clinica_medica to javafx.fxml;

}