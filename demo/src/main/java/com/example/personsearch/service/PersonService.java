package com.example.personsearch.service;

import com.example.personsearch.model.Person_OUT;
import com.example.personsearch.mock.MockPersonData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    public List<Person_OUT> searchPersons(String type, String value) {
        List<Person_OUT> allPersons = MockPersonData.getPersons();
        switch (type) {
            case "C":
                return allPersons.stream().filter(p -> p.getCode().equalsIgnoreCase(value)).collect(Collectors.toList());
            case "D":
                return allPersons.stream().filter(p -> p.getDocument().equalsIgnoreCase(value)).collect(Collectors.toList());
            case "N":
                return allPersons.stream().filter(p -> p.getName().equalsIgnoreCase(value)).collect(Collectors.toList());
            default:
                throw new IllegalArgumentException("Invalid search type");
        }
    }
}