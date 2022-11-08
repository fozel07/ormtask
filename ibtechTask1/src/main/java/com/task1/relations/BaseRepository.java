package com.task1.relations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseRepository<E> {
	
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getFactory() {
		if(factory==null) {
			factory=Persistence.
					createEntityManagerFactory("MyPersistenceUnit");
			
			
		}
		
		return factory;
		
	}
	
	public EntityManager newManager() {
		
		
		return getFactory().createEntityManager();
	}
	

}
