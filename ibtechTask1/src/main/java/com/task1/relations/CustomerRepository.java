package com.task1.relations;

import javax.persistence.EntityManager;

import com.task1.entities.Customer;


public class CustomerRepository extends BaseRepository<Customer>{
	
	
	
	public void insert(Customer customer) {
		EntityManager manager=newManager();
		manager=newManager();
	
		manager.getTransaction().begin();
		
		
		manager.persist(customer);
		
		
		manager.getTransaction().commit();
		
		manager.close();	
	}
	
	public Customer find(long customerId) {
		EntityManager manager=newManager();
		Customer customer=manager.find(Customer.class, customerId);
		
		return customer;
	}
	
	public void delete(long customerId) {
		EntityManager manager=newManager();
		manager.getTransaction().begin();
		Customer customer=manager.find(Customer.class, customerId);
		
		manager.remove(customer);
		
		manager.getTransaction().commit();
		
	}
	
	public void update(long customerId, String customerName, String customerSurname) {
		EntityManager manager=newManager();
		manager.getTransaction().begin();
		
		Customer customer=manager.find(Customer.class, customerId);
		
		customer.setCustomerName(customerName);
		customer.setCustomerSurname(customerSurname);
		
		manager.merge(customer);
		
		manager.getTransaction().commit();
		
		manager.close();
			
	}
	
	
	
		
	
	
}
