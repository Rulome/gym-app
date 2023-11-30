package com.app.gym.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gym.repository.model.Material;

/**
 * The Interface MaterialRepository.
 */
@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {

}
