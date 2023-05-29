package Modelo;

public class Admin {
    Cliente client;
    ClienteDAO clienteDAO;
    Pedido pedido;
    Factura factur;

    public Admin() {
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    public void registrarCliente(String nombre,String apellido,String direccion, String cedula, String telefono, String correo){

        client.setNombre(nombre);
        client.setApellido(apellido);
        client.setDireccion(direccion);
        client.setCedula(cedula);
        client.setTelefono(telefono);
        client.setCorreo(correo);
        setClient(client);

    }
    private void setClienteDao(){
        this.clienteDAO.create(client);
    }
    public ClienteDAO crearClienteDao(){
        setClienteDao();
        return clienteDAO;
    }
    public ClienteDAO updateCliente( ClienteDAO clienteDAO){
        clienteDAO.update(this.client);
        return clienteDAO;
    }
    public void emitirDocumentos(){
        factur = new Factura(client, pedido);
        factur.emitirFactura();

    }
}
