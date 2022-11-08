package com.task1.entities;
import javax.persistence.*;

@Entity
public class Address {
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name="AddressId") 
	private int AddressId;
	
	@Column(name="Country") 
	private String Country;
	
	@Column(name="City") 
	private String City;
	
	@Column(name="Street") 
	private String Street;
	
	@Column(name="AdressCode") 
	private String AdressCode;
	
	@OneToOne(mappedBy = "address" )
	private Customer customer;

	public Address(int addressId, String country, String city, String street, String adressCode) {
		AddressId = addressId;
		Country = country;
		City = city;
		Street = street;
		AdressCode = adressCode;
	}
	public Address( String country, String city, String street, String adressCode) {
		Country = country;
		City = city;
		Street = street;
		AdressCode = adressCode;
	}
	public Address( ) {

	}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getAdressCode() {
		return AdressCode;
	}
	public void setAdressCode(String adressCode) {
		AdressCode = adressCode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	

	
	
	
	
	
	

}
