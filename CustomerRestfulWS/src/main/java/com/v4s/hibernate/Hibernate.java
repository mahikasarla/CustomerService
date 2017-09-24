package com.v4s.hibernate;

import java.util.Date;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import java.sql.Connection;

import com.v4s.domain.Address;
import com.v4s.domain.Customer;
import com.v4s.domain.DriversLicence;
import com.v4s.domain.Login;
import com.v4s.entity.InsAddress;
import com.v4s.entity.InsCustomer;
import com.v4s.entity.InsCustomerContact;
import com.v4s.entity.InsCustomerPolicy;
import com.v4s.entity.InsDriversLicence;

public class Hibernate extends HibernateBase {
	
	public boolean create(InsuranceDomain e) {
		
        Session session = getSessionFactoryObj().openSession();
        session.beginTransaction();

        InsCustomer iCust = new InsCustomer();
        iCust.setFirstName(e.getCustomer().getFirstName());
        iCust.setLastName(e.getCustomer().getLastName());
        iCust.setDateOfBirth(e.getCustomer().getDateOfBirth());
        // Save Customer
        session.save(iCust);
        
        // Save Address
        InsAddress iAddr = new InsAddress();
        iAddr.setCity(e.getAddress().getCity());
        iAddr.setCountry(e.getAddress().getCountry());
        iAddr.setState(e.getAddress().getState());
        iAddr.setStreetName(e.getAddress().getStreetName());
        iAddr.setStreetNumber(e.getAddress().getStreetNumber());
        iAddr.setCustomer(iCust);
        session.save(iAddr);

      // Save Drivers License
        InsDriversLicence iDrivers= new InsDriversLicence();
        iDrivers.setDriversLicenseId(e.getDriversLicence().getDriversLicenseId());
        iDrivers.setDriverLicenseNumber(e.getDriversLicence().getDriverLicenseNumber());
        iDrivers.setCustomerId(e.getDriversLicence().getCustomerId());
        iDrivers.setComments(e.getDriversLicence().getComments());
        iDrivers.setIssuedState(e.getDriversLicence().getIssuedState());
        iDrivers.setIssuedDate(e.getDriversLicence().getIssuedDate());
        iDrivers.setExpiryDate(e.getDriversLicence().getExpiryDate());
        iDrivers.setSuspended(e.getDriversLicence().getSuspended());
        session.save(iDrivers);
        
        // Save Customer Policy
        InsCustomerPolicy iCustPolicy=new InsCustomerPolicy();
        iCustPolicy.setCustomerId(e.getCustPolicy().getCustomerId());
        iCustPolicy.setCustomerPolicyId(e.getCustPolicy().getCustomerPolicyId());
        iCustPolicy.setPolicyName(e.getCustPolicy().getPolicyName());
        iCustPolicy.setPolicyNumber(e.getCustPolicy().getPolicyNumber());
        iCustPolicy.setIssuedState(e.getCustPolicy().getIssuedState());
        iCustPolicy.setIssuedDate(e.getCustPolicy().getIssuedDate());
        iCustPolicy.setExpiryDate(e.getCustPolicy().getExpiryDate());
        iCustPolicy.setComments(e.getCustPolicy().getComments());
        session.save(iCustPolicy);
        
        // Save Customer Contact
        InsCustomerContact iCustContact= new InsCustomerContact();
        iCustContact.setContactId(e.getCustContact().getContactId());
        iCustContact.setCustomerId(e.getCustContact().getCustomerId());
        iCustContact.setEmail(e.getCustContact().getEmail());
        iCustContact.setFaxNumber(e.getCustContact().getFaxNumber());
        iCustContact.setPhoneNumber(e.getCustContact().getPhoneNumber());
        
        session.getTransaction().commit();
        session.close();
                
        System.out.println("Successfully created " + e.toString());
        return true;
    }
    
    public InsuranceDomain getCustomer(Integer id) {
        Session session = getSessionFactoryObj().openSession();
        InsCustomer e = (InsCustomer) session.load(InsCustomer.class, id);
        
        InsuranceDomain insdomain = new InsuranceDomain();
        
        Customer dCust = new Customer();
        dCust.setCustomerId(e.getCustomerId());
        dCust.setDateOfBirth(e.getDateOfBirth());
        dCust.setFirstName(e.getFirstName());
        dCust.setLastName(e.getLastName());
        insdomain.setCustomer(dCust);
        
        Set<InsAddress> addrSet = e.getAddresses();
        
        for (InsAddress ea : addrSet) {
        	Address add = new Address();
        	add.setAddlAddress(ea.getAddlAddress());
        	add.setAddressId(ea.getAddressId());
        	add.setCity(ea.getCity());
        	add.setCountry(ea.getCountry());
        	add.setState(ea.getState());
        	add.setStreetName(ea.getStreetName());
        	add.setStreetNumber(ea.getStreetNumber());
        	add.setSuiteNumber(ea.getSuiteNumber());
        	insdomain.setAddress(add);
        }
        
        session.close();
        return insdomain;
    }
   
    
    public static void main1(String[] args) {
    	Hibernate hb = new Hibernate();
    	hb.buildSessionFactory();
    	
    	InsuranceDomain id = new InsuranceDomain();
    	
    	Customer c = new Customer();
    	c.setFirstName("Martin");
    	c.setLastName("Burton");
    	c.setDateOfBirth(new Date());
    	
    	Address a = new Address();
    	a.setStreetNumber(12000);
    	a.setStreetName("Down Run");
    	a.setCity("Irving");
    	a.setState("Texas");
    	a.setCountry("USA");
    	a.setSuiteNumber("100");
    	
    	id.setCustomer(c);
    	id.setAddress(a);
    	
    	
    	hb.create(id);
    	
    	InsuranceDomain cs = hb.getCustomer(15);
    	
    	LicenseDao ld = new LicenseDao();
    	ld.buildSessionFactory();
    	
    	DriversLicence dl =ld.getDriversLicense(3);
    	
    	System.out.println("Customer First Name: " + cs.getCustomer().getFirstName());
    	System.out.println("Customer Last Name: " + cs.getCustomer().getLastName());
    	
    }
  
    public static void main(String[] args) {
    	
    	LoginDao ld = new LoginDao();
    	ld.getSessionFactoryObj();
    	
    	Login l = ld.getLogin(1);
    	
    	System.out.println("Customer First Name: " + l.getUserName());
    	
    	
    }
 
}
