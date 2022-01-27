package com.example.springstudy.service.impl;

import com.example.springstudy.bean.Person;
import com.example.springstudy.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person person;

    @Override
    public Person getPersonInfo() {
        return person;
    }
}
