package com.v4s.entity;

import javax.persistence.*;

@Entity
@Table(name="InsCustomerContact")
public class InsCustomerContact {
	
	@Id
	@GeneratedValue
	@Column(name="ContactId")
   private Integer contactId;
	
	@Column(name="Email")
   private String email;
	
	@Column(name="PhoneNumber")
   private Integer phoneNumber; 
	
	@Column(name="FaxNumber")
   private Integer faxNumber; 
	
	@Column(name="CustomerId")
   private Integer customerId;
	
public InsCustomerContact(){
		
	}
	
public InsCustomerContact(Integer contactId, String email, Integer phoneNumber, Integer faxNumber,
		Integer customerId) {
	
	this.contactId = contactId;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.faxNumber = faxNumber;
	this.customerId = customerId;
}

public Integer getContactId() {
	return contactId;
}

public void setContactId(Integer contactId) {
	this.contactId = contactId;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Integer getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(Integer phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public Integer getFaxNumber() {
	return faxNumber;
}

public void setFaxNumber(Integer faxNumber) {
	this.faxNumber = faxNumber;
}

public Integer getCustomerId() {
	return customerId;
}

public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}

}
