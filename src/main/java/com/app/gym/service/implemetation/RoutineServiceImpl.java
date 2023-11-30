package com.app.gym.service.implemetation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gym.dto.RoutineDTO;
import com.app.gym.repository.dao.RoutineRepository;
import com.app.gym.repository.model.Routine;
import com.app.gym.service.RoutineService;
import com.app.gym.utils.Assembler;

/**
 * The Class RoutineServiceImpl.
 */
@Service
public class RoutineServiceImpl implements RoutineService {

	/** The repository. */
	private final RoutineRepository repository;

	/**
	 * Instantiates a new routine service impl.
	 *
	 * @param repository the repository
	 */
	public RoutineServiceImpl(RoutineRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public Routine save(RoutineDTO routine) {

		return repository.save(Assembler.routineAssembler(routine));
	}

}
