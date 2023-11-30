package com.app.gym.repository.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * The Class ExerciseRoutine.
 */
@Entity
@Table(name = "EXERCISE_ROUTINE")
public class ExerciseRoutine {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The routine. */
	@ManyToOne
	@JoinColumn(name = "routine_id")
	private Routine routine;

	/** The exercise. */
	@ManyToOne
	@JoinColumn(name = "exercise_id")
	private Exercise exercise;

	/** The series. */
	private Integer series;

	/** The repetitions. */
	private Integer repetitions;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the routine
	 */
	public Routine getRoutine() {
		return routine;
	}

	/**
	 * @return the exercise
	 */
	public Exercise getExercise() {
		return exercise;
	}

	/**
	 * @return the series
	 */
	public Integer getSeries() {
		return series;
	}

	/**
	 * @return the repetitions
	 */
	public Integer getRepetitions() {
		return repetitions;
	}

}
