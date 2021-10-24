package com.di.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.Dependent;

@Dependent
public class MotoInsuranceService implements BaseService{
    @PostConstruct
    private void initialize() {
        System.out.println("Initializing MotoInsuranceService");
    }

    @PreDestroy
    private void cleanup() {
        System.out.println("Cleaning MotoInsuranceService");
    }

	@Override
	public void getServiceInfo(String messageInfo) {
		System.out.println(messageInfo);
	}
	

}
