package com.nobodyhub.learn.struts.wildcardmethodselection.service;

import com.nobodyhub.learn.struts.wildcardmethodselection.model.Person;
import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class PersonService {

    private static SortedMap<Integer, Person> people = new TreeMap<>();

    static {
        people.put(0, new Person(0, "Steve", "Smith"));
        people.put(1, new Person(1, "Sue", "Jones"));
    }

    private static List<Person> personList = new ArrayList<>();

    static {
        for (Integer id : people.keySet()) {
            personList.add(people.get(id));
        }
    }

    public static List<Person> getPersons() {
        return personList;
    }

    public static void save(Person person) {
        int newId = getNewId();
        person.setId(newId);
        people.put(newId, person);
        rebuildPersonList();
    }

    private static int getNewId() {
        int newId = 0;
        try {
            newId = people.lastKey() + 1;
        } catch (NoSuchElementException ex) {
            log.info("Id value set to 0");
        }
        return newId;
    }

    public static void update(Person person) {
        Person temp = people.get(person.getId());
        temp.setFirstName(person.getFirstName());
        temp.setLastName(person.getLastName());
        rebuildPersonList();
    }

    public static void delete(int id) {
        people.remove(id);
        rebuildPersonList();
    }

    public static Person getPerson(int id) {
        return people.get(id);
    }

    private static void rebuildPersonList() {
        personList = new ArrayList<>();
        for (Integer id : people.keySet()) {
            personList.add(people.get(id));
        }
    }
}
