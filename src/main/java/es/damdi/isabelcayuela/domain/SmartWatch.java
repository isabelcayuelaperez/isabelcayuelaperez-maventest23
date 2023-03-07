/*
 * 
 */
package es.damdi.isabelcayuela.domain;

import es.damdi.isabelcayuela.domain.pieces.Battery;
import es.damdi.isabelcayuela.domain.pieces.CPU;
import es.damdi.isabelcayuela.domain.pieces.HealthMonitor;
import es.damdi.isabelcayuela.domain.pieces.RAM;

/**
 * The Class SmartWatch.
 */
public class SmartWatch extends SmartDevice{

	/** The monitor. */
	private HealthMonitor monitor;
	
	/**
	 * Instantiates a new smart watch.
	 */
	public SmartWatch() {}
	
	/**
	 * Instantiates a new smart watch.
	 *
	 * @param id      the id
	 * @param name    the name
	 * @param ram     the ram
	 * @param battery the battery
	 * @param cpu     the cpu
	 * @param wifi    the wifi
	 * @param monitor the monitor
	 */
	public SmartWatch(Long id, String name, RAM ram, Battery battery, CPU cpu, Boolean wifi, HealthMonitor monitor) {
		super(id, name, ram, battery, cpu, wifi);
		this.monitor = monitor;
	}

	/**
	 * Gets the monitor.
	 *
	 * @return the monitor
	 */
	public HealthMonitor getMonitor() {
		return monitor;
	}

	/**
	 * Sets the monitor.
	 *
	 * @param monitor the new monitor
	 */
	public void setMonitor(HealthMonitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "SmartWatch [monitor=" + monitor + ", getId()=" + getId() + ", getName()=" + getName() + ", getRam()="
				+ getRam() + ", getBattery()=" + getBattery() + ", getCpu()=" + getCpu() + ", getWifi()=" + getWifi()
				+ "]";
	}

	
	
}
