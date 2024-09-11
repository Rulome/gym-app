package com.app.gym.service.implemetation;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gym.dto.RoutineDTO;
import com.app.gym.repository.dao.ClientRepository;
import com.app.gym.repository.dao.RoutineRepository;
import com.app.gym.repository.model.Client;
import com.app.gym.repository.model.ClientRoutine;
import com.app.gym.repository.model.ClientRoutinePK;
import com.app.gym.repository.model.Routine;
import com.app.gym.service.RoutineService;
import com.app.gym.utils.Assembler;

/**
 * The Class RoutineServiceImpl.
 */
@Service
public class RoutineServiceImpl implements RoutineService {

	/** The routine repository. */
	private final RoutineRepository routineRepository;

	/** The client repository. */
	private final ClientRepository clientRepository;

	/**
	 * Instantiates a new routine service impl.
	 *
	 * @param routineRepository the routine repository
	 * @param clientRepository  the client repository
	 */
	public RoutineServiceImpl(RoutineRepository routineRepository, ClientRepository clientRepository) {
		this.routineRepository = routineRepository;
		this.clientRepository = clientRepository;
	}

	@Override
	@Transactional
	public Routine save(RoutineDTO routine) {

		return routineRepository.save(Assembler.routineAssembler(routine));
	}

	@Override
	@Transactional
	public Routine asign(Long routineID, String clientID) {

		Optional<Client> client = clientRepository.findById(clientID);
		Optional<Routine> routine = routineRepository.findById(routineID);

		if (client.isPresent() && routine.isPresent()) {
			Routine r = routine.get();
			ClientRoutinePK crPK = new ClientRoutinePK(clientID, routineID);
			ClientRoutine cr = new ClientRoutine(crPK, LocalDate.now(), null, r, client.get());
			Set<ClientRoutine> crSet = new HashSet<>(r.getClientRoutines());
			crSet.add(cr);
			r.setClients(crSet);
			routineRepository.save(r);
			return r;

		}
		// TODO
		return null;
	}

}
