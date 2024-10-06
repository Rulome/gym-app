package com.app.gym.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gym.dto.MuscleDTO;
import com.app.gym.repository.model.Muscle;
import com.app.gym.service.MuscleService;

/**
 * The Class MuscleController.
 */
@RestController
@RequestMapping(value = "/muscle")
public class MuscleController {

	/** The service. */
	private final MuscleService service;

	/**
	 * Instantiates a new muscle controller.
	 *
	 * @param service the service
	 */
	public MuscleController(MuscleService service) {
		this.service = service;
	}

	/**
	 * Creates the muscle.
	 *
	 * @param muscle the muscle
	 * @return the response entity
	 */
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createMuscle(@RequestBody MuscleDTO muscle) {

		service.save(muscle);

		return ResponseEntity.ok().build();
	}

}
