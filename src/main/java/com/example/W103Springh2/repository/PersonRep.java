package com.example.W103Springh2.repository;

import com.example.W103Springh2.data.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRep extends CrudRepository<Person, Long> {
}
