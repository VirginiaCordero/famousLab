package co.grandcircus.famouslab.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Inventor {

	private String name;
	private String invented;
	private Integer year;
	
	public Inventor() {
	}

	public Inventor(String name, String invented, Integer year) {
		super();
		this.name = name;
		this.invented = invented;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInvented() {
		return invented;
	}

	public void setInvented(String invented) {
		this.invented = invented;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Inventor [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}	
	
}
