package com.task1.relations;

import javax.persistence.EntityManager;

import com.task1.entities.Customer;
import com.task1.entities.Phone;

public class PhoneRepository extends BaseRepository<Phone>{

	public PhoneRepository() {
		super(Phone.class);
	}
	
	public void update(Phone phone) {
		EntityManager manager=newManager();
		manager.getTransaction().begin();
		
		Phone phoneUpdate=manager.find(Phone.class, phone.getPhoneId());
		
		phoneUpdate.setCountryNumber(phone.getCountryNumber());
		phoneUpdate.setPhoneNumber(phone.getPhoneNumber());

		
		manager.merge(phoneUpdate);
		
		manager.getTransaction().commit();
		
		manager.close();
			
	}
	

	
}
