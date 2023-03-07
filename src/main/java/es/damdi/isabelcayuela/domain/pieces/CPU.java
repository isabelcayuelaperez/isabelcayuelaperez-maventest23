/*
 * 
 */
package es.damdi.isabelcayuela.domain.pieces;

/**
 * The Class CPU - unidad central de proceso.
 */
public class CPU {
	
	/** The id. */
	private Long id;
	
	/** The on. */
	private Boolean on = false;
	
	/** The cores. */
	private Integer cores;
	
	/**
	 * Instantiates a new cpu.
	 *
	 * @param id    the id
	 * @param cores the cores
	 */
	public CPU(Long id, Integer cores) {
		this.id = id;
		this.cores = cores;
	}
	
	/**
	 * Start.
	 */
	public void start() {
		this.on = true;
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
	 * Gets the on.
	 *
	 * @return the on
	 */
	public Boolean getOn() {
		return on;
	}
	
	/**
	 * Gets the cores.
	 *
	 * @return the cores
	 */
	public Integer getCores() {
		return cores;
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
	 * Sets the on.
	 *
	 * @param on the new on
	 */
	public void setOn(Boolean on) {
		this.on = on;
	}
	
	/**
	 * Sets the cores.
	 *
	 * @param cores the new cores
	 */
	public void setCores(Integer cores) {
		this.cores = cores;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "CPU [id=" + id + ", on=" + on + ", cores =" + cores + "]";
	}

}
