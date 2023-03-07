/*
 * 
 */
package es.damdi.isabelcayuela.service;

import es.damdi.isabelcayuela.domain.SmartDevice;

/**
 * A factory for creating SmartDevice objects.
 */
public class SmartDeviceFactory {
	
	/** The Constant PHONE. */
	private static final String PHONE = "phone";
	
	/** The Constant WATCH. */
	private static final String WATCH = "watch";

	/**
	 * Instantiates a new smart device factory.
	 */
	private SmartDeviceFactory() {}

	/**
	 * Creates a new SmartDevice object.
	 *
	 * @param type the type
	 * @return the smart device
	 */
	public static SmartDevice createByType(String type) {
		
//		return switch (type) {
//			case PHONE -> SmartDeviceFacade.createSmartPhone();
//			case WATCH -> SmartDeviceFacade.createSmartWatch();
//			default -> throw new IllegalArgumentException("Unexpected value: " + type);
//		};
		
		switch (type) {
		case PHONE:
			return SmartDeviceFacade.createSmartPhone();
		case WATCH:
			return SmartDeviceFacade.createSmartWatch();
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
	

}
