package com.di.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.di.providers.CarInsuranceProvider;
import com.di.providers.HomeInsuranceProvider;
import com.di.providers.MotoInsuranceProvider;
import com.di.services.CarInsuranceService;
import com.di.services.HomeInsuranceService;
import com.di.services.MotoInsuranceService;

@RunWith(MockitoJUnitRunner.class)
public class DiTest {

    @Mock
    private CarInsuranceService carInsuranceService;
    
    @InjectMocks
    private CarInsuranceProvider carInsuranceProvider;
    
    @Mock
    private HomeInsuranceService homeInsuranceService;
    
    @InjectMocks
    private HomeInsuranceProvider homeInsuranceProvider;
    
    @Mock
    private MotoInsuranceService motoInsuranceService;
    
    @Mock
    private MotoInsuranceService motoInsuranceService2;
    
    @InjectMocks
    private MotoInsuranceProvider motoInsuranceProvider;
 
	
	@Test
	public void testCarInsuranceService() {
		
		Mockito.doNothing().when(carInsuranceService).getServiceInfo(Mockito.isA(String.class));
		carInsuranceService.getServiceInfo("Car Service");
		Mockito.verify(carInsuranceService, Mockito.times(1)).getServiceInfo("Car Service");		
	}
	
	@Test
	public void testMotoInsuranceService() {
		
		Mockito.doNothing().when(motoInsuranceService).getServiceInfo(Mockito.isA(String.class));
		motoInsuranceService.getServiceInfo("Moto Service");
		Mockito.verify(motoInsuranceService, Mockito.times(1)).getServiceInfo("Moto Service");		
	}
	
	@Test
	public void testHomeInsuranceService() {
		
		Mockito.doNothing().when(homeInsuranceService).getServiceInfo(Mockito.isA(String.class));
		homeInsuranceService.getServiceInfo("Home Service");
		Mockito.verify(homeInsuranceService, Mockito.times(1)).getServiceInfo("Home Service");		
	}
	
	@Test
	public void testMotoProvider() {
		assertNotNull(motoInsuranceProvider);
		List<MotoInsuranceService> list = new ArrayList<>();
		list.add(motoInsuranceService);
		list.add(motoInsuranceService2);
		assertThat(motoInsuranceProvider.listOf(), containsInAnyOrder(motoInsuranceService, motoInsuranceService2));
	}
	
	@Test
	public void testHomeProvider() {
		assertNotNull(homeInsuranceProvider);
		assertTrue(homeInsuranceProvider.singletonOf() instanceof HomeInsuranceService);
	}
	
	@Test
	public void testCarProvider() {
		assertNotNull(carInsuranceProvider);
		assertTrue(carInsuranceProvider.oneOf() instanceof CarInsuranceService);
	}

}
