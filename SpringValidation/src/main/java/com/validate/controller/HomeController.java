package com.validate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

	@GetMapping("/home")
	
	public String home()
	{
		return "This is home page";
	}
	
	public String login()
	{
		return "This is login page";
	}
	
	public void for_Eclipse()
	{
		System.out.println("this is a method to see in eclipse for final commit");
	}
	
}
