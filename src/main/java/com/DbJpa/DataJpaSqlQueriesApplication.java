package com.DbJpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.entity.User;
import com.DbJpa.repo.UserRepo;



@SpringBootApplication
public class DataJpaSqlQueriesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DataJpaSqlQueriesApplication.class, args);
		UserRepo repo=context.getBean(UserRepo.class);
		List<User> user=repo.getAllUsersHql();
		user.forEach(users->{
			System.out.println(users);
		});
		System.out.println("###########################################");
		
		List<User> user1=repo.getAllUsersSql();
		user1.forEach(users->{
			System.out.println(users);
		});
		System.out.println("###########################################");
		
		
		user=repo.getAllUsersByCountry("India");
		user1.forEach(users->{
			System.out.println(users);
		});
		System.out.println("###########################################");
		
		user=repo.getAllUsersByCountryAndAge("India", 32);
		user1.forEach(users->{
			System.out.println(users);
		});
		
	
		
	}

}
