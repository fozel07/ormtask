package com.task1.relations;

import javax.persistence.EntityManager;

import com.task1.entities.Address;
import com.task1.entities.Customer;

public class AddressRepository extends BaseRepository<Address>{

	public AddressRepository() {
		super(Address.class);
	}
	
	
	public void update(Address address) {
		EntityManager manager=newManager();
		manager.getTransaction().begin();
		
		Address addressUpdate=manager.find(Address.class, address.getAddressId());
		
		address.setAdressCode(address.getAdressCode());
		address.setCity(address.getCity());
		address.setCountry(address.getCountry());
		address.setStreet(address.getStreet());

		
		manager.merge(addressUpdate);
		
		manager.getTransaction().commit();
		
		manager.close();
			
	}
	

}
