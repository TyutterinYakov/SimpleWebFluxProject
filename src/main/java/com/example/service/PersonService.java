package com.example.service;

import com.example.domain.Person;
import com.example.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

    private final PersonRepository personDao;

    public PersonService(PersonRepository personDao) {
        this.personDao = personDao;
    }

    public Flux<Person> findAll(){
        return personDao.findAll();
    }


    public Mono<Person> findById(Long personId) {
        return personDao.findById(personId)
                .switchIfEmpty(
                        Mono.error(
                                new ResponseStatusException(
                                        HttpStatus.NOT_FOUND,
                                        String.format("Person identificate \"%s\" not found!", personId))))
                .log();
    }

    public Mono<Person> createPerson(Person person) {
        return personDao.save(person);
    }

    @Transactional
    public Mono<Void> updatePerson(Long personId, String name){
        return personDao.findById(personId)
                .map((person)->{
                    person.setName(name);
                    return person;
                })
                .flatMap(personDao::save)
                .then();
    }

    public Mono<Void> deletePerson(Long personId) {
        return personDao.findById(personId)
                .flatMap(personDao::delete);
    }
}
