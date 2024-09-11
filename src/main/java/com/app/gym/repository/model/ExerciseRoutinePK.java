package com.app.gym.repository.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;

/**
 * The Class ExerciseRoutinePK.
 */
@Embeddable
public class ExerciseRoutinePK {

	/** The exercise id. */
	private Long exerciseId;

	/** The routine id. */
	private Long routineId;

	/**
	 * Instantiates a new exercise routine PK.
	 */
	public ExerciseRoutinePK() {
	}

	/**
	 * Instantiates a new exercise routine PK.
	 *
	 * @param exerciseId the exercise id
	 * @param routineId  the routine id
	 */
	public ExerciseRoutinePK(Long exerciseId, Long routineId) {
		this.exerciseId = exerciseId;
		this.routineId = routineId;
	}

	/**
	 * Gets the exercise id.
	 *
	 * @return the exercise id
	 */
	public Long getExerciseId() {
		return exerciseId;
	}

	/**
	 * Gets the routine id.
	 *
	 * @return the routine id
	 */
	public Long getRoutineId() {
		return routineId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(exerciseId, routineId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExerciseRoutinePK other = (ExerciseRoutinePK) obj;
		return Objects.equals(exerciseId, other.exerciseId) && Objects.equals(routineId, other.routineId);
	}

}
