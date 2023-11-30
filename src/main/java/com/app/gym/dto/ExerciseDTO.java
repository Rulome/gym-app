package com.app.gym.dto;

import java.util.Set;

import com.app.gym.repository.model.Material;
import com.app.gym.repository.model.Muscle;

/**
 * The Class ExerciseDTO.
 */
public class ExerciseDTO {

	/** The name. */
	private String name;

	/** The muscles. */
	private Set<Muscle> muscles;

	/** The materials. */
	private Set<Material> materials;

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
	 * Gets the muscles.
	 *
	 * @return the muscles
	 */
	public Set<Muscle> getMuscles() {
		return Set.copyOf(muscles);
	}

	/**
	 * Sets the muscles.
	 *
	 * @param muscles the new muscles
	 */
	public void setMuscles(Set<Muscle> muscles) {
		this.muscles = muscles;
	}

	/**
	 * Gets the materials.
	 *
	 * @return the materials
	 */
	public Set<Material> getMaterials() {
		return Set.copyOf(materials);
	}

	/**
	 * Sets the materials.
	 *
	 * @param materials the new materials
	 */
	public void setMaterials(Set<Material> materials) {
		this.materials = materials;
	}

}
