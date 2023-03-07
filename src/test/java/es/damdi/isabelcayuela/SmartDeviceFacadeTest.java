package es.damdi.isabelcayuela;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.damdi.isabelcayuela.domain.SmartDevice;
import es.damdi.isabelcayuela.domain.SmartPhone;
import es.damdi.isabelcayuela.domain.SmartWatch;
import es.damdi.isabelcayuela.service.SmartDeviceFacade;

public class SmartDeviceFacadeTest {

	@Test
	public  void testCreateSmartphone(){
		
		SmartDevice phone = SmartDeviceFacade.createSmartPhone();
		
		assertNotNull(phone);
		assertTrue(phone instanceof SmartPhone);
		assertEquals(1L, phone.getId());
	}
	
	@Test
	public  void testCreateSmartWatch(){
		
		SmartDevice watch = SmartDeviceFacade.createSmartWatch();
		
		assertNotNull(watch);
		assertTrue(watch instanceof SmartWatch);
		assertEquals(1L, watch.getId());
	}
}
