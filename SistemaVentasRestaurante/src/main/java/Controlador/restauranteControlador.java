package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Cliente;
import Modelo.ClienteDAO;

/**
 * Servlet implementation class restauranteControlador
 */
@WebServlet("/restauranteControlador")
public class restauranteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public restauranteControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException


 {
		// TODO Auto-generated method stub
		ruteador(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		ruteador(request,response);
	}
	
	private void ruteador(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String ruta = (request.getParameter("ruta")==null?"ver":request.getParameter("ruta"));
		switch(ruta) {

		case "registrarCliente":
			this.registrar(request, response);
			break;
		case "ver" :
			this.ver(request, response);
		

		}
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1.- Obtengo parametros
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellido");
				String direccion = request.getParameter("direccion");
				String cedula = request.getParameter("cedula");
				String telefono = request.getParameter("telefono");
				String correo = request.getParameter("correo");
				
				//2.- LLamo al Modelo
				

				Cliente cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setDireccion(direccion);
				cliente.setCedula(cedula);
				cliente.setTelefono(telefono);
				cliente.setCorreo(correo);												
				ClienteDAO clienteDAO= new ClienteDAO();
			    clienteDAO.create(cliente);
			    
				
			    request.getRequestDispatcher("/JSP/pedido.jsp").forward(request, response);
				
	
	}
	private void ver(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/JSP/dashboard.jsp").forward(request, response);


		}

}
