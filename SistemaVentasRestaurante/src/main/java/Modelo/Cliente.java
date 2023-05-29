package Modelo;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Clientes")
public class Cliente implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name  = "nombre")
	private String nombre;
	@Column (name = "apellido")
	private String apellido;
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	@Column (name = "direccion")
	private String direccion;
	@Column(name = "cedula")
	private String cedula;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "correo")
	private String correo;
	
	
	public Cliente(String nombre,String apellido,String direccion, String cedula, String telefono, String correo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.cedula = cedula;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	
	public Cliente () {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", cedula=" + cedula + ", telefono=" + telefono + ", correo=" + correo + "]";
	}


	@Override
	public int hashCode() {
		int hash = 0;
        hash += (this.id != null ? this.id.hashCode() : 0);
        return hash;
	}
	@Override
	public boolean equals(Object object) {
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
	}
	
	
	

}
