package com.validate.controller;

import javax.validation.Valid;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.validate.entities.LoginData;

@Controller
@RequestMapping("/users")
public class MyController {
	
	@GetMapping("/form")
	public String openForm(Model model)
	{
		model.addAttribute("loginData", new LoginData());
		return "form";
	}
	@GetMapping("/success")
	@PreAuthorize("hasRole('ADMIN')")
	public String successForm()
	{
		//model.addAttribute("loginData", new LoginData());
		return "success";
	}
	
	@PostMapping("/process")
	public String processForm(@Valid@ModelAttribute("loginData") LoginData loginData,BindingResult result)
	{
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
			
		}
		System.out.println(loginData);
		
		return "success";
	}
	
	
	

}
