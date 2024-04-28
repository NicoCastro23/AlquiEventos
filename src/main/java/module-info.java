module alquieventos {
    requires javafx.controls;
    requires javafx.fxml;

    opens alquieventos to javafx.fxml;
    exports alquieventos;
}
