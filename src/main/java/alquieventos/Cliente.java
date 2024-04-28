package alquieventos;

import java.time.LocalDate;
import java.util.Collection;

public class Cliente extends Persona {
    private Collection <Compra> compras;
    
    //Constructor con argumentos heredados y una lista de compras.
    public Cliente(String nombre, String cedula, String numTelefono, String email, String contraseña) {
        super(nombre, cedula, numTelefono, email, contraseña);
    }

    @Override
    public void loguear() {
        
    }
    
    public void registrarse(){

    }

    public void buscarEvento(){

    }

    public void realizarCompra(Compra compra){
        if (compra.getFactura().getFecha().isBefore(LocalDate.now())) {
            compras.add(compra);
        }
    }

    public void cancelarCompra(){

    }

    public void redimirCupones(){

    }

    public void listarCompras(){
        
    }

    //Métodos get y set
    public Collection<Compra> getCompras() {
        return compras;
    }

    public void setCompras(Collection<Compra> compras) {
        this.compras = compras;
    }

}
