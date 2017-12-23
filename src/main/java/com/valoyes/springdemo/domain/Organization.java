package com.valoyes.springdemo.domain;

import com.valoyes.springdemo.service.BusinessService;

public class Organization {

	private String companyName;
	
	private int yearOfIncorporation;
	
	private String postalCode;
	
	private int employeeCount;
	
	private String slogan;
	
	private BusinessService businessService;
	
	
	// Default ctor.
//	public Organization() {
//		
//	}

	// Ctor. 2
	public Organization(String companyName, int yearOfIncorporation) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String comporateSlogan() {
		return slogan;
	}
	
	public String corporateService() {
		return businessService.offerService(companyName);
	}
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation
				+ ", postalCode=" + postalCode + ", employeeCount=" + employeeCount + "]";
	}
}
