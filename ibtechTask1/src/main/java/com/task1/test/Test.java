package com.task1.test;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import javax.persistence.Entity;

import com.task1.cmd.CommandExecuter;
import com.task1.entities.Account;
import com.task1.entities.Address;
import com.task1.entities.Command;
import com.task1.entities.Customer;
import com.task1.entities.Phone;
import com.task1.relations.AddressRepository;
import com.task1.relations.BaseRepository;
import com.task1.relations.CommandRepository;
import com.task1.relations.CustomerRepository;
import com.task1.relations.PhoneRepository;

public class Test {
public static void main(String[] args) throws Exception {
		
		Customer customer = new Customer("Ozan","Özel");
		
		Address address=new Address("Türkiye","İzmir","Buca","3500");
		
		Phone phone=new Phone("+90","5535098914");

		Account account= new Account("BeşiktaşımOLey",9000);
		
		customer.setAddress(new ArrayList<Address>());
		customer.getAddress().add(address);
		
		customer.setPhone(new ArrayList<Phone>());
		customer.getPhone().add(phone);
		
		
		customer.setAccount(new ArrayList<Account>());
		customer.getAccount().add(account);
		
		
		account.setCustomer(customer);
		

		phone.setCustomer(customer);	
		
		address.setCustomer(customer);
		
	
		
	
		PhoneRepository phoneReposityor=new PhoneRepository();
		
		
		Customer customerUpdate=new Customer(12,"Fatih","Özel");
		Phone phoneUpdate=new Phone(11,"+70","445098123");
		Phone phoneInsert=new Phone("+11","123123123",phoneReposityor.find(12).getCustomer());
		LinkedHashMap<String, Object> lhm= new LinkedHashMap<String, Object>();
		
		lhm.put("customer_insert", customer);
		lhm.put("customer_delete", 11);
		lhm.put("customer_update", customerUpdate);
		lhm.put("phone_insert",phoneInsert);
		lhm.put("phone_delete", 11);
		lhm.put("phone_update", phoneUpdate);
		
		
		
		CommandExecuter commandExecuter=new CommandExecuter();
		//commandExecuter.execute("customer_update");
		
		
		for ( String i : lhm.keySet()) {
			
		commandExecuter.execute(i,lhm.get(i));
		
		}
		
		
		
		//customerRepository.update(2, "Merve ", "Özel");
		//customerRepository.delete(2);
		//customerRepository.find();
		
		
		BaseRepository.getFactory().close();
		
	}


}
