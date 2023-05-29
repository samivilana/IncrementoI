package Modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Carrito" )
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> productos;

    @Column(name = "total")
    private double total;

    @Column(name = "estado")
    private String estado;

    @Column(name = "descuentos")
    private double descuentos;

    public Carrito() {
    	
    }
    
	public Carrito(int id, List<Producto> productos, double total, String estado, double descuentos) {
		super();
		this.id = id;
		this.productos = productos;
		this.total = total;
		this.estado = estado;
		this.descuentos = descuentos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public double getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(double descuentos) {
		this.descuentos = descuentos;
	}
    
    
}
