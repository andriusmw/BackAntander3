package com.example.personsearch.controller;

import com.example.personsearch.model.Person_OUT;
import com.example.personsearch.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/search")
    public List<Person_OUT> searchPersons(@RequestParam("type") String type, @RequestParam("value") String value) {
        return personService.searchPersons(type, value);
    }
}