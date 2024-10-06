package com.app.gym.service.implemetation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gym.dto.MuscleDTO;
import com.app.gym.repository.dao.MuscleRepository;
import com.app.gym.repository.model.Muscle;
import com.app.gym.service.MuscleService;
import com.app.gym.utils.Assembler;

/**
 * The Class MuscleServiceImpl.
 */
@Service
public class MuscleServiceImpl implements MuscleService {

	/** The repository. */
	private final MuscleRepository repository;

	/**
	 * Instantiates a new muscle service impl.
	 *
	 * @param repository the repository
	 */
	public MuscleServiceImpl(MuscleRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public void save(MuscleDTO muscle) {

		repository.save(Assembler.muscleAssembler(muscle));
	}

}
