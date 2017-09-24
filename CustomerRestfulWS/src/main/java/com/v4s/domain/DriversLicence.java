package com.v4s.domain;

import java.sql.Date;

public class DriversLicence {

	private Integer driversLicenseId;   
	private Integer driverLicenseNumber;  
	private String issuedState; 
	private Date issuedDate;   
	private  Date expiryDate;    
	private String suspended; 
	private String comments;   
	private Integer customerId;
	
	public Integer getDriversLicenseId() {
		return driversLicenseId;
	}
	public void setDriversLicenseId(Integer driversLicenseId) {
		this.driversLicenseId = driversLicenseId;
	}
	public Integer getDriverLicenseNumber() {
		return driverLicenseNumber;
	}
	public void setDriverLicenseNumber(Integer driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}
	public String getIssuedState() {
		return issuedState;
	}
	public void setIssuedState(String issuedState) {
		this.issuedState = issuedState;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getSuspended() {
		return suspended;
	}
	public void setSuspended(String suspended) {
		this.suspended = suspended;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
}
