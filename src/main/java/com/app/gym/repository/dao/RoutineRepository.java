package com.app.gym.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gym.repository.model.Routine;

/**
 * The Interface RoutineRepository.
 */
@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {

}
