package com.example.SmallWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.SmallWebApp.model.User;
import com.example.SmallWebApp.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	
	private UserRepository userRepository;
	@Override
	public void saveUser(User user) 
	{
		
		userRepository.saveUser(user);
	}

	@Override
	public void updateUser(User user) 
	{
		
		 userRepository.updateUser(user);
	}

	@Override
	public void deleteUser(int id) 
	{
		 userRepository.deleteUser(id);
		
	}

	@Override
	public User getUserById(int id) 
	{
		
		return userRepository.getUserById(id);
	}

	@Override
	public List<User> getAllUser()
	{
		
		return userRepository.getAllUser();
	}

}
