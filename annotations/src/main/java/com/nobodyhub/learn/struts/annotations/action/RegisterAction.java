package com.nobodyhub.learn.struts.annotations.action;

import com.nobodyhub.learn.struts.annotations.model.Person;
import com.opensymphony.xwork2.ActionSupport;
import lombok.extern.log4j.Log4j2;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;


@Namespace("/")
@Log4j2
@Results({
        @Result(name = com.opensymphony.xwork2.Action.INPUT, location = "/register-input.jsp"),
        @Result(name = com.opensymphony.xwork2.Action.SUCCESS, location = "/register-success.jsp")
})
public class RegisterAction extends ActionSupport {
    private Person person;

    @Action("register-input")
    @Override
    public String input() throws Exception {
        log.info("In input method of Register Action");
        return INPUT;
    }

    @Action("register")
    @Override
    public String execute() throws Exception {
        log.info("In execute method of class Register Action.");
        return SUCCESS;
    }
}
