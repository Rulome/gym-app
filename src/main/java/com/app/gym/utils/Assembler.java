package com.app.gym.utils;

import com.app.gym.dto.ClientDTO;
import com.app.gym.dto.ExerciseDTO;
import com.app.gym.dto.MaterialDTO;
import com.app.gym.dto.MuscleDTO;
import com.app.gym.dto.RoutineDTO;
import com.app.gym.repository.model.Client;
import com.app.gym.repository.model.Exercise;
import com.app.gym.repository.model.Material;
import com.app.gym.repository.model.Muscle;
import com.app.gym.repository.model.Routine;

/**
 * The Class Assembler.
 */
public class Assembler {

	/**
	 * Instantiates a new assembler.
	 */
	private Assembler() {
		// Empty constructor
	}

	/**
	 * Routine assembler.
	 *
	 * @param routineIn the routine in
	 * @return the routine
	 */
	public static Routine routineAssembler(RoutineDTO routineIn) {
		return new Routine(routineIn.getName(), routineIn.getClientRoutines(), routineIn.getExerciseRoutines());
	}

	/**
	 * Exercise assembler.
	 *
	 * @param exercise the exercise
	 * @return the exercise
	 */
	public static Exercise exerciseAssembler(ExerciseDTO exercise) {
		return new Exercise(exercise.getName(), exercise.getMuscles(), exercise.getMaterials());
	}

	/**
	 * Client assembler.
	 *
	 * @param client the client
	 * @return the client
	 */
	public static Client clientAssembler(ClientDTO client) {
		return new Client(client.getId(), client.getName(), client.getEmail(), client.getDob());
	}

	/**
	 * Muscle assembler.
	 *
	 * @param muscle the muscle
	 * @return the muscle
	 */
	public static Muscle muscleAssembler(MuscleDTO muscle) {
		return new Muscle(muscle.getName(), muscle.getExercises());
	}

	/**
	 * Material assembler.
	 *
	 * @param material the material
	 * @return the material
	 */
	public static Material materialAssembler(MaterialDTO material) {
		return new Material(material.getName(), material.getExercises());
	}

}
