package com.nobodyhub.learn.helloworld.action;


import com.nobodyhub.learn.helloworld.model.MessageStore;
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

