package com.example.springposgres;

import com.example.springposgres.repository.CustomerRepository;
import com.example.springposgres.repository.DonarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BloodApplication {

	@Autowired
	DonarRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(BloodApplication.class, args);
	}



}

