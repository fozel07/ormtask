package com.task1.entities;
import java.util.List;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="customerId") 
	private long customerId;
	
	@Column(name="customerName") 
	private String customerName;
	
	@Column(name="customerSurname") 
	private String customerSurname;
	
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	private List<Address> address;
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	private List<Phone> phone;
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	private List<Account> account;
	
	
	
	public Customer(long customerId, String customerName, String customerSurname) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
	}
	public Customer( String customerName, String customerSurname) {
		this.customerName = customerName;
		this.customerSurname = customerSurname;
	}
	public Customer() {

		
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerSurname() {
		return customerSurname;
	}
	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}
	
	
	public List<Phone> getPhone() {
		return phone;
	}
	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	
	
	
	
	
	

	
	


}
