package com.v4s.custrestws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.v4s.domain.DriversLicence;
import com.v4s.hibernate.LicenseDao;

@Controller
public class DriverLicenceController {

	private static final Logger logger = LoggerFactory.getLogger(DriverLicenceController.class);
	
	@RequestMapping(value= "/customer/licenseDetails" , method=RequestMethod.POST)
	@ResponseBody
	public DriversLicence driverseLicense(@RequestBody DriversLicence driversLicense) {
		
		logger.info("Welcome DrivingLicense !!");
    	LicenseDao ld = new LicenseDao();
    	ld.buildSessionFactory();
    	DriversLicence dl =ld.getDriversLicense(driversLicense.getDriversLicenseId());
    	return dl;
	}
	
	@RequestMapping(value="/customer/license", method=RequestMethod.POST)
	@ResponseBody
	public String saveLicense(@RequestBody DriversLicence driversLicence) {
		
		logger.info("Welcome DrivingLicense !!");
		LicenseDao ld = new LicenseDao();
		ld.buildSessionFactory();
		if (ld.createDriverseLicense(driversLicence)) {
		return"successfully saved";
		}
		else
			return"failed";
	}
}
