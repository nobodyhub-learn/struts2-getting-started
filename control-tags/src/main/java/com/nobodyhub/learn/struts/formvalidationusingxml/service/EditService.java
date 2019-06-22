package com.nobodyhub.learn.struts.formvalidationusingxml.service;

import com.nobodyhub.learn.struts.formvalidationusingxml.model.Person;

public interface EditService {
    Person getPerson();

    void savePerson(Person person);

}
