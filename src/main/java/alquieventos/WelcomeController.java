package alquieventos;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WelcomeController  {

    private GestorEventos gestor;

    public WelcomeController(GestorEventos gestor) {
        this.gestor = gestor;
    }

    public Scene crearEscenaLogin(Stage stage) {
        Label lblEmail = new Label("Email:");
        TextField txtEmail = new TextField();
        Label lblContraseña = new Label("Contraseña:");
        PasswordField txtContraseña = new PasswordField();
        Button btnIniciarSesion = new Button("Iniciar Sesión");
        
        VBox loginBox = new VBox(10);
        loginBox.getChildren().addAll(lblEmail, txtEmail, lblContraseña, txtContraseña, btnIniciarSesion);

        btnIniciarSesion.setOnAction(e -> {
            String email = txtEmail.getText();
            String contraseña = txtContraseña.getText();
            Persona usuario = gestor.iniciarSesion(email, contraseña);
            if (usuario != null) {
                System.out.println("Inicio de sesión exitoso");
                // Lógica para mostrar la siguiente pantalla o realizar otras operaciones
            } else {
                System.out.println("Inicio de sesión fallido");
                // Lógica para mostrar un mensaje de error
            }
        });

        return new Scene(loginBox, 300, 200);
    }

    
}
