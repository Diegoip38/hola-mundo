module com.dam.javatxtxt {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dam.javatxtxt to javafx.fxml;
    exports com.dam.javatxtxt;
}
