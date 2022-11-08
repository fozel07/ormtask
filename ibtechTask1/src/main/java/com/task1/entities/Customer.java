package com.task1.entities;
import javax.persistence.*;

@Entity
public class Customer {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="customerId") 
	private long customerId;
	
	@Column(name="customerName") 
	private String customerName;
	
	@Column(name="customerSurname") 
	private String customerSurname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "AddressId")
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "phone_id", referencedColumnName = "phoneId")
	private Phone phone;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id", referencedColumnName = "accountId")
	private Account account;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
	
	

	
	


}
