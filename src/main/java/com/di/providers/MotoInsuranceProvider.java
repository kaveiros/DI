package com.di.providers;

import java.util.ArrayList;
import java.util.List;

import com.di.services.MotoInsuranceService;

import jakarta.inject.Inject;

/**
 * Provider class for Moto insurance service.
 * @author Nikos Chan
 *
 */
public class MotoInsuranceProvider {
	
	@Inject
	private MotoInsuranceService motoInsuranceService;
	
	@Inject MotoInsuranceService motoInsuranceService2;
	
	public List<MotoInsuranceService> listOf() {
		List<MotoInsuranceService> motoInsuranceList = new ArrayList<>();
		motoInsuranceService.getServiceInfo("Moto Insurance Service 1 selected.");
		motoInsuranceService2.getServiceInfo("Moto Insurance Service 2 selected.");
		motoInsuranceList.add(motoInsuranceService);
		motoInsuranceList.add(motoInsuranceService2);
		return motoInsuranceList;
	}

}
