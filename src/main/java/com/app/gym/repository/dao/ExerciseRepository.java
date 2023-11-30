package com.app.gym.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gym.repository.model.Exercise;

/**
 * The Interface ExerciseRepository.
 */
@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
