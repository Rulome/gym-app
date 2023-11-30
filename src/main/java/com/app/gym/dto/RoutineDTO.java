package com.app.gym.dto;

import java.util.Set;

import com.app.gym.repository.model.ClientRoutine;
import com.app.gym.repository.model.ExerciseRoutine;

/**
 * The Class RoutineDTO.
 */
public class RoutineDTO {

	/** The name. */
	private String name;

	/** The client routines. */
	private Set<ClientRoutine> clientRoutines;

	/** The exercise routines. */
	private Set<ExerciseRoutine> exerciseRoutines;

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
	 * Gets the clients.
	 *
	 * @return the clients
	 */
	public Set<ClientRoutine> getClientRoutines() {
		return clientRoutines;
	}

	/**
	 * Sets the clients.
	 *
	 * @param clientRoutines the new clients
	 */
	public void setClients(Set<ClientRoutine> clientRoutines) {
		this.clientRoutines = clientRoutines;
	}

	/**
	 * Gets the exercise routines.
	 *
	 * @return the exercise routines
	 */
	public Set<ExerciseRoutine> getExerciseRoutines() {
		return Set.copyOf(exerciseRoutines);
	}

	/**
	 * Sets the exercise routines.
	 *
	 * @param exerciseRoutines the new exercise routines
	 */
	public void setExerciseRoutines(Set<ExerciseRoutine> exerciseRoutines) {
		this.exerciseRoutines = exerciseRoutines;
	}

}
