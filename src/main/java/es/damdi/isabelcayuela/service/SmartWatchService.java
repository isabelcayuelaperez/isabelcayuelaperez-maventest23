/*
 * 
 */
package es.damdi.isabelcayuela.service;

import java.util.List;

import es.damdi.isabelcayuela.domain.SmartWatch;

/**
 * The Interface SmartWatchService.
 */
public interface SmartWatchService {

    /**
	 * Count.
	 *
	 * @return the integer
	 */
    Integer count();

    /**
	 * Find all.
	 *
	 * @return the list
	 */
    List<SmartWatch> findAll();

    /**
	 * Find one.
	 *
	 * @param id the id
	 * @return the smart watch
	 */
    SmartWatch findOne(Long id);

    /**
	 * Save.
	 *
	 * @param user the user
	 * @return the smart watch
	 */
    SmartWatch save(SmartWatch user);

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
