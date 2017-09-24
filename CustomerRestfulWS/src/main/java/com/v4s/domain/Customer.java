package com.v4s.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {
	private Integer customerId;
	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	private Integer addressId;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		
		c.setFirstName("John");
		c.setLastName("Burton");
		
		Customer c2 = new Customer();
		
		c2.setFirstName("Matthew");
		c2.setLastName("Burton");
		
		System.out.println("Customer First Name: " + c2.getFirstName());
		System.out.println("Customer Last Name: " + c2.getLastName());
		
		
	}
}
