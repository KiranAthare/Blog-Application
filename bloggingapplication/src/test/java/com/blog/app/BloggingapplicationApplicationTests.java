package com.blog.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.app.repositories.UserRepo;

@SpringBootTest
class BloggingapplicationApplicationTests {
	
	
	@Autowired
	UserRepo userRepo;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void repoTest() {
		
		String name = userRepo.getClass().getName();
		Package package1 = userRepo.getClass().getPackage();
		System.out.println(name);
		System.out.println(package1);
	}

}
