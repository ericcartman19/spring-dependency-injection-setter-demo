package com.valoyes.springdemo.serviceimpl;

import java.util.Random;

import com.valoyes.springdemo.service.BusinessService;

public class CloudServiceImpl implements BusinessService{

	public String offerService(String companyName) {
		
		Random random = new Random();
		String service = "\nAs an organization, " + companyName + " offers world class Cloud computin infrastructure." +
						"\nThe annual income exceeds " + random.nextInt(revenue) + "dollars.";
		return service;
	}

}
