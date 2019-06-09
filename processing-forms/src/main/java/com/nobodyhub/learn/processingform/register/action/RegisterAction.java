package com.nobodyhub.learn.processingform.register.action;

import com.nobodyhub.learn.processingform.register.model.Person;
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
}
