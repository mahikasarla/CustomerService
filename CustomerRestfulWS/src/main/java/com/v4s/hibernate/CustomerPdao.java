package com.v4s.hibernate;

import org.hibernate.Session;

import com.v4s.domain.CustomerPolicy;
import com.v4s.entity.InsCustomerPolicy;

public class CustomerPdao extends Hibernate {

	public CustomerPolicy getPolicy(Integer customerPolicyId) {
	Session session = getSessionFactoryObj().openSession();
	InsCustomerPolicy icp =(InsCustomerPolicy)session.load(InsCustomerPolicy.class, customerPolicyId );
	
	CustomerPolicy cust= new CustomerPolicy();
	cust.setComments(icp.getComments());
	cust.setCustomerId(icp.getCustomerId());
	cust.setCustomerPolicyId(icp.getCustomerPolicyId());
	cust.setExpiryDate(icp.getExpiryDate());
	cust.setIssuedDate(icp.getIssuedDate());
	cust.setIssuedState(icp.getIssuedState());
	cust.setPolicyName(icp.getPolicyName());
	cust.setPolicyNumber(icp.getPolicyNumber());
	
	session.close();
		return cust;
	}

	public boolean createcreateCustPolicy(CustomerPolicy cust) {
		Session session = getSessionFactoryObj().openSession();
		session.beginTransaction();
		InsCustomerPolicy icp= new InsCustomerPolicy();
		
		icp.setComments(cust.getComments());
		icp.setCustomerId(cust.getCustomerId());
		icp.setCustomerPolicyId(cust.getCustomerPolicyId());
		icp.setExpiryDate(cust.getExpiryDate());
		icp.setIssuedDate(cust.getIssuedDate());
		icp.setIssuedState(cust.getIssuedState());
		icp.setPolicyName(cust.getPolicyName());
		icp.setPolicyNumber(cust.getPolicyNumber());
		
		session.save(icp);
		session.getTransaction().commit();
		session.close();
		
		return true;
	}

}
