package com.di.providers;

import com.di.services.CarInsuranceService;

import jakarta.inject.Inject;

/**
 * Provider class for Car Insurance service.
 * @author Nikos Chan
 *
 */
public class CarInsuranceProvider {
	
	@Inject
	private CarInsuranceService carInsuranceService;
	
	public CarInsuranceService oneOf() {
		carInsuranceService.getServiceInfo("Car Insurance Service selected");
		return carInsuranceService;
	}

}
