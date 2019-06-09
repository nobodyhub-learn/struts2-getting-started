package com.nobodyhub.learn.exceptionhandling.register.action;

import com.nobodyhub.learn.exceptionhandling.register.exception.SecurityBreachException;
import com.nobodyhub.learn.exceptionhandling.register.model.Person;
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

    public void throwException() throws Exception {
        throw new Exception("Exception thrown from throwException");
    }

    public void throwNullPointerException() {
        throw new NullPointerException("Null Pointer Exception thrown from "
                + getClass().toString());
    }

    public void throwSecurityException() throws SecurityBreachException {
        throw new SecurityBreachException(
                "Security breach exception thrown from throwSecurityException");
    }
}
