package com.app.gym.repository.model;

import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

/**
 * The Class ClientRoutine.
 */
@Entity
@Table(name = "CLIENT_ROUTINE")
public class ClientRoutine {

	/** The id. */
	@EmbeddedId
	private ClientRoutinePK id;

	/** The end. */
	private LocalDate end;

	/** The routine. */
	@ManyToOne
	@JoinColumn(name = "routine_id")
	@MapsId("routineId")
	private Routine routine;

	/** The client. */
	@ManyToOne
	@JoinColumn(name = "client_id")
	@MapsId("clientId")
	private Client client;

	/**
	 * Instantiates a new client routine.
	 */
	public ClientRoutine() {
		// Empty constructor
	}

	/**
	 * Instantiates a new client routine.
	 *
	 * @param id      the id
	 * @param end     the end
	 * @param routine the routine
	 * @param client  the client
	 */
	public ClientRoutine(ClientRoutinePK id, LocalDate end, Routine routine, Client client) {
		this.id = id;
		this.end = end;
		this.routine = routine;
		this.client = client;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public ClientRoutinePK getId() {
		return id;
	}

	/**
	 * Gets the end.
	 *
	 * @return the end
	 */
	public LocalDate getEnd() {
		return end;
	}

	/**
	 * Gets the routine.
	 *
	 * @return the routine
	 */
	public Routine getRoutine() {
		return routine;
	}

	/**
	 * Gets the client.
	 *
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

}
