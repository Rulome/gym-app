package com.app.gym.service.implemetation;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import com.app.gym.exceptions.CustomGymException;
import com.app.gym.utils.Constants;
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
	public void asign(Long routineID, String clientID) {

		Optional<Client> client = clientRepository.findById(clientID);
		Optional<Routine> routine = routineRepository.findById(routineID);

		if (client.isEmpty() && routine.isEmpty()){
			throw new CustomGymException(Constants.CODE_001, Constants.CODE_001_DESCRIPTION);
		} else if (client.isEmpty()) {
			throw new CustomGymException(Constants.CODE_002, Constants.CODE_002_DESCRIPTION);
		} else if (routine.isEmpty()) {
			throw new CustomGymException(Constants.CODE_003, Constants.CODE_003_DESCRIPTION);
		} else {
			Routine r = routine.get();
			ClientRoutinePK crPK = new ClientRoutinePK(clientID, routineID);
			ClientRoutine cr = new ClientRoutine(crPK, LocalDate.now(), null, r, client.get());
			Set<ClientRoutine> crSet = new HashSet<>(r.getClientRoutines());
			crSet.add(cr);
			r.setClients(crSet);
			routineRepository.save(r);
		}
	}

}
