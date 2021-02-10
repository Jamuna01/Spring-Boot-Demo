package com.example.SmallWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HelloController 
{
	@GetMapping("/greet")
	public String sayHello() 
	{
		return "hello";
	}
}
