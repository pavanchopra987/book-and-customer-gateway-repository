package com.learn.gateway.application.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GatewayController {

	
	private RestTemplate restTemplate;
	
	@GetMapping("/getbooks")
	public String getBooks() {
		System.out.println("called");
		restTemplate = new RestTemplate();
		String message = restTemplate.getForObject("http://localhost:8080/getbooks", String.class);
		return message;
	}
	
	@GetMapping("/getcustomers")
	public String getCustomers() {
		System.out.println("called");
		restTemplate = new RestTemplate();
		String message = restTemplate.getForObject("http://localhost:8081/getcustomers", String.class);
		return message;
	}
}
