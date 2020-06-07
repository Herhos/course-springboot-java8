//020//
package com.herhos.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.herhos.course.entities.User;
import com.herhos.course.repositories.UserRepository;

//021//
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner
{
	//022//
	@Autowired
	private UserRepository userRepository;

	//023//
	@Override
	public void run(String... args) throws Exception
	{
		//024//
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
