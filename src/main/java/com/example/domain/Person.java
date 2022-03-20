package com.example.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table("person")
public class Person {
    @Id
    @Column("person_id")
    private Long personId;
    @NotNull
    @NotEmpty(message = "The name cannot be empty!")
    private String name;

    public Person() {
    }

    public Person(Long personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
