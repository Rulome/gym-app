package com.app.gym.repository.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

/**
 * The Class Muscle.
 */
@Entity
@Table(name = "MUSCLE")
public class Muscle {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "muscle_id")
	private Long id;

	/** The name. */
	@Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters")
	private String name;

	/** The exercises. */
	@ManyToMany(mappedBy = "muscles")
	private Set<Exercise> exercises;

	/**
	 * Instantiates a new muscle.
	 *
	 * @param name      the name
	 * @param exercises the exercises
	 */
	public Muscle(@Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters") String name,
			Set<Exercise> exercises) {
		this.name = name;
		this.exercises = exercises;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the exercises.
	 *
	 * @return the exercises
	 */
	public Set<Exercise> getExercises() {
		return Set.copyOf(exercises);
	}

}
