package com.task1.relations;

import javax.persistence.EntityManager;

import com.task1.entities.Customer;


public class CustomerRepository extends BaseRepository<Customer>{
	
	
	public CustomerRepository() {
		super(Customer.class);
	}
	
	public void update(Customer customer) {
		EntityManager manager=newManager();
		manager.getTransaction().begin();
		
		Customer customerUpdate=manager.find(Customer.class, customer.getCustomerId());
		
		customerUpdate.setCustomerName(customer.getCustomerName());
		customerUpdate.setCustomerSurname(customer.getCustomerSurname());
		
		manager.merge(customerUpdate);
		
		manager.getTransaction().commit();
		
		manager.close();
			
	}
	
	
	
	
	
		
	
	
}
