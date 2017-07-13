package com.eteration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eteration.entity.Question;
import com.eteration.entity.User;

@SpringBootApplication
public class ApplicationMain implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Question question=new Question();
//		question.setHeader("deneme");
//		question.setBody("dendemdendne");
//		question.setDate("sdfadfdsf");
//		
//		User user=new User();
//		user.set
	}
}
