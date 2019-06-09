package com.nobodyhub.learn.formvalidation.action;

import com.nobodyhub.learn.formvalidation.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

public class HelloWorldAction extends ActionSupport {

    private static int helloCount = 0;

    @Getter
    @Setter
    private MessageStore messageStore;

    @Getter
    @Setter
    private String userName;

    public String execute() throws Exception {
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

    public void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }
}
