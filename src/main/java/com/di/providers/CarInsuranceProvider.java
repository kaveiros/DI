package com.di.providers;

import com.di.services.CarInsuranceService;

import jakarta.inject.Inject;

public class CarInsuranceProvider {
	
	@Inject
	private CarInsuranceService carInsuranceService;
	
	public CarInsuranceService oneOf() {
		carInsuranceService.getServiceInfo("Car Insurance Service selected");
		return carInsuranceService;
	}

}
