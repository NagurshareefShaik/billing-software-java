package com.billingsoftware.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.billingsoftware.controller.BillingController;
import com.billingsoftware.repositorty.AddItemsRepo;

@Configuration
public class DependancyInjection {
	
	@Autowired
	AddItemsRepo addItemsRepo;
	
//	@Bean
//	public BillingController billingController() {
//		return new BillingController();
//	}

}
