package com.app.gym.repository.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

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
	private String id;

	/** The name. */
	@Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters")
	private String name;

	/** The email. */
	@Email(message = "Email should be valid")
	private String email;

	/** The dob. */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past(message = "Date of birth should be a date in the past")
	private LocalDate dob;

	/**
	 * Instantiates a new client.
	 */
	public Client() {
	}

	/**
	 * Instantiates a new client.
	 *
	 * @param id    the id
	 * @param name  the name
	 * @param email the email
	 * @param dob   the dob
	 */
	public Client(String id, @Pattern(regexp = "[A-Za-z]+", message = "Name should be just characters") String name,
			@Email(message = "Email should be valid") String email,
			@Past(message = "Date of birth should be a date in the past") LocalDate dob) {
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
	public LocalDate getDob() {
		return dob;
	}

}
