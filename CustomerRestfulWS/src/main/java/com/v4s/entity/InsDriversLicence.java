package com.v4s.entity;

import java.sql.Date;
import javax.persistence.*;


@Entity
@Table(name="InsDriversLicense")
public class InsDriversLicence {
	
	@Id
	@Column(name="DriversLicenseId")
	@GeneratedValue
	private Integer driversLicenseId;
	   
	@Column(name="DriverLicenseNumber")   
	private Integer driverLicenseNumber;
	   
	@Column(name="IssuedState")   
	private String issuedState;
	   
	@Column(name="IssuedDate")  
	private Date issuedDate; 
	   
	@Column(name="ExpiryDate")   
	private  Date expiryDate; 
	   
	@Column(name="suspended")   
	private String suspended;
	   
	@Column(name="comments")   
	private String comments;
	   
	@Column(name="customerId")   
	private Integer customerId;
	
	public InsDriversLicence() {
		
	}

	/*public InsDriversLicence(Integer driversLicenseId, Integer driverLicenseNumber, String issuedState, Date issuedDate,
			Date expiryDate, String suspended, String comments, Integer customerId) {
		this.driversLicenseId = driversLicenseId;
		this.driverLicenseNumber = driverLicenseNumber;
		this.issuedState = issuedState;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
		this.suspended = suspended;
		this.comments = comments;
		this.customerId = customerId;
	}*/
	
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
