package Modelo;

public class Producto {
    int codigo=0;
    String nombre = "";
    double precio = 0;
    int cantidad;

    public Producto(  int codigo,
    String nombre,
    double precio,
    int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

}