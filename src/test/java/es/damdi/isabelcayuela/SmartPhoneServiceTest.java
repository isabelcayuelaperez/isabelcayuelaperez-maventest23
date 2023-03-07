/*
 * 
 */
package es.damdi.isabelcayuela;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.damdi.isabelcayuela.domain.SmartPhone;
import es.damdi.isabelcayuela.domain.pieces.Battery;
import es.damdi.isabelcayuela.domain.pieces.CPU;
import es.damdi.isabelcayuela.domain.pieces.Camera;
import es.damdi.isabelcayuela.domain.pieces.RAM;
import es.damdi.isabelcayuela.service.SmartPhoneServiceImpl;

/**
 * The Class SmartPhoneServiceTest.
 */
public class SmartPhoneServiceTest {

	/** The sut. */
	SmartPhoneServiceImpl sut;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@BeforeEach // se ejecuta antes de cada test
	public void setUp() throws Exception {
		sut = new SmartPhoneServiceImpl();
	}

	/**
	 * Test count.
	 */
	@Test
	public void testCount() {
		Integer numPhones = sut.count();
		assertEquals(3, numPhones);
		
		sut.delete(1L);
		
		numPhones = sut.count();
		assertEquals(2, numPhones);
		
		sut.delete(9999L);
		
		numPhones = sut.count();
		assertEquals(2, numPhones);
		
		sut.deleteAll();
		
		numPhones = sut.count();
		assertEquals(0, numPhones);	}

	/**
	 * Test find all.
	 */
	@Test
	public void testFindAll() {
		List<SmartPhone> phones = sut.findAll();
		assertEquals(3, phones.size());
		
		sut.delete(1L);
		
		phones = sut.findAll();
		assertEquals(2, phones.size());
		
		for (SmartPhone smartPhone : phones) {
			assertNotNull(smartPhone.getId());
		}	}

	/**
	 * Test find one.
	 */
	@Test
	public void testFindOne() {
		SmartPhone phone = sut.findOne(1L);
		assertNotNull(phone);
	}

	/**
	 * Test save.
	 */
	@Test
	public void testSave() {
		SmartPhone phone1 = new SmartPhone(0L, "IPhone X", 
				new RAM(2L, "DDR3", 4),
				new Battery(2L, 3500.0),
				new CPU(2L, 2),
				true,
				new Camera(2L, "front camera", 8.5));
		
		SmartPhone result = sut.save(phone1);
		assertNotNull(result);
	}

	/**
	 * Test delete.
	 */
	@Test
	public void testDelete() {
		boolean result = sut.delete(1L);
		assertTrue(result);
		
		result = sut.delete(1L);
		assertFalse(result);
	}

	/**
	 * Test delete all.
	 */
	@Test
	public void testDeleteAll() {
		sut.deleteAll();
		List<SmartPhone> results = sut.findAll();
		assertEquals(0, results.size());
	}

	/**
	 * Test find by wifi true.
	 */
	@Test
	public void testFindByWifiTrue() {
		List<SmartPhone> phones = sut.findByWifi(true);
		assertEquals(2, phones.size());
	}
	
	/**
	 * Test find by wifi false.
	 */
	@Test
	public void testFindByWifiFalse() {
		List<SmartPhone> phones = sut.findByWifi(false);
		assertEquals(1, phones.size());
	}

}
