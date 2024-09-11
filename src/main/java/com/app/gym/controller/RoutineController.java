package com.app.gym.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.gym.dto.RoutineDTO;
import com.app.gym.repository.model.Routine;
import com.app.gym.service.RoutineService;

/**
 * The Class RoutineController.
 */
@RestController
@RequestMapping(value = "/routine")
public class RoutineController {

	/** The service. */
	private final RoutineService service;

	/**
	 * Instantiates a new routine controller.
	 *
	 * @param service the service
	 */
	public RoutineController(RoutineService service) {
		this.service = service;
	}

	/**
	 * Creates the routine.
	 *
	 * @param routine the routine
	 * @return the response entity
	 */
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Routine> createRoutine(@RequestBody RoutineDTO routine) {

		return new ResponseEntity<>(service.save(routine), HttpStatus.OK);
	}

	@PutMapping(value = "/asign")
	public ResponseEntity<Routine> asingRoutine(@RequestParam(required = true) Long routine,
			@RequestParam(required = true) String client) {

		return new ResponseEntity<>(service.asign(routine, client), HttpStatus.OK);
	}

}
