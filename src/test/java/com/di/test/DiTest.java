package com.di.test;

import org.jboss.weld.junit5.EnableWeld;
import org.junit.jupiter.api.Test;

import com.di.services.CarInsuranceService;
import com.di.services.HomeInsuranceService;

import jakarta.inject.Inject;

@EnableWeld
public class DiTest {
	
	@Inject
	private CarInsuranceService carInsuranceService;
	
	@Inject HomeInsuranceService homeInsuranceService;
	
	@Test
	void testCarInsuranceService() {
	
	}

}
