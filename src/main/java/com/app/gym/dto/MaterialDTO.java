package com.app.gym.dto;

import java.util.Collections;
import java.util.Set;

import com.app.gym.repository.model.Exercise;

/**
 * The Class MaterialDTO.
 */
public class MaterialDTO {

	/** The name. */
	private String name;

	/** The exercises. */
	private Set<Exercise> exercises;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the exercises.
	 *
	 * @return the exercises
	 */
	public Set<Exercise> getExercises() {
		return exercises == null ? Collections.emptySet() : Set.copyOf(exercises);
	}

	/**
	 * Sets the exercises.
	 *
	 * @param exercises the new exercises
	 */
	public void setExercises(Set<Exercise> exercises) {
		this.exercises = exercises;
	}

}
