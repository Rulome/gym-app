package com.app.gym.repository.model;

import java.time.LocalDate;
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

	/** The ini. */
	private LocalDate ini;

	/**
	 * Instantiates a new client routine PK.
	 */
	public ClientRoutinePK() {
	}

	/**
	 * Instantiates a new Client routine pk.
	 *
	 * @param ini       the ini
	 * @param clientId  the client id
	 * @param routineId the routine id
	 */
	public ClientRoutinePK(LocalDate ini, String clientId, Long routineId) {
		this.ini = ini;
		this.clientId = clientId;
		this.routineId = routineId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ClientRoutinePK that = (ClientRoutinePK) o;
		return Objects.equals(clientId, that.clientId) &&
				Objects.equals(routineId, that.routineId) &&
				Objects.equals(ini, that.ini);
	}

	@Override
	public int hashCode() {
		return Objects.hash(clientId, routineId, ini);
	}
}
