package com.ctech.ft.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloController {

	@GetMapping(value = "/hello")
	public JSONResponse sayHello() {
		JSONResponse response = new JSONResponse();
		response.setResponse("Hello, world!");
		
		return response;
	}
	
	public static class JSONResponse {
		String response;

		public String getResponse() {
			return response;
		}

		public void setResponse(String response) {
			this.response = response;
		}
	}
}
