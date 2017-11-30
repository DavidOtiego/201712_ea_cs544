package edu.mum.hw2_2.control;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.mum.hw2_2.domain.Order;
import edu.mum.hw2_2.domain.OrderLine;
import edu.mum.hw2_2.domain.Product;

public class Application {
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("cs544");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

		addOrders();
		printOrders();
		emf.close();
	}

	private static void printOrders() {
		// TODO Auto-generated method stub

	}

	private static void addOrders() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

			// TODO your code
			Order order = new Order(Date.from(Instant.now()));
			Product product = new Product("Pants", "Slim Fit");
			order.addOrder(new OrderLine(4.0, product));

			em.persist(order);

			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive()))
				tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen()))
				em.close();
		}
	}

}
