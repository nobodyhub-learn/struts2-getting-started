package com.nobodyhub.learn.struts.formtags.service;

import com.nobodyhub.learn.struts.formtags.model.Person;

public interface EditService {
    Person getPerson();

    void savePerson(Person person);
}
