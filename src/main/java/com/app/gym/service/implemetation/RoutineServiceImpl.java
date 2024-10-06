package com.app.gym.service.implemetation;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.app.gym.exceptions.CustomGymException;
import com.app.gym.repository.dao.ClientRoutineRepository;
import com.app.gym.repository.model.ClientRoutinePK;
import com.app.gym.utils.Constants;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gym.dto.RoutineDTO;
import com.app.gym.repository.dao.ClientRepository;
import com.app.gym.repository.dao.RoutineRepository;
import com.app.gym.repository.model.Client;
import com.app.gym.repository.model.ClientRoutine;
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

	/** The client routine repository. */
	private final ClientRoutineRepository clientRoutineRepository;

	/**
	 * Instantiates a new Routine service.
	 *
	 * @param routineRepository       the routine repository
	 * @param clientRepository        the client repository
	 * @param clientRoutineRepository the client routine repository
	 */
	public RoutineServiceImpl(RoutineRepository routineRepository, ClientRepository clientRepository,
							  ClientRoutineRepository clientRoutineRepository) {
		this.routineRepository = routineRepository;
		this.clientRepository = clientRepository;
		this.clientRoutineRepository = clientRoutineRepository;
	}

	@Override
	@Transactional
	public Routine save(RoutineDTO routine) {

		return routineRepository.save(Assembler.routineAssembler(routine));
	}

	@Override
	@Transactional
	public void asign(Long routineID, String clientID) {

		Optional<Client> clientOpt = clientRepository.findById(clientID);
		Optional<Routine> routineOpt = routineRepository.findById(routineID);

		// Verificaciones iniciales de existencia de cliente y rutina
		if (clientOpt.isEmpty() && routineOpt.isEmpty()){
			throw new CustomGymException(Constants.CODE_001, Constants.CODE_001_DESCRIPTION);
		}
		if (clientOpt.isEmpty()) {
			throw new CustomGymException(Constants.CODE_002, Constants.CODE_002_DESCRIPTION);
		}
		if (routineOpt.isEmpty()) {
			throw new CustomGymException(Constants.CODE_003, Constants.CODE_003_DESCRIPTION);
		}

		Client client = clientOpt.get();
		Routine routine = routineOpt.get();

		// Verificar si el cliente ya tiene una rutina activa
		List<ClientRoutine> activeRoutines = clientRoutineRepository.findByClientIdAndEndIsNull(clientID);

		if (!activeRoutines.isEmpty()) {
			throw new CustomGymException(Constants.CODE_004, Constants.CODE_004_DESCRIPTION);
		}

		// Verificar si ya existe la relación entre el cliente y la rutina
		ClientRoutinePK crPK = new ClientRoutinePK( LocalDate.now(), clientID, routineID);
		Optional<ClientRoutine> existingCrOpt = clientRoutineRepository.findById(crPK);

		if (existingCrOpt.isPresent()) {
			throw new CustomGymException(Constants.CODE_005, Constants.CODE_005_DESCRIPTION);
		}

		// Crear una nueva relación entre Cliente y Rutina
		ClientRoutine newCr = new ClientRoutine(crPK, null, routine, client);

		// Añadir la relación a las colecciones adecuadas
		routine.getClientRoutines().add(newCr);

		// Guardar la nueva relación en la base de datos
		clientRoutineRepository.save(newCr);
	}

}
