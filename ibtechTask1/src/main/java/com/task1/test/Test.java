package com.task1.test;

import com.task1.entities.Account;
import com.task1.entities.Address;
import com.task1.entities.Customer;
import com.task1.entities.Phone;
import com.task1.relations.BaseRepository;
import com.task1.relations.CustomerRepository;

public class Test {
public static void main(String[] args) {
		
		Customer customer = new Customer("Fatih","Özel");
		
		Address address=new Address("Türkiye","İzmir","Buca","3500");
		
		Phone phone=new Phone("+50","5535098913");
		
		Account account= new Account("Beşiktaşım","Karakartal");
	
		
		
		customer.setAddress(address);
		customer.setPhone(phone);
		customer.setAccount(account);
		
		CustomerRepository customerRepository=new CustomerRepository();
		
		customerRepository.insert(customer);
		//customerRepository.update(2, "Merve ", "Özel");
		//customerRepository.delete(2);
		//customerRepository.find();
		
		
		BaseRepository.getFactory().close();
		
	}

}
