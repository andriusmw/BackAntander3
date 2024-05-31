package com.example.personsearch.mock;

import com.example.personsearch.model.Person_OUT;

import java.util.ArrayList;
import java.util.List;

public class MockPersonData {

    public static List<Person_OUT> getPersons() {
        List<Person_OUT> persons = new ArrayList<>();
        persons.add(new Person_OUT("1", "12345678", "John Doe", "123 Main St"));
        persons.add(new Person_OUT("2", "87654321", "Jane Smith", "456 Elm St"));
        // Add more mock data as needed
        return persons;
    }
}