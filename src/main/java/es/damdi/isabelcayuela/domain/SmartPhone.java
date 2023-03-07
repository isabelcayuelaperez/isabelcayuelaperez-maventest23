/*
 * 
 */
package es.damdi.isabelcayuela.domain;

import es.damdi.isabelcayuela.domain.pieces.Battery;
import es.damdi.isabelcayuela.domain.pieces.CPU;
import es.damdi.isabelcayuela.domain.pieces.Camera;
import es.damdi.isabelcayuela.domain.pieces.RAM;

/**
 * The Class SmartPhone.
 */
public class SmartPhone extends SmartDevice {
	
	/** The camera. */
	private Camera camera;

	/**
	 * Instantiates a new smart phone.
	 */
	public SmartPhone() {}
	


	/**
	 * Instantiates a new smart phone.
	 *
	 * @param id      the id
	 * @param name    the name
	 * @param ram     the ram
	 * @param battery the battery
	 * @param cpu     the cpu
	 * @param wifi    the wifi
	 * @param camera  the camera
	 */
	public SmartPhone(Long id, String name, RAM ram, Battery battery, CPU cpu, Boolean wifi, Camera camera) {
		super(id, name, ram, battery, cpu, wifi);
		this.camera = camera;
	}



	/**
	 * Gets the camera.
	 *
	 * @return the camera
	 */
	public Camera getCamera() {
		return camera;
	}

	/**
	 * Sets the camera.
	 *
	 * @param camera the new camera
	 */
	public void setCamera(Camera camera) {
		this.camera = camera;
	}



	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "SmartPhone [camera=" + camera + ", getId()=" + getId() + ", getName()=" + getName() + ", getRam()="
				+ getRam() + ", getBattery()=" + getBattery() + ", getCpu()=" + getCpu() + ", getWifi()=" + getWifi()
				+ "]";
	}


}
