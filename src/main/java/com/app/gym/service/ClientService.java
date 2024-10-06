package com.app.gym.service;

import com.app.gym.dto.ClientDTO;
import com.app.gym.repository.model.Client;

/**
 * The Interface ClientService.
 */
public interface ClientService {

	/**
	 * Save.
	 *
	 * @param client the client
	 */
	void save(ClientDTO client);

}