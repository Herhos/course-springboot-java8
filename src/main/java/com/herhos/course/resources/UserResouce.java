//007//
package com.herhos.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herhos.course.entities.User;
import com.herhos.course.services.UserService;

//008//
@RestController
//009//
@RequestMapping(value = "/users")
public class UserResouce
{
	//029//
	@Autowired
	private UserService service;
	
	/*012//
	@GetMapping
	//010//
	public ResponseEntity<User> findAll()
	{		
		//011 - substituído por 030//
		User u = new User(1L, "Maria", "maria@gmail.com", "98765-4321", "1234");
		return ResponseEntity.ok().body(u);		
	}*/
	
	//012//
	@GetMapping
	//010//
	public ResponseEntity<List<User>> findAll()
	{		
		//030//
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//033//
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id)
	{
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
