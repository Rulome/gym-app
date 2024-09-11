package com.app.gym.repository.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

/**
 * The Class Exercise.
 */
@Entity
@Table(name = "EXERCISE")
public class Exercise {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exercise_id")
	private Long id;

	/** The name. */
	@Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters")
	private String name;

	/** The muscles. */
	@ManyToMany
	@JoinTable(name = "EXERCISE_MUSCLE", joinColumns = @JoinColumn(name = "exercise_id"), inverseJoinColumns = @JoinColumn(name = "muscle_id"))
	private Set<Muscle> muscles;

	/** The materials. */
	@ManyToMany
	@JoinTable(name = "EXERCISE_MATERIALS", joinColumns = @JoinColumn(name = "exercise_id"), inverseJoinColumns = @JoinColumn(name = "material_id"))
	private Set<Material> materials;

	/**
	 * Instantiates a new exercise.
	 */
	public Exercise() {
		materials = new HashSet<>();
		muscles = new HashSet<>();
	}

	/**
	 * Instantiates a new exercise.
	 *
	 * @param name      the name
	 * @param muscles   the muscles
	 * @param materials the materials
	 */
	public Exercise(@Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters") String name,
			Set<Muscle> muscles, Set<Material> materials) {
		this.name = name;
		this.muscles = muscles;
		this.materials = materials;
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
	 * Gets the muscles.
	 *
	 * @return the muscles
	 */
	public Set<Muscle> getMuscles() {
		return Set.copyOf(muscles);
	}

	/**
	 * Gets the materials.
	 *
	 * @return the materials
	 */
	public Set<Material> getMaterials() {
		return Set.copyOf(materials);
	}

}
