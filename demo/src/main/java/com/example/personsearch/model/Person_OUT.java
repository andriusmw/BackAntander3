package com.example.personsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person_OUT {
    private String code;
    private String document;
    private String name;
    private String address;
}