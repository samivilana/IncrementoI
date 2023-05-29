package Modelo;

public class Factura {
    Cliente customer;
    Pedido pedido;
    OrdenPedidos pedidos;
    int numFactura;
    
    public Factura(Cliente client, Pedido pedido) {
        this.customer = client;
        this.pedido = pedido;
    }
    public void emitirFactura(){
    	pedido.getTotal();
        this.pedidos = new OrdenPedidos();
        pedidos.generarOrden();
    }


}