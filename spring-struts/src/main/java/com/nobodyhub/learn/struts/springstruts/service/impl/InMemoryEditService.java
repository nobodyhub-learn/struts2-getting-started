package com.nobodyhub.learn.struts.springstruts.service.impl;

import com.nobodyhub.learn.struts.springstruts.model.Person;
import com.nobodyhub.learn.struts.springstruts.service.EditService;
import org.springframework.stereotype.Component;

@Component
public class InMemoryEditService implements EditService {

    private static Person person;
    private static String[] carModels = {"Ford", "Nissan"};

    static {
        person = new Person();
        person.setFirstName("Bruce");
        person.setLastName("Phillips");
        person.setEmail("bphillips@ku.edu");
        person.setSport("basketball");
        person.setGender("not sure");
        person.setResidency("KS");
        person.setOver21(true);
        person.setCarModels(carModels);
        person.setPhoneNumber("123-456-9999");
    }


    @Override
    public Person getPerson() {
        return person;
    }

    @Override
    public void savePerson(Person person) {
        InMemoryEditService.person.setFirstName(person.getFirstName());
        InMemoryEditService.person.setLastName(person.getLastName());
        InMemoryEditService.person.setSport(person.getSport());
        InMemoryEditService.person.setGender(person.getGender());
        InMemoryEditService.person.setResidency(person.getResidency());
        InMemoryEditService.person.setOver21(person.isOver21());
        InMemoryEditService.person.setCarModels(person.getCarModels());
        InMemoryEditService.person.setEmail(person.getEmail());
        InMemoryEditService.person.setPhoneNumber(person.getPhoneNumber());

    }
}
