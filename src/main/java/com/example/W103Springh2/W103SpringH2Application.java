package com.example.W103Springh2;

import com.example.W103Springh2.data.Person;
import com.example.W103Springh2.repository.PersonRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
@RequestMapping(value = "", produces = "application/json")
public class W103SpringH2Application {

	public static void main(String[] args) {
		SpringApplication.run(W103SpringH2Application.class, args);
	}

	@Autowired
	private PersonRep personRep;

	@RequestMapping("create-person")
	public Person createPerson() {
		return personRep.save(new Person());
	}

	@RequestMapping("persons")
	public ArrayList getList() {
		return (ArrayList) personRep.findAll();
	}

}
