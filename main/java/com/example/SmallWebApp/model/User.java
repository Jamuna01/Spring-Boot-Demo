package com.example.SmallWebApp.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name= "user_name")
	private String username;
	private String password;
	private String gender;
	private String nationality;
	private String hobbies;
	@Column(name= "mobile_no")
	private long mobileNo;
	private LocalDate dob;
	private String email;
	private String comments;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getUsername() 
	
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public String getNationality() 
	{
		return nationality;
	}
	public void setNationality(String nationality) 
	{
		this.nationality = nationality;
	}
	public String getHobbies() 
	{
		return hobbies;
	}
	public void setHobbies(String hobbies)
	{
		this.hobbies = hobbies;
	}
	public LocalDate getDob()
	{
		return dob;
	}
	public void setDob(LocalDate dob)
	{
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getComments() 
	{
		return comments;
	}
	public void setComments(String comments) 
	{
		this.comments = comments;
	}
	
}
