package com.nobodyhub.learn.formvalidation.register.action;

import com.nobodyhub.learn.formvalidation.register.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

public class RegisterAction extends ActionSupport {

    @Getter
    @Setter
    private Person person;

    public String execute() {
        return SUCCESS;
    }

    public void validate() {
        if (person.getFirstName().length() == 0) {
            addFieldError("person.firstName",
                    "First name is required.");
        }
        if (person.getFirstName().length() == 0) {
            addFieldError("person.email",
                    "Email is required.");
        }
        if (person.getAge() < 18) {
            addFieldError("person.age",
                    "Age is required and must be 18 or older.");
        }
    }
}
