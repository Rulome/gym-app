package com.app.gym.service;

import com.app.gym.dto.RoutineDTO;
import com.app.gym.repository.model.Routine;

/**
 * The Interface RoutineService.
 */
public interface RoutineService {

	/**
	 * Save.
	 *
	 * @param routine the routine
	 * @return the routine
	 */
	Routine save(RoutineDTO routine);

}