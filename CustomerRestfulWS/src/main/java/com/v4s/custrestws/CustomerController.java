package com.v4s.custrestws;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.v4s.domain.Customer;
import com.v4s.hibernate.Hibernate;
import com.v4s.hibernate.InsuranceDomain;

@Controller
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/customer/{custId}", method = RequestMethod.GET)
	@ResponseBody
	public InsuranceDomain customerGet(@PathVariable("custId") int a) {
		logger.info("Welcome Customer !!");
    	Hibernate hb = new Hibernate();
    	hb.buildSessionFactory();
    	InsuranceDomain cs = hb.getCustomer(a);
		return cs;
	}
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	@ResponseBody
	public InsuranceDomain customerSearch(@RequestBody Customer customer) {
		logger.info("Welcome Customer !!");
    	Hibernate hb = new Hibernate();
    	hb.buildSessionFactory();
    	InsuranceDomain cs = hb.getCustomer(customer.getCustomerId());		
		return cs;
	}
}
