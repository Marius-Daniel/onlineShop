package com.shop.OnlineShop;


import com.shop.OnlineShop.models.Users;
import com.shop.OnlineShop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class OnlineShopApplication implements CommandLineRunner {

	private final UserRepository userRepository;


	@Autowired
	public OnlineShopApplication(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		if(userRepository.findAll().isEmpty()){
			userRepository.save(new Users("Daniel"));
			userRepository.save(new Users("Simona "));
		}

		for (Users users : userRepository.findAll()){
			System.out.println(users);
		}
	}
}
