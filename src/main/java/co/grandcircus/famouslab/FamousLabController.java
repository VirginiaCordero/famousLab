package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.Innovator;
import co.grandcircus.famouslab.model.Inventor;
import co.grandcircus.famouslab.model.Response;
import co.grandcircus.famouslab.model.Tiny;

@Controller
public class FamousLabController {
	
	@RequestMapping("/")
	public ModelAndView showAllFromTinyList() {
		ModelAndView mav = new ModelAndView("index");
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();

		// Set up headers.
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.USER_AGENT, "Let me in!");

		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		// Make the Request.
		Response response = restTemplate.getForObject(url, Response.class);	
		
		List<Inventor> inventors = response.getTiny();
		List<Innovator> innovators = response.getComplete();
//		Inventor firstInventor = inventors.get(0);
//		mav.addObject("name", firstInventor.getName());
		mav.addObject("inventors", inventors);
		mav.addObject("innovators", innovators);
		
		return mav;
	}
}
