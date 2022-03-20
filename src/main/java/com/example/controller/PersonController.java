package com.example.controller;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import com.example.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Flux<Person> listAll(){
        return personService.findAll();
    }

    @GetMapping("/{personId}")
    public Mono<Person> findById(@PathVariable("personId") Long personId){
        return personService.findById(personId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Person> createPerson(@Valid @RequestBody Person person){
        return personService.createPerson(person);
    }

    @PutMapping(path = "{personId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Void> updatePerson(@PathVariable("personId") Long personId, String name){
        return personService.updatePerson(personId, name);
    }

    @DeleteMapping(path = "{personId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deletePerson(@PathVariable("personId") Long personId){
        return personService.deletePerson(personId);
    }
}
