package com.nobodyhub.learn.struts.themes.service.impl;

import com.nobodyhub.learn.struts.themes.model.Person;
import com.nobodyhub.learn.struts.themes.service.EditService;

public class InMemoryEditService implements EditService {
    private static Person person;
    private static String[] carModels = {"Ford", "Nissan"};

    static {
        person = new Person();
        person.setFirstName("Bruce");
        person.setLastName("Phillips");
        person.setSport("basketball");
        person.setGender("not sure");
        person.setResidency("KS");
        person.setOver21(true);
        person.setCarModels(carModels);
    }

    @Override
    public Person getPerson() {
        return person;
    }

    @Override
    public void savePerson(Person person) {
        InMemoryEditService.person.setFirstName(person.getFirstName() );
        InMemoryEditService.person.setLastName(person.getLastName() );
        InMemoryEditService.person.setSport(person.getSport() );
        InMemoryEditService.person.setGender( person.getGender() );
        InMemoryEditService.person.setResidency( person.getResidency() );
        InMemoryEditService.person.setOver21( person.isOver21() );
        InMemoryEditService.person.setCarModels(person.getCarModels() );
    }
}
