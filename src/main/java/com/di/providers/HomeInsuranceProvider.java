package com.di.providers;

import com.di.services.HomeInsuranceService;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Provider class for home insurance service.
 * @author Nikos Chan
 *
 */
@ApplicationScoped
public class HomeInsuranceProvider {
	
	@Inject
	private HomeInsuranceService homeInsuranceService;
	
	public HomeInsuranceService singletonOf() {
		homeInsuranceService.getServiceInfo("Home Insurance Service selected.");
		return homeInsuranceService;
	}

}
