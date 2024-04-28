package alquieventos;

import java.time.LocalDate;

public class Factura {
    private String codigo;
    private double subTotal;
    private double total;
    private LocalDate fecha;
    
    //Constructor vacío.
    public Factura() {
    }

    //Constructor con argumentos.
    public Factura(String codigo, double subTotal, double total, LocalDate fecha) {
        this.codigo = codigo;
        this.subTotal = subTotal;
        this.total = total;
        this.fecha = fecha;
    }

    //Métodos gets y sets.
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    
    

}
