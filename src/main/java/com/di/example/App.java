package com.di.example;

import java.util.List;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.di.providers.CarInsuranceProvider;
import com.di.providers.HomeInsuranceProvider;
import com.di.providers.MotoInsuranceProvider;
import com.di.services.CarInsuranceService;
import com.di.services.HomeInsuranceService;
import com.di.services.MotoInsuranceService;

public class App {

    public static void main(String[] args) {
        System.out.println("DI");
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        final HomeInsuranceService homeInsuranceService = container.select(HomeInsuranceProvider.class).get().singletonOf();
        final CarInsuranceService carInsuranceService =  container.select(CarInsuranceProvider.class).get().oneOf();
        final List<MotoInsuranceService> motoInsuranceServiceList = container.select(MotoInsuranceProvider.class).get().listOf();
        container.shutdown();
    }
}
