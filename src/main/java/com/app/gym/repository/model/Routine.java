package com.app.gym.repository.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * The Class Routine.
 */
@Entity
@Table(name = "ROUTINE")
public class Routine {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "routine_id")
	private Long id;

	/** The name. */
	private String name;

	/** The clients. */
	@OneToMany(mappedBy = "routine", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Set<ClientRoutine> clients;

	/** The exercises. */
	@OneToMany(mappedBy = "routine")
	private Set<ExerciseRoutine> exercises;

	/**
	 * Instantiates a new routine.
	 */
	public Routine() {
	}

	/**
	 * Instantiates a new routine.
	 *
	 * @param name             the name
	 * @param clientRoutines   the client routines
	 * @param exerciseRoutines the exercise routines
	 */
	public Routine(String name, Set<ClientRoutine> clientRoutines, Set<ExerciseRoutine> exerciseRoutines) {
		this.name = name;
		this.clients = clientRoutines;
		this.exercises = exerciseRoutines;
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
	 * Gets the client routines.
	 *
	 * @return the client routines
	 */
	public Set<ClientRoutine> getClientRoutines() {
		return Set.copyOf(clients);
	}

	/**
	 * Gets the exercise routines.
	 *
	 * @return the exercise routines
	 */
	public Set<ExerciseRoutine> getExerciseRoutines() {
		return Set.copyOf(exercises);
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * Sets the clients.
	 *
	 * @param clients the new clients
	 */
	public void setClients(Set<ClientRoutine> clients) {
		this.clients = clients;
	}

	/**
	 * Sets the exercises.
	 *
	 * @param exercises the new exercises
	 */
	public void setExercises(Set<ExerciseRoutine> exercises) {
		this.exercises = exercises;
	}

}
