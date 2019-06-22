package com.nobodyhub.learn.struts.themes.action;


import com.nobodyhub.learn.struts.themes.model.Person;
import com.nobodyhub.learn.struts.themes.model.State;
import com.nobodyhub.learn.struts.themes.service.EditService;
import com.nobodyhub.learn.struts.themes.service.impl.InMemoryEditService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class EditAction extends ActionSupport {
    private EditService service = new InMemoryEditService();
    @Getter
    @Setter
    private Person person;

    @Getter
    private String[] sports = {"football", "baseball", "basketball"};

    @Getter
    private String[] genders = {"male", "female", "not sure"};

    private List<State> states;

    @Getter
    private String[] carModelsAvailable = {"Ford", "Chrysler", "Toyota", "Nissan"};

    @Override
    public String execute() throws Exception {
        service.savePerson(getPerson());
        return super.execute();
    }

    @Override
    public String input() throws Exception {
        setPerson(service.getPerson());
        return super.input();
    }

    public List<State> getStates() {
        if (states == null) {
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
