/*
 * 
 */
package com.app.gym.repository.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * The Class Material.
 */
@Entity
@Table(name = "MATERIAL")
public class Material {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "material_id")
	private Long id;

	/** The name. */
	private String name;

	/** The exercises. */
	@ManyToMany(mappedBy = "materials")
	private Set<Exercise> exercises;

	/**
	 * Instantiates a new material.
	 *
	 * @param name      the name
	 * @param exercises the exercises
	 */
	public Material(String name, Set<Exercise> exercises) {
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
