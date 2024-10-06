package com.app.gym.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gym.dto.MaterialDTO;
import com.app.gym.repository.model.Material;
import com.app.gym.service.MaterialService;

/**
 * The Class MaterialController.
 */
@RestController
@RequestMapping(value = "/material")
public class MaterialController {

	/** The service. */
	private final MaterialService service;

	/**
	 * Instantiates a new material controller.
	 *
	 * @param service the service
	 */
	public MaterialController(MaterialService service) {
		this.service = service;
	}

	/**
	 * Creates the material.
	 *
	 * @param material the material
	 * @return the response entity
	 */
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createMaterial(@RequestBody MaterialDTO material) {

		service.save(material);

		return ResponseEntity.ok().build();
	}

}
