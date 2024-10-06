package com.app.gym.service;

import com.app.gym.dto.MuscleDTO;
import com.app.gym.repository.model.Muscle;

/**
 * The Interface MuscleService.
 */
public interface MuscleService {

	/**
	 * Save.
	 *
	 * @param muscle the muscle
	 */
	void save(MuscleDTO muscle);

}