/*
 * 
 */
package es.damdi.isabelcayuela.domain;

import es.damdi.isabelcayuela.domain.pieces.Battery;
import es.damdi.isabelcayuela.domain.pieces.CPU;
import es.damdi.isabelcayuela.domain.pieces.RAM;

/**
 * The Class SmartDevice.
 */
public abstract class SmartDevice {

	/** The id. */
	private Long id;
	
	/** The name. */
	private String name;
	
	/** The ram. */
	private RAM ram;
	
	/** The battery. */
	private Battery battery;
	
	/** The cpu. */
	private CPU cpu;
	
	/** The wifi. */
	private Boolean wifi;

	/**
	 * Instantiates a new smart device.
	 */
	protected SmartDevice() {
		
	}
	
	/**
	 * Instantiates a new smart device.
	 *
	 * @param id      the id
	 * @param name    the name
	 * @param ram     the ram
	 * @param battery the battery
	 * @param cpu     the cpu
	 * @param wifi    the wifi
	 */
	protected SmartDevice(Long id, String name, RAM ram, Battery battery, CPU cpu, Boolean wifi) {
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.battery = battery;
		this.cpu = cpu;
		this.wifi = wifi;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the ram.
	 *
	 * @return the ram
	 */
	public RAM getRam() {
		return ram;
	}

	/**
	 * Gets the battery.
	 *
	 * @return the battery
	 */
	public Battery getBattery() {
		return battery;
	}

	/**
	 * Gets the cpu.
	 *
	 * @return the cpu
	 */
	public CPU getCpu() {
		return cpu;
	}

	/**
	 * Gets the wifi.
	 *
	 * @return the wifi
	 */
	public Boolean getWifi() {
		return wifi;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Sets the ram.
	 *
	 * @param ram the new ram
	 */
	public void setRam(RAM ram) {
		this.ram = ram;
	}

	/**
	 * Sets the battery.
	 *
	 * @param battery the new battery
	 */
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	/**
	 * Sets the cpu.
	 *
	 * @param cpu the new cpu
	 */
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	/**
	 * Sets the wifi.
	 *
	 * @param wifi the new wifi
	 */
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "SmartDevice [id=" + id + ", name=" + name + ", ram=" + ram + ", battery=" + battery + ", cpu=" + cpu
				+ ", wifi=" + wifi + "]";
	}

}
