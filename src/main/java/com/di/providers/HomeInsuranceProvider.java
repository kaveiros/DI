package com.di.providers;

import com.di.services.HomeInsuranceService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class HomeInsuranceProvider {
	
	@Inject
	private HomeInsuranceService homeInsuranceService;
	
	public HomeInsuranceService singletonOf() {
		homeInsuranceService.getServiceInfo("Home Insurance Service selected.");
		return homeInsuranceService;
	}

}
