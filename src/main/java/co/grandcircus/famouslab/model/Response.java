package co.grandcircus.famouslab.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	private List<Inventor> tiny;
	private List<Innovator> complete;
		
	public Response() {
		
	}

	public List<Inventor> getTiny() {
		return tiny;
	}

	public void setTiny(List<Inventor> tiny) {
		this.tiny = tiny;
	}

	public List<Innovator> getComplete() {
		return complete;
	}

	public void setComplete(List<Innovator> complete) {
		this.complete = complete;
	}	
}
