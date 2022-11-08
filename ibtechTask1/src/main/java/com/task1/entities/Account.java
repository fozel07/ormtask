package com.task1.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Account {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="accountId") 
	private int accountId;
	
	@Column(name="accountName") 
	private String accountName;
	
	@Column(name="accountPassword") 
	private String accountPassword;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="customer_ıd")
	private Customer customer;

	public Account(String accountName, String accountPassword) {
		this.accountName = accountName;
		this.accountPassword = accountPassword;
	}
	public Account() {
	
		
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

}
