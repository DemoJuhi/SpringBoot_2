package com.validate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class PublicSignIn {
	
	@GetMapping("/signin")
	public String signIn()
	{
		return "login";
	}

}
