package com.task1.entities;
import javax.persistence.*;

@Entity
public class Phone {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="phoneId") 
	private int phoneId;
	
	@Column(name="countryNumber") 
	private String countryNumber;
	
	@Column(name="phoneNumber") 
	private String phoneNumber;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="customer_ıd")
	private Customer customer;

	public Phone( String countryNumber, String phoneNumber) {
		this.countryNumber = countryNumber;
		this.phoneNumber = phoneNumber;
	}
	public Phone( ) {
	}

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getCountryNumber() {
		return countryNumber;
	}

	public void setCountryNumber(String countryNumber) {
		this.countryNumber = countryNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	

}
