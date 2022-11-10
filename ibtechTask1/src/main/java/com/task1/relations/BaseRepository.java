package com.task1.relations;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.task1.entities.Customer;

public class BaseRepository<E> {
	
	private static EntityManagerFactory factory;
	private Class<E> clazz;
	
	
	
	public BaseRepository(Class<E> clazz) {
		this.clazz = clazz;
	}

	

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
	
	public void insert(E e) {
		EntityManager manager=newManager();
		manager=newManager();
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		manager.close();	
	}
	public E find(long id) {
		EntityManager manager=newManager();
		E entity= manager.find(clazz, id);
		manager.close();
		return entity;	
	}
	public List<E> list(){

		String jpql=String.format("select e from %s e",clazz.getSimpleName());
		TypedQuery<E> query=newManager().createQuery(jpql,clazz);
		List<E> entityList= query.getResultList();
		
		return entityList;
	
	}
	public void delete(long id) {
		EntityManager manager=newManager();
		manager.getTransaction().begin();
		E e=manager.find(clazz, id);
		
		manager.remove(e);
		
		manager.getTransaction().commit();
		
	}
	

}
