package com.app.gym.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gym.dto.ExerciseDTO;
import com.app.gym.repository.model.Exercise;
import com.app.gym.service.ExerciseService;

/**
 * The Class ExerciseController.
 */
@RestController
@RequestMapping(value = "/exercise")
public class ExerciseController {

	/** The service. */
	private final ExerciseService service;

	/**
	 * Instantiates a new exercise controller.
	 *
	 * @param service the service
	 */
	public ExerciseController(ExerciseService service) {
		this.service = service;
	}

	/**
	 * Creates the exercise.
	 *
	 * @param exercise the exercise
	 * @return the response entity
	 */
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createExercise(@RequestBody ExerciseDTO exercise) {

		service.save(exercise);

		return ResponseEntity.ok().build();
	}

}
