package com.app.gym.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.gym.dto.ClientDTO;
import com.app.gym.repository.model.Client;
import com.app.gym.service.ClientService;

/**
 * The Class ClientController.
 */
@RestController
@RequestMapping(value = "/client")
public class ClientController {

	/** The service. */
	private final ClientService service;

	/**
	 * Instantiates a new client controller.
	 *
	 * @param service the service
	 */
	public ClientController(ClientService service) {
		this.service = service;
	}

	/**
	 * Creates the client.
	 *
	 * @param client the client
	 * @return the response entity
	 */
	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Client> createClient(@RequestBody ClientDTO client) {

		return new ResponseEntity<>(service.save(client), HttpStatus.OK);
	}

}
