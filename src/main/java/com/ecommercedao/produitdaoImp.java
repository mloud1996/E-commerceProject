package com.ecommercedao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.esp.entity.Produit;

public class ProduitDAOImp implements ProduitDAO {

	private static final EntityManagerFactory emf;
	private static final String PERSISTENCE_UNIT_NAME="JPAESP";
	
	static{
    	emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }
	
	public static EntityManager getEntityManeger(){
		return emf.createEntityManager();
	}

	public Produit getProduct( String id ) {
		EntityManager em = getEntityManeger();
		// TODO Auto-generated method stub
		return em.find(Produit.class, id);
