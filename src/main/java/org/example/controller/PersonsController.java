package org.example.controller;

import org.example.entity.Person;
import org.example.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {
    private final PersonsRepository personsRepository;

    @Autowired
    public PersonsController(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }
    @GetMapping("/persons/by-city")
    public List<Person> buCity(@RequestParam String city){
        return personsRepository.getPersonByCity(city);
    }
}
