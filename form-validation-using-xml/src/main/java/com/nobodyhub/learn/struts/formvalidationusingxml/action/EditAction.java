package com.nobodyhub.learn.struts.formvalidationusingxml.action;

import com.nobodyhub.learn.struts.formvalidationusingxml.model.Person;
import com.nobodyhub.learn.struts.formvalidationusingxml.model.State;
import com.nobodyhub.learn.struts.formvalidationusingxml.service.EditService;
import com.nobodyhub.learn.struts.formvalidationusingxml.service.impl.InMemoryEditService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class EditAction extends ActionSupport {

    private EditService service = new InMemoryEditService();

    @Setter
    @Getter
    private Person person;

    @Getter
    private String[] sports = {"football", "baseball", "basketball"};

    @Getter
    private String[] genders = {"male", "female", "not sure"};

    private List<State> states;

    @Getter
    private String[] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan"};

    @Override
    public String input() throws Exception {
        setPerson(service.getPerson());
        return INPUT;
    }

    @Override
    public String execute() throws Exception {
        service.savePerson(getPerson());
        return SUCCESS;
    }

    public List<State> getStates() {
        if (this.states == null) {
            states = new ArrayList<>();
            states.add(new State("AZ", "Arizona"));
            states.add(new State("CA", "California"));
            states.add(new State("FL", "Florida"));
            states.add(new State("KS", "Kansas"));
            states.add(new State("NY", "New York"));
        }
        return states;
    }
}
