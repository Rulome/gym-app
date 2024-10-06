package com.app.gym.service.implemetation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gym.dto.ClientDTO;
import com.app.gym.repository.dao.ClientRepository;
import com.app.gym.repository.model.Client;
import com.app.gym.service.ClientService;
import com.app.gym.utils.Assembler;

/**
 * The Class ClientServiceImpl.
 */
@Service
public class ClientServiceImpl implements ClientService {

	/** The repository. */
	private final ClientRepository repository;

	/**
	 * Instantiates a new client service impl.
	 *
	 * @param repository the repository
	 */
	public ClientServiceImpl(ClientRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public void save(ClientDTO client) {

		repository.save(Assembler.clientAssembler(client));
	}

}
