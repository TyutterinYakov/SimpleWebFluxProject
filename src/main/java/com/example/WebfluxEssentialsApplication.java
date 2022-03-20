package com.example;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxEssentialsApplication {

//	static {
//		BlockHound.install();
//	}

	public static void main(String[] args) {
		SpringApplication.run(WebfluxEssentialsApplication.class, args);

	}

}
