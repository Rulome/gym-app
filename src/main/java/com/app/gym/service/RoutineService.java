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

	/**
	 * Asign.
	 *
	 * @param routine the routine
	 * @param client  the client
	 * @return the routine
	 */
	Routine asign(Long routine, String client);

}