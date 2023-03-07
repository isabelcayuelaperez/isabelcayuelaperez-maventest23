/*
 * 
 */
package es.damdi.isabelcayuela.service;

import java.util.List;

import es.damdi.isabelcayuela.domain.SmartPhone;

/**
 * The Interface SmartPhoneService.
 */
public interface SmartPhoneService {

	/**
	 * It returns total number of smartphones.
	 *
	 * @return the integer
	 */
    Integer count();

    /**
	 * It retrieves all smartphones.
	 *
	 * @return the list
	 */
    List<SmartPhone> findAll();

    /**
	 * Find one.
	 *
	 * @param id the id
	 * @return the smart phone
	 */
    SmartPhone findOne(Long id);
    
    /**
	 * Find by wifi.
	 *
	 * @param wifi the wifi
	 * @return the list
	 */
    // Filtros
     List<SmartPhone> findByWifi(Boolean wifi);
     
    // List<SmartPhone> findByManufacturer(String manufacturer);

    /**
	 * Save.
	 *
	 * @param smartphone the smartphone
	 * @return the smart phone
	 */
    SmartPhone save(SmartPhone smartphone);

    /**
	 * Delete.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
    boolean delete(Long id);

    /**
	 * Delete all.
	 */
    void deleteAll();
}
