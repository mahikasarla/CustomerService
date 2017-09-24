package com.v4s.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "InsCustomer")
public class InsCustomer {
	
	@Id
    @GeneratedValue
    @Column(name = "CustomerId")
	private Integer customerId;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "DateOfBirth")
	private Date dateOfBirth;
	
	@OneToMany(mappedBy="customer")
	private Set<InsAddress> addresses;
	


	public Set<InsAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<InsAddress> addresses) {
		this.addresses = addresses;
	}

	public InsCustomer() {}
	
	public InsCustomer(String lName, String fName, Date dob) {
		this.lastName = lName;
		this.firstName = fName;
		this.dateOfBirth = dob;
	}
	
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
	
}
