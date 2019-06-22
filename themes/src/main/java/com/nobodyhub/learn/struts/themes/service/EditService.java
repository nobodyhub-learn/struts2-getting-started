package com.nobodyhub.learn.struts.themes.service;

import com.nobodyhub.learn.struts.themes.model.Person;

public interface EditService {
    Person getPerson();

    void savePerson(Person person);
}
