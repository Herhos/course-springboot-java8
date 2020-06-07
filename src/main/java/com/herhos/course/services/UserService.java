//026//
package com.herhos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herhos.course.entities.User;
import com.herhos.course.repositories.UserRepository;

//031//
@Service
public class UserService
{
	//027//
	@Autowired
	private UserRepository repository;
	
	//028//
	public List<User> findAll()
	{
		return repository.findAll();
	}
	
	//032//
	public User findById(Long id)
	{
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
