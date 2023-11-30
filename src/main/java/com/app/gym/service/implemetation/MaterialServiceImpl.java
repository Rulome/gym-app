package com.app.gym.service.implemetation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.gym.dto.MaterialDTO;
import com.app.gym.repository.dao.MaterialRepository;
import com.app.gym.repository.model.Material;
import com.app.gym.service.MaterialService;
import com.app.gym.utils.Assembler;

/**
 * The Class MaterialServiceImpl.
 */
@Service
public class MaterialServiceImpl implements MaterialService {

	/** The repository. */
	private final MaterialRepository repository;

	/**
	 * Instantiates a new material service impl.
	 *
	 * @param repository the repository
	 */
	public MaterialServiceImpl(MaterialRepository repository) {
		this.repository = repository;
	}

	@Override
	@Transactional
	public Material save(MaterialDTO material) {
		return repository.save(Assembler.materialAssembler(material));
	}

}
