package com.v4s.entity;


import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name="InsCustomerPolicy")
public class InsCustomerPolicy {
	

	@Id
	@GeneratedValue
	@Column(name="CustomerPolicyId")
	private Integer customerPolicyId ; 
	
	@Column(name="PolicyNumber")
	private Integer policyNumber;
	
	@Column(name="PolicyName")
	   private String policyName;
	
	@Column(name="IssuedState")
	   private String issuedState;
	
	@Column(name="IssuedDate")
	   private  Date issuedDate; 
	
	@Column(name="ExpiryDate")
	   private Date expiryDate;
	
	@Column(name="Comments")
	   private String comments;
	
	@Column(name="CustomerId")
	   private Integer customerId;
	
	public InsCustomerPolicy(){
		
	}
	
	
	public InsCustomerPolicy(Integer customerPolicyId, Integer policyNumber, String policyName, String issuedState,
			Date issuedDate, Date expiryDate, String comments, Integer customerId) {
		super();
		this.customerPolicyId = customerPolicyId;
		this.policyNumber = policyNumber;
		this.policyName = policyName;
		this.issuedState = issuedState;
		this.issuedDate = issuedDate;
		this.expiryDate = expiryDate;
		this.comments = comments;
		this.customerId = customerId;
	}
	   
   public Integer getCustomerPolicyId() {
		return customerPolicyId;
	}
	public void setCustomerPolicyId(Integer customerPolicyId) {
		this.customerPolicyId = customerPolicyId;
	}
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
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
