package Modelo;
public class Ticket {
    Producto producto;
    Factura factura;
    OrdenPedido orden;
    public Ticket(Producto product, Factura factura, OrdenPedido pedido) {
        this.producto = product;
        this.factura = factura;
        this.orden = orden;
    }
    public void generarDoc(){
        factura.emitirFactura();
        orden.generarOrden();
    }
}