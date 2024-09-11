package com.app.gym.repository.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

/**
 * The Class ExerciseRoutine.
 */
@Entity
@Table(name = "EXERCISE_ROUTINE")
public class ExerciseRoutine {

	/** The id. */
	@EmbeddedId
	private ExerciseRoutinePK id;

	/** The routine. */
	@ManyToOne
	@JoinColumn(name = "routine_id")
	@MapsId("routineId")
	private Routine routine;

	/** The exercise. */
	@ManyToOne
	@JoinColumn(name = "exercise_id")
	@MapsId("exerciseId")
	private Exercise exercise;

	/** The series. */
	private Integer series;

	/** The repetitions. */
	private Integer repetitions;

	/**
	 * Instantiates a new exercise routine.
	 */
	public ExerciseRoutine() {
		// Empty constructor
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public ExerciseRoutinePK getId() {
		return id;
	}

	/**
	 * Gets the routine.
	 *
	 * @return the routine
	 */
	public Routine getRoutine() {
		return routine;
	}

	/**
	 * Gets the exercise.
	 *
	 * @return the exercise
	 */
	public Exercise getExercise() {
		return exercise;
	}

	/**
	 * Gets the series.
	 *
	 * @return the series
	 */
	public Integer getSeries() {
		return series;
	}

	/**
	 * Gets the repetitions.
	 *
	 * @return the repetitions
	 */
	public Integer getRepetitions() {
		return repetitions;
	}

}
