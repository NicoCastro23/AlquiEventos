package alquieventos;

public class Cupon {
    private double descuento;

    //Constructor vacío.
    public Cupon(){   
    }

    //Constructor con argumento.
    public Cupon(double descuento){
        this.descuento = descuento;
    }

    //Métodos get y set.
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
}
