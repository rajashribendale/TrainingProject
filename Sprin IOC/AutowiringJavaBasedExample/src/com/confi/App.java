package com.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pojo.Login;
import com.pojo.User;

@Configuration
public class App {
	@Bean(name="user")
	public User u() {
		User user = new User();
		user.setId(11);
		user.setName("A");

		return user;

	}

	@Bean(name="user1")
	public User u1() {
		User user = new User();
		user.setId(123);
		user.setName("C");

		return user;

	}

	@Bean
	public Login login() {
		Login login = new Login();
		login.setLid(12);
		login.setLname("B");
//		login.setUser(user());
		return login;

	}

}
