//020//
package com.herhos.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.herhos.course.entities.Category;
import com.herhos.course.entities.Order;
import com.herhos.course.entities.User;
import com.herhos.course.entities.enums.OrderStatus;
import com.herhos.course.repositories.CategoryRepository;
import com.herhos.course.repositories.OrderRepository;
import com.herhos.course.repositories.UserRepository;

//021//
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner
{
	//022//
	@Autowired
	private UserRepository userRepository;
	
	//046//
	@Autowired
	private OrderRepository orderRepository;
	
	//052//
	@Autowired
	private CategoryRepository categoryRepository;

	//023//
	@Override
	public void run(String... args) throws Exception
	{
		//024//
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//047//
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		//053//
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
}
