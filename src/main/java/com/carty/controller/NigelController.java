package com.carty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NigelController {
	@GetMapping("/")
	public String getMessage() {
		return "This is your message";
	}
}
