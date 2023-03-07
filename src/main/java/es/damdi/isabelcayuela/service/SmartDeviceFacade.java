/*
 * 
 */
package es.damdi.isabelcayuela.service;

import es.damdi.isabelcayuela.domain.SmartDevice;
import es.damdi.isabelcayuela.domain.SmartPhone;
import es.damdi.isabelcayuela.domain.SmartWatch;
import es.damdi.isabelcayuela.domain.pieces.Battery;
import es.damdi.isabelcayuela.domain.pieces.CPU;
import es.damdi.isabelcayuela.domain.pieces.Camera;
import es.damdi.isabelcayuela.domain.pieces.HealthMonitor;
import es.damdi.isabelcayuela.domain.pieces.RAM;

/**
 * The Class SmartDeviceFacade.
 */
public class SmartDeviceFacade {
	
	/**
	 * Instantiates a new smart device facade.
	 */
	private SmartDeviceFacade() {}

	/**
	 * Creates the smart phone.
	 *
	 * @return the smart device
	 */
	public static SmartDevice createSmartPhone() {
		// smartdevice pieces
		Battery battery = new Battery(1L, 0.0);
		RAM ram = new RAM(1L, "DDR4", 8);
		CPU cpu = new CPU(1L, 4);
		
		// smartphone exclusive pieces
		Camera camera = new Camera(1L, "front camera", 12.5);
			
		SmartPhone phone = new SmartPhone(1L, "Default smartphone", ram, battery, cpu, true, camera);
		phone.getCpu().start();
		
		return phone;
	}
	
	/**
	 * Creates the smart watch.
	 *
	 * @return the smart device
	 */
	public static SmartDevice createSmartWatch() {
		// smartdevice pieces
		Battery battery = new Battery(1L, 0.0);
		RAM ram = new RAM(1L, "DDR4", 8);
		CPU cpu = new CPU(1L, 4);
		
		// smartphone exclusive pieces
		HealthMonitor monitor = new HealthMonitor(1L, 0.0, 0);
			
		return new SmartWatch(1L, "Default smartwatch", ram, battery, cpu, true, monitor);
	} 
}
