package com.v4s.hibernate;

import com.v4s.domain.Address;
import com.v4s.domain.Customer;
import com.v4s.domain.CustomerContact;
import com.v4s.domain.CustomerPolicy;
import com.v4s.domain.DriversLicence;


public class InsuranceDomain {
	
	private Customer customer;
	private Address address;
	private DriversLicence driversLicence;
	private CustomerPolicy custPolicy;
	private CustomerContact custContact;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public DriversLicence getDriversLicence() {
		return driversLicence;
	}
	public void setDriversLicence(DriversLicence driversLicence) {
		this.driversLicence = driversLicence;
	}
	public CustomerPolicy getCustPolicy() {
		return custPolicy;
	}
	public void setCustPolicy(CustomerPolicy custPolicy) {
		this.custPolicy = custPolicy;
	}
	public CustomerContact getCustContact() {
		return custContact;
	}
	public void setCustContact(CustomerContact custContact) {
		this.custContact = custContact;
	}
	public String toString() {
		
		String ret = "First Name :  " + customer.getFirstName();
		ret = ret + "Last Name : " + customer.getLastName();
		ret = ret + "Address : " + address.getAddlAddress();
				
		return ret;
	}
	

}
