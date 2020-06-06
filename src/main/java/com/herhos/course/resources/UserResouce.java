//007//
package com.herhos.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herhos.course.entities.User;

//008//
@RestController
//009//
@RequestMapping(value = "/users")
public class UserResouce
{
	//012//
	@GetMapping
	//010//
	public ResponseEntity<User> findAll()
	{
		//011//
		User u = new User(1L, "Maria", "maria@gmail.com", "98765-4321", "1234");
		return ResponseEntity.ok().body(u);
	}
}
