package com.example.W103Springh2.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.UUID;

import static java.lang.String.format;

//
@Entity
@Table(name = "PERSONS")
public class Person {

    @javax.persistence.Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long Id;

    @Column(name = "person_name")
    private String name;


    public Person() {
        String uid = UUID.randomUUID().toString();
        this.name = format("Name_%s", uid);
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
