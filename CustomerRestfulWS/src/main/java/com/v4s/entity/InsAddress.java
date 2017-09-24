package com.v4s.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name = "InsAddress")
public class InsAddress {
	
	@Id
    @GeneratedValue
    @Column(name = "AddressId")
	private Integer addressId;
	
	@Column(name = "streetNumber")
	private Integer streetNumber;
	@Column(name = "streetName")
	private String streetName;
	@Column(name = "suiteNumber")
	private String suiteNumber;
	@Column(name = "addlAdress")
	private String addlAddress;
	@Column(name = "City")
	private String city;
	@Column(name = "State")
	private String state;
	@Column(name = "Country")
	private String country;
	
	@ManyToOne
	@JoinColumn(name="CustomerId")
	private InsCustomer customer;
	
	public InsAddress() {}
	
	public InsAddress(Integer sNumber, String sName, String suNumber, String aAddress, String c, String s, String cn) {
		this.streetNumber = sNumber;
		this.streetName = sName;
		this.suiteNumber = suNumber;
		this.addlAddress = aAddress;
		this.city = c;
		this.state = s;
		this.country = cn;
	}

	public InsCustomer getCustomer() {
		return customer;
	}
	public void setCustomer(InsCustomer customer) {
		this.customer = customer;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getSuiteNumber() {
		return suiteNumber;
	}
	public void setSuiteNumber(String suiteNumber) {
		this.suiteNumber = suiteNumber;
	}
	public String getAddlAddress() {
		return addlAddress;
	}
	public void setAddlAddress(String addlAddress) {
		this.addlAddress = addlAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
