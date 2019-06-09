package com.nobodyhub.learn.codingactions.action;

import com.nobodyhub.learn.codingactions.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

public class HelloWorldAction extends ActionSupport {
    private static int helloCount = 0;

    @Getter
    private MessageStore messageStore;

    @Getter
    @Setter
    private String userName;

    public String execute() {
        messageStore = new MessageStore();

        if (userName != null) {
            messageStore.setMessage(messageStore.getMessage() + " " + userName);
        }

        helloCount++;

        return SUCCESS;
    }

    public int getHelloCount() {
        return helloCount;
    }

}
