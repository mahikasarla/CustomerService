package com.v4s.domain;

public class CustomerContact {
	
	   private Integer contactId;
	   private String email;	
	   private Integer phoneNumber; 
	   private Integer faxNumber; 
	   private Integer customerId;
	   
	
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
