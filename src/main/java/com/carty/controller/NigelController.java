package com.carty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class NigelController {
	
	@GetMapping("/get")
	public String getMessage() {
		return "This is your message from Nigel Controller";
	}
	
	@GetMapping("/getaws")
	public String getAWS() {
		return "This is your AWS message from Nigel Controller";
	}
	
}
