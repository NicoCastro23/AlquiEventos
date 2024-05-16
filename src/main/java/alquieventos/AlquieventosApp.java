package alquieventos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class AlquieventosApp extends Application {
    private GestorEventos gestor;

    @Override
    public void start(Stage primaryStage) {
        gestor = new GestorEventos();
        WelcomeController configurador = new WelcomeController(gestor);
        Scene scene = configurador.crearEscenaLogin(primaryStage);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Inicio de Sesión");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}