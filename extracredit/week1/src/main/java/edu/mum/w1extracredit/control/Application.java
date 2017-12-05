package edu.mum.w1extracredit.control;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Application {
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("cs544extracredit");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

		createProjects();
		printProjects();
		emf.close();
	}

	private static void printProjects() {
		// TODO Auto-generated method stub
	}

	private static void createProjects() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			// tx.begin();

			// TODO your code

			// tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();
		}
	}

}
