package com.v4s.hibernate;

import org.hibernate.Session;

import com.v4s.domain.DriversLicence;
import com.v4s.entity.InsCustomer;
import com.v4s.entity.InsDriversLicence;

public class LicenseDao extends HibernateBase  {

	public DriversLicence getDriversLicense(Integer id) {
		
	 Session session = getSessionFactoryObj().openSession();
	 InsDriversLicence e = (InsDriversLicence) session.load(InsDriversLicence.class, id);
	 
	 DriversLicence  dl= new DriversLicence();
	 
	 dl.setDriversLicenseId(e.getDriversLicenseId());
	 dl.setComments(e.getComments());
	 dl.setCustomerId(e.getCustomerId());
	 dl.setDriverLicenseNumber(e.getDriverLicenseNumber()); 
	 dl.setExpiryDate(e.getExpiryDate());
	 dl.setIssuedDate(e.getIssuedDate());
	 dl.setIssuedState(e.getIssuedState());
	 dl.setSuspended(e.getSuspended());
	 
	 session.close();
	 return dl;
	}

	public boolean createDriverseLicense(DriversLicence e) {
		// TODO Auto-generated method stub
		Session session=getSessionFactoryObj().openSession();
		session.beginTransaction();
		InsDriversLicence idl = new InsDriversLicence();
		 idl.setDriversLicenseId(e.getDriversLicenseId());
		 idl.setComments(e.getComments());
		 idl.setCustomerId(e.getCustomerId());
		 idl.setDriverLicenseNumber(e.getDriverLicenseNumber()); 
		 idl.setExpiryDate(e.getExpiryDate());
		 idl.setIssuedDate(e.getIssuedDate());
		 idl.setIssuedState(e.getIssuedState());
		 idl.setSuspended(e.getSuspended());
		 
		 session.save(idl);
		 session.getTransaction().commit();
		 session.close();
		return true;
	}
}
