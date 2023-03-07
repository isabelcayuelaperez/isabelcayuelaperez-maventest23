/*
 * 
 */
package es.damdi.isabelcayuela.domain.pieces;

/**
 * The Class RAM.
 */
public class RAM {
	
	/** The id. */
	private Long id;
	
	/** The type. */
	private String type;
	
	/** The gigabytes. */
	private Integer gigabytes;
	
	/**
	 * Instantiates a new ram.
	 *
	 * @param id        the id
	 * @param type      the type
	 * @param gigabytes the gigabytes
	 */
	public RAM(Long id, String type, Integer gigabytes) {
		this.id = id;
		this.type = type;
		this.gigabytes = gigabytes;
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
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Gets the gigabytes.
	 *
	 * @return the gigabytes
	 */
	public Integer getGigabytes() {
		return gigabytes;
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
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Sets the gigabytes.
	 *
	 * @param gigabytes the new gigabytes
	 */
	public void setGigabytes(Integer gigabytes) {
		this.gigabytes = gigabytes;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "RAM [id=" + id + ", type=" + type + ", gigabytes=" + gigabytes + "]";
	}

	
}
