package com.valoyes.springdemo.serviceimpl;

import java.util.Random;

import com.valoyes.springdemo.service.BusinessService;

public class EcommerceServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		
		Random random = new Random();
		String service = "\nAs an organization, " + companyName + " offers an outstanding Ecommerce platform." +
						"\nThe annual income exceeds " + random.nextInt(revenue) + "dollars.";
		return service;
		
	}

}
