package com.example.SmallWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SmallWebApp.model.User;
import com.example.SmallWebApp.service.UserService;

@Controller
public class userController 
{
	@Autowired
	private UserService userService;
	
	@GetMapping("/add_user")
	public String getUserForm()
	{
		return "createUser";
	}
	
	@GetMapping("/edit_user")
	public String getEditUserForm(@RequestParam int id, Model model)
	{
		model.addAttribute("user", userService.getUserById(id));
		return "editUser";
	}
	@PostMapping("/save_user")
	public String saveUser(@ModelAttribute User user)
	{
		userService.saveUser(user);
		return "redirect:/list_user";
	}
	@PostMapping("/update_user")
	public String updateUser(@ModelAttribute User user)
	{
		userService.updateUser(user);
		return "redirect:/list_user";
	}
	
	@GetMapping("/delete_user")
	public String deleteUser(@RequestParam int id)
	{
		userService.deleteUser(id);
		return "redirect:/list_user";
	}
	@GetMapping("/list_user")
	public String getAllUser(Model model)
	{
		model.addAttribute("Users", userService.getAllUser());
		return "listUser";
	}
}
