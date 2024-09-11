package com.app.gym.repository.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gym.repository.model.Client;

/**
 * The Interface ClientRepository.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

}
