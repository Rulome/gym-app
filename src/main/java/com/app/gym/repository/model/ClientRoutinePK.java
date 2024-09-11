package com.app.gym.repository.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;

/**
 * The Class ClientRoutinePK.
 */
@Embeddable
public class ClientRoutinePK {

	/** The client id. */
	private String clientId;

	/** The routine id. */
	private Long routineId;

	/**
	 * Instantiates a new client routine PK.
	 */
	public ClientRoutinePK() {
	}

	/**
	 * Instantiates a new client routine PK.
	 *
	 * @param clientId  the client id
	 * @param routineId the routine id
	 */
	public ClientRoutinePK(String clientId, Long routineId) {
		this.clientId = clientId;
		this.routineId = routineId;
	}

	/**
	 * Gets the client id.
	 *
	 * @return the client id
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * Gets the routine id.
	 *
	 * @return the routine id
	 */
	public Long getRoutineId() {
		return routineId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clientId, routineId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientRoutinePK other = (ClientRoutinePK) obj;
		return Objects.equals(clientId, other.clientId) && Objects.equals(routineId, other.routineId);
	}

}
