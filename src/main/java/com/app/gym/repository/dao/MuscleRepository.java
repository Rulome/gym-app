package com.app.gym.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gym.repository.model.Muscle;

/**
 * The Interface MuscleRepository.
 */
@Repository
public interface MuscleRepository extends JpaRepository<Muscle, Long> {

}
