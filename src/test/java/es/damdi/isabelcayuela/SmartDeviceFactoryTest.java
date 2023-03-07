/*
 * 
 */
package es.damdi.isabelcayuela;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import es.damdi.isabelcayuela.domain.SmartDevice;
import es.damdi.isabelcayuela.domain.SmartPhone;
import es.damdi.isabelcayuela.domain.SmartWatch;
import es.damdi.isabelcayuela.service.SmartDeviceFactory;

/**
 * The Class SmartDeviceFactoryTest.
 */
public class SmartDeviceFactoryTest {

	
	/**
	 * Test smart phone instance.
	 */
	@Test
	public void testSmartPhoneInstance() {
		// 1. preparacion
		
		// 2. ejecucion del codigo a testear
		SmartDevice phone = SmartDeviceFactory.createByType("phone");
		
		// 3. verificaciones
		assertNotNull(phone);
		assertTrue(phone instanceof SmartPhone);
		assertEquals("Default smartphone", phone.getName());
		assertEquals(1L, phone.getId());
	}
	
	
	/**
	 * Test smart watch instance.
	 */
	@Test
	public void testSmartWatchInstance() {
		// 1. preparacion
		
		// 2. ejecucion del codigo a testear
		SmartDevice watch = SmartDeviceFactory.createByType("watch");
		
		// 3. verificaciones
		assertNotNull(watch);
		assertTrue(watch instanceof SmartWatch);
		assertEquals("Default smartwatch", watch.getName());
		assertEquals(1L, watch.getId());
	}
	
	/**
	 * Test default instance.
	 */
	@Test
	public void testDefaultInstance() {
		
		// 2. ejecucion del codigo a testear
		Exception exception = assertThrows(
				IllegalArgumentException.class, 
				() -> SmartDeviceFactory.createByType("notexists")
				);
		
		assertEquals("Unexpected value: notexists", exception.getMessage());

	}
	
	
	
	
	
	
	
}
