package com.nobodyhub.learn.struts.springstruts.service;

import com.nobodyhub.learn.struts.springstruts.model.Person;

public interface EditService {
    Person getPerson();

    void savePerson(Person person);

}
