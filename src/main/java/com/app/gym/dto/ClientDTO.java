package com.app.gym.dto;

import java.time.LocalDate;

/**
 * The Class ClientDTO.
 */
public class ClientDTO {

	/** The id. */
	private String id;

	/** The name. */
	private String name;

	/** The email. */
	private String email;

	/** The dob. */
	private LocalDate dob;

	/**
	 * Instantiates a new client DTO.
	 *
	 * @param id    the id
	 * @param name  the name
	 * @param email the email
	 * @param dob   the dob
	 */
	public ClientDTO(String id, String name, String email, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
