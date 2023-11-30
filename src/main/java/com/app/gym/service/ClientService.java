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
	 * @return the client
	 */
	Client save(ClientDTO client);

}