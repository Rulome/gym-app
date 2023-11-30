package com.app.gym.service;

import com.app.gym.dto.MaterialDTO;
import com.app.gym.repository.model.Material;

/**
 * The Interface MaterialService.
 */
public interface MaterialService {

	/**
	 * Save.
	 *
	 * @param material the material
	 * @return the material
	 */
	Material save(MaterialDTO material);

}
