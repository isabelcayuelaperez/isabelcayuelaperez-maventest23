/*
 * 
 */
package es.damdi.isabelcayuela.domain.pieces;

/**
 * The Class Battery.
 */
public class Battery {
	
	/** The id. */
	private Long id;
	
	/** The capacity. */
	private Double capacity; // mAh capacity
	
	/**
	 * Instantiates a new battery.
	 *
	 * @param id       the id
	 * @param capacity the capacity
	 */
	public Battery(Long id, Double capacity) {
		this.id = id;
		this.capacity = capacity;
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
	 * Gets the capacity.
	 *
	 * @return the capacity
	 */
	public Double getCapacity() {
		return capacity;
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
	 * Sets the capacity.
	 *
	 * @param capacity the new capacity
	 */
	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Battery [id=" + id + ", capacity=" + capacity + "]";
	}
	
	

}
