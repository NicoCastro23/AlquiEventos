package alquieventos;

public class CompraDirector {
    public Compra crearCompraConCupon(Cliente cliente, Evento evento, Localidad localidad, Cupon cupon, Factura factura){
        return new Compra.CompraBuilder().cliente(cliente).evento(evento).localidad(localidad).cupon(cupon).factura(factura).build();
    }

    public Compra crearCompraSinCupon(Cliente cliente, Evento evento, Localidad localidad, Factura factura){
        return new Compra.CompraBuilder().cliente(cliente).evento(evento).localidad(localidad).factura(factura).build();
    }
}
