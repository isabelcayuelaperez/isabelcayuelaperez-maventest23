/*
 * 
 */
package es.damdi.isabelcayuela.domain.pieces;

/**
 * The Class HealthMonitor.
 */
public class HealthMonitor {

	/** The id. */
	private Long id;
	
	/** The blood pressure. */
	private Double bloodPressure;
	
	/** The sleep quality. */
	private Integer sleepQuality;
	
	/**
	 * Instantiates a new health monitor.
	 *
	 * @param id            the id
	 * @param bloodPressure the blood pressure
	 * @param sleepQuality  the sleep quality
	 */
	public HealthMonitor(Long id, Double bloodPressure, Integer sleepQuality) {
		this.id = id;
		this.bloodPressure = bloodPressure;
		this.sleepQuality = sleepQuality;
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
	 * Gets the blood pressure.
	 *
	 * @return the blood pressure
	 */
	public Double getBloodPressure() {
		return bloodPressure;
	}
	
	/**
	 * Gets the sleep quality.
	 *
	 * @return the sleep quality
	 */
	public Integer getSleepQuality() {
		return sleepQuality;
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
	 * Sets the blood pressure.
	 *
	 * @param bloodPressure the new blood pressure
	 */
	public void setBloodPressure(Double bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	
	/**
	 * Sets the sleep quality.
	 *
	 * @param sleepQuality the new sleep quality
	 */
	public void setSleepQuality(Integer sleepQuality) {
		this.sleepQuality = sleepQuality;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "HealthMonitor [id=" + id + ", bloodPressure=" + bloodPressure + ", sleepQuality=" + sleepQuality + "]";
	}
	
	
}
