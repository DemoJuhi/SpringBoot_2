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
	
	public void final_commit(int a)
	{
		a=10;
		System.out.println("Checking pull action for git in eclipse "+a);
	}
	
}
