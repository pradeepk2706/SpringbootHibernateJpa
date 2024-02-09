package com.learning.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  
@Table(name="address")  
public class Address {

	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	@Column
	private int id;  
	@Column
	private String addressLine1;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;  
	@Column
	private int zipcode;
	@OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
	private Employee employee;  
	
	public int getid() {  
	    return id;  
	}  
	public void setid(int id) {  
	    this.id = id;  
	}  
	public String getAddressLine1() {  
	    return addressLine1;  
	}  
	public void setAddressLine1(String addressLine1) {  
	    this.addressLine1 = addressLine1;  
	}  
	public String getCity() {  
	    return city;  
	}  
	public void setCity(String city) {  
	    this.city = city;  
	}  
	public String getState() {  
	    return state;  
	}  
	public void setState(String state) {  
	    this.state = state;  
	}  
	public String getCountry() {  
	    return country;  
	}  
	public void setCountry(String country) {  
	    this.country = country;  
	}  
	public int getZipcode() {  
	    return zipcode;  
	}  
	public void setZipcode(int zipcode) {  
	    this.zipcode = zipcode;  
	}  

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	 
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine1=" + addressLine1 + ", city=" + city + ", state="
				+ state + ", country=" + country + ", zipcode=" + zipcode + ", employee=" + employee + "]";
	}  
	
	
}
