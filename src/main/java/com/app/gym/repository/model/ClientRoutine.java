package com.app.gym.repository.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * The Class ClientRoutine.
 */
@Entity
@Table(name = "CLIENT_ROUTINE")
public class ClientRoutine {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** The ini. */
	private Date ini;

	/** The end. */
	private Date end;

	/** The routine. */
	@ManyToOne
	@JoinColumn(name = "routine_id")
	private Routine routine;

	/** The exercise. */
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the ini.
	 *
	 * @return the ini
	 */
	public Date getIni() {
		return ini;
	}

	/**
	 * Gets the end.
	 *
	 * @return the end
	 */
	public Date getEnd() {
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
