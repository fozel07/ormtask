package com.task1.relations;

import javax.persistence.EntityManager;

import com.task1.entities.Account;
import com.task1.entities.Customer;

public class AccountRepository extends BaseRepository<Account>{

	public AccountRepository() {
		super(Account.class);
	}
	
	public void update(Account account) {
		EntityManager manager=newManager();
		manager.getTransaction().begin();
		Account accountUpdate=manager.find(Account.class, account.getAccountId());
		accountUpdate.setAccountName(account.getAccountName());
		accountUpdate.setBalance(account.getBalance());
		manager.merge(accountUpdate);
		manager.getTransaction().commit();
		manager.close();
			
	}


}
