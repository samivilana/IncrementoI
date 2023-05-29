package Modelo;
import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("SistemaVentasRestaurante");
	protected EntityManager em = emf.createEntityManager();
	


	public void create(Cliente entity) {
		em.getTransaction().begin();
		try {			
			em.persist(entity);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("Fallo en Create de JPA");
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
		
	}
	public void delete(int clientId) {
	    em.getTransaction().begin();
	    try {
	        // Buscar el cliente por su ID antes de eliminarlo
	        Cliente cliente = em.find(Cliente.class, clientId);
	        if (cliente != null) {
	            em.remove(cliente);
	            em.getTransaction().commit();
	        } else {
	            System.out.println("Cliente no encontrado");
	            em.getTransaction().rollback();
	        }
	    } catch (Exception e) {
	        System.out.println("Fallo en Delete de JPA");
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	        }
	    }
	}
	
	public void update(Cliente entity) {
	    em.getTransaction().begin();
	    try {
	        em.merge(entity);
	        em.getTransaction().commit();
	    } catch (Exception e) {
	        System.out.println("Fallo en Update de JPA");
	        if (em.getTransaction().isActive())
	            em.getTransaction().rollback();
	    }
	}
	
	public Cliente buscarPorId(int clienteId) {
	    Cliente cliente = null;
	    try {
	        // Buscar el cliente por su ID
	        cliente = em.find(Cliente.class, clienteId);
	    } catch (Exception e) {
	        System.out.println("Fallo en la búsqueda del cliente por ID: " + e.getMessage());
	    }
	    return cliente;
	}
	
	public List<Cliente> getAllClientes() {
        EntityManager em = emf.createEntityManager();
        List<Cliente> clientes = null;

        try {
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
            clientes = query.getResultList();
        } finally {
            em.close();
        }

        return clientes;
    }
	
	
}
