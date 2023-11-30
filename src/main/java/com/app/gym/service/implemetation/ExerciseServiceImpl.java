package com.app.gym.service.implemetation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gym.dto.ExerciseDTO;
import com.app.gym.repository.dao.ExerciseRepository;
import com.app.gym.repository.model.Exercise;
import com.app.gym.service.ExerciseService;
import com.app.gym.utils.Assembler;

/**
 * The Class ExerciseServiceImpl.
 */
@Service
public class ExerciseServiceImpl implements ExerciseService {

	/** The repository. */
	private final ExerciseRepository repository;

	/**
	 * Instantiates a new exercise service impl.
	 *
	 * @param repository the repository
	 */
	public ExerciseServiceImpl(ExerciseRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public Exercise save(ExerciseDTO exercise) {

		return repository.save(Assembler.exerciseAssembler(exercise));
	}

}
