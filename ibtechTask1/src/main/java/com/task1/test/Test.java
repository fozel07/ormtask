package com.task1.test;

import java.util.ArrayList;

import com.task1.entities.Account;
import com.task1.entities.Address;
import com.task1.entities.Customer;
import com.task1.entities.Phone;
import com.task1.relations.BaseRepository;
import com.task1.relations.CustomerRepository;

public class Test {
public static void main(String[] args) {
		
		Customer customer = new Customer("Ozan","Özel");
		
		Address address=new Address("Türkiye","İzmir","Buca","3500");
		
		Phone phone=new Phone("+90","5535098914");
	
		
		
		Account account= new Account("BeşiktaşımOLey","Karakartal");
		
		
		
	
		
		customer.setAddress(new ArrayList<Address>());
		customer.getAddress().add(address);
		
		customer.setPhone(new ArrayList<Phone>());
		customer.getPhone().add(phone);
		
		
		customer.setAccount(new ArrayList<Account>());
		customer.getAccount().add(account);
		
		
		account.setCustomer(customer);
		phone.setCustomer(customer);

		address.setCustomer(customer);
		
		CustomerRepository customerRepository=new CustomerRepository();
		
		customerRepository.insert(customer);
		//customerRepository.update(2, "Merve ", "Özel");
		//customerRepository.delete(2);
		//customerRepository.find();
		
		
		BaseRepository.getFactory().close();
		
	}

}
