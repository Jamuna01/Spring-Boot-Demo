package com.example.SmallWebApp.repository;

import java.util.List;

import com.example.SmallWebApp.model.User;

public interface UserRepository 
{
	void saveUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(int	id);
	
	User getUserById(int id);
	
	List<User> getAllUser();
	
}
