package Modelo;

public class Ticket {
	Pedido pedido;
    Factura factura;
    OrdenPedidos Opedido;
    public Ticket(Pedido pedido, Factura factura, OrdenPedidos Opedido) {
        this.pedido = pedido;
        this.factura = factura;
        this.Opedido = Opedido;
    }
    public void generarDoc(){
        factura.emitirFactura();
        Opedido.generarOrden();
    }
}
