package com.wagnersodre.apirestmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.wagnersodre.apirestmongo.domain.User;
import com.wagnersodre.apirestmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User u1 = new User(null,"Tania Back", "tania@gmail.com");
		User u2 = new User(null,"Maria Back", "maria@gmail.com");
		User u3 = new User(null,"Joyce Back", "joyce@gmail.com");
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
	}

}
