package com.nobodyhub.learn.struts.wildcardmethodselection.action;

import com.nobodyhub.learn.struts.wildcardmethodselection.model.Person;
import com.nobodyhub.learn.struts.wildcardmethodselection.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.List;


@Getter
@Setter
@Log4j2
public class PersonAction extends ActionSupport {

    private Person person;
    private int id;
    private List<Person> personList = PersonService.getPersons();

    public String execute() {
        log.debug("In execute method");
        return SUCCESS;
    }

    public String create() {
        log.debug("In create method");
        person = new Person();
        return INPUT;
    }

    public String runCreateThis() {
        log.debug("In runCreateThis metod");
        person = new Person();
        return INPUT;
    }

    public String edit() {
        log.debug("In edit method");
        person = PersonService.getPerson(id);

        return INPUT;
    }

    public String saveOrUpdate() {
        log.debug("In saveOrUpdate method");
        if (person.getId() > -1) {
            PersonService.update(person);
        } else {
            PersonService.save(person);
        }

        personList = PersonService.getPersons();
        return SUCCESS;
    }

    public String delete() {
        log.debug("In delete method");
        PersonService.delete(id);

        personList = PersonService.getPersons();

        return SUCCESS;
    }
}
