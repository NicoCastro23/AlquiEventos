package alquieventos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class WelcomeController {

    @FXML
    private Label iniciarSesion;
    
    @FXML
    private Label usuario;
    
    @FXML
    private TextField usuarioTF;

    @FXML
    private Label contraseña;

    @FXML
    private PasswordField contraseñaPF;
    
    @FXML
    private Button ingresar;
    

    @FXML
    public void ingresarOnAction(@SuppressWarnings("exports") ActionEvent event){
        iniciarSesion.setText("Bienvenido");
    }
    
    
   
}
