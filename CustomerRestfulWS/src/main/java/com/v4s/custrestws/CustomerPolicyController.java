package com.v4s.custrestws;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.v4s.domain.CustomerPolicy;
import com.v4s.hibernate.CustomerPdao;

@Controller
public class CustomerPolicyController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerPolicyController.class);
	
	@RequestMapping(value="/customer/customerPolicy", method=RequestMethod.POST)
	@ResponseBody
	public CustomerPolicy custPolicy(@RequestBody CustomerPolicy customerPolicy ) {
		
		logger.info("Welcome LicensePolicy !!");
		
		CustomerPdao cp= new CustomerPdao();
		cp.buildSessionFactory();
		CustomerPolicy custP= cp.getPolicy(customerPolicy.getCustomerPolicyId());
		return custP;
	}
	
	@RequestMapping(value="/customer/createcustomerPolicy", method=RequestMethod.POST)
	@ResponseBody
	public String createCustPolicy(@RequestBody CustomerPolicy customerPolicy ) {
		
		logger.info("Welcome LicensePolicy !!");
		CustomerPdao cp= new CustomerPdao();
		cp.buildSessionFactory();
		if(cp.createcreateCustPolicy(customerPolicy)) {;
		return "succesfully saved";
		}
		else
			return"failed";
	}

}
