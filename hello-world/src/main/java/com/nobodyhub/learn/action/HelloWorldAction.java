package com.nobodyhub.learn.action;

import com.nobodyhub.learn.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;

public class HelloWorldAction extends ActionSupport {
    @Getter
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore();
        return SUCCESS;
    }
}
