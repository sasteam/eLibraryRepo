package com.sas.eLibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
@RestController
public class BookController {
	@Value("${welcome.message}") private String welcomeMessage; 
	
    @GetMapping("/welcome") public String retrieveWelcomeMessage() {
		return welcomeMessage;
	}
}
