package Modelo;
import java.util.ArrayList;
public class Pedido {
    String hora;
    ArrayList<Producto> listaProducto = new ArrayList();
    int mesa;
    int cantidad;
    double total = 0;
    public Pedido() {

    }
 
    public void agregarPedido(Producto product) {
    	listaProducto.add(product);
    }
    private void calcularTotal(){
    	for(int i = 0; i < listaProducto.size(); i++ ) {
    		total = total + (listaProducto.get(i).precio * listaProducto.get(i).cantidad);
    	}
    }

    public double getTotal() {

        return total;
    }
}