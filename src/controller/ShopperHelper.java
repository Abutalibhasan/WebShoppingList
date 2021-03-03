package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Shopper;

/**
 * Abutalib Hasan - amhasan 202101 CIS171 12928 Feb 28, 2021
 */
public class ShopperHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ConsoleShoppingList");
	EntityManager em = emfactory.createEntityManager();

	public void insertShopper(Shopper s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		em.close();
	}

	public List<Shopper> showAllShoppers() {
		EntityManager em = emfactory.createEntityManager();
		List<Shopper> allShoppers = em.createQuery("Select s from Shopper s").getResultList();
		return allShoppers;
	}

	public Shopper findShopper(String nameToLookUp) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Shopper> typedQuery = em.createQuery("select sh from Shopper sh where sh.shopperName = :selectedName", Shopper.class);
		typedQuery.setParameter("selectedName", nameToLookUp);
		Shopper foundShopper;
		try {
			foundShopper = typedQuery.getSingleResult();
		} catch (NoResultException ex) {
			foundShopper = new Shopper(nameToLookUp);
		}
		em.close();
		return foundShopper;
	}

}
