package com.example.SmallWebApp.repository;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.SmallWebApp.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user)
	{
		getSession().save(user);
	}

	@Override
	public void updateUser(User user)
	{
		getSession().update(user);
	}

	@Override
	public void deleteUser(int id) 
	{
		User user = getSession().load(User.class, id);
		if(user != null)
		{
			getSession().delete(user);
		}
		
	}

	@Override
	public User getUserById(int id) 
	{
		
		return getSession().get(User.class, id);
	}

	@Override
	public List<User> getAllUser() 
	{
		Query query = getSession().createQuery("from User ");
		return query.getResultList();
	}
	
	public  Session getSession()
	{
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
}
