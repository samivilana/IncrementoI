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
    public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public ArrayList<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(ArrayList<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private void calcularTotal(){
    	for(int i = 0; i < listaProducto.size(); i++ ) {
    		total = total + listaProducto.get(i).precio * listaProducto.get(i).cantidad;
    	}
    }
}
