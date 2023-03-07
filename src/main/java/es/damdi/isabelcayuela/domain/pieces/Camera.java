/*
 * 
 */
package es.damdi.isabelcayuela.domain.pieces;

/**
 * The Class Camera.
 */
public class Camera {
	
	/** The id. */
	private Long id;
	
	/** The model. */
	private String model;
	
	/** The megapixels. */
	private Double megapixels;
	
	/**
	 * Instantiates a new camera.
	 *
	 * @param id         the id
	 * @param model      the model
	 * @param megapixels the megapixels
	 */
	public Camera(Long id, String model, Double megapixels) {
		this.id = id;
		this.model = model;
		this.megapixels = megapixels;
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
	 * Gets the model.
	 *
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * Gets the megapixels.
	 *
	 * @return the megapixels
	 */
	public Double getMegapixels() {
		return megapixels;
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
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * Sets the megapixels.
	 *
	 * @param megapixels the new megapixels
	 */
	public void setMegapixels(Double megapixels) {
		this.megapixels = megapixels;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Camera [id=" + id + ", model=" + model + ", megapixels=" + megapixels + "]";
	}

}
