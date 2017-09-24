package com.v4s.domain;

import java.sql.Date;


public class CustomerPolicy {

	   private Integer customerPolicyId ; 
	   private Integer policyNumber;
	   private String policyName;
	   private String issuedState;
	   private  Date issuedDate; 
	   private Date expiryDate;
	   private String comments;
	   private Integer customerId;
	   
	   
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
