package com.app.gym.repository.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

/**
 * The Class Client.
 */
@Entity
@Table(name = "CLIENT")
public class Client {

	/** The id. */
	@Id
	@Column(name = "client_id")
	private Long id;

	/** The name. */
	@Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters")
	private String name;

	/** The email. */
	@Email(message = "Email should be valid")
	private String email;

	/** The dob. */
	@Past(message = "Date of birth should be a date in the past")
	private Date dob;

	/**
	 * Instantiates a new client.
	 *
	 * @param id    the id
	 * @param name  the name
	 * @param email the email
	 * @param dob   the dob
	 */
	public Client(Long id, @Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters") String name,
			@Email(message = "Email should be valid") String email,
			@Past(message = "Date of birth should be a date in the past") Date dob) {
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
	public Long getId() {
		return id;
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
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

}
