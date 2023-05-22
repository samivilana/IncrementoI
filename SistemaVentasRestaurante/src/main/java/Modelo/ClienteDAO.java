package Modelo;
import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

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
	
}
