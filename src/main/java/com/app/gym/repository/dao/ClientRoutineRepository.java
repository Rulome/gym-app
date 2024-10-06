package com.app.gym.repository.dao;

import com.app.gym.repository.model.ClientRoutine;
import com.app.gym.repository.model.ClientRoutinePK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Client routine repository.
 */
public interface ClientRoutineRepository extends JpaRepository<ClientRoutine, ClientRoutinePK> {

    /**
     * Find by client id and end date is null list.
     *
     * @param clientId the client id
     * @return the list
     */
    List<ClientRoutine> findByClientIdAndEndIsNull(String clientId);

}
