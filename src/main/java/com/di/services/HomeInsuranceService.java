package com.di.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.Dependent;

/**
 * Class modeling home insurance service.
 * @author Nikos Chan
 *
 */
@Dependent
public class HomeInsuranceService implements BaseService {
	
    @PostConstruct
    private void initialize() {
        System.out.println("Initializing HomeInsuranceService");
    }

    @PreDestroy
    private void cleanup() {
        System.out.println("Cleaning HomeInsuranceService");
    }


	@Override
	public void getServiceInfo(String messageInfo) {
		System.out.println(messageInfo);
	}
}
