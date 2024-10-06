package com.app.gym.service;

import com.app.gym.dto.ExerciseDTO;
import com.app.gym.repository.model.Exercise;

/**
 * The Interface ExerciseService.
 */
public interface ExerciseService {

	/**
	 * Save.
	 *
	 * @param exercise the exercise
	 */
	void save(ExerciseDTO exercise);

}