package co.grandcircus.famouslab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Innovator {
	
	private String firstName;
	private String lastName;
	private String innovation;
	private Integer year;
	
	public Innovator() {	
	}

	public Innovator(String firstName, String lastName, String innovation, Integer year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.innovation = innovation;
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Innovator [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation + ", year="
				+ year + "]";
	}
	
}
