package com.nobodyhub.learn.helloworld.model;

import lombok.Getter;

@Getter
public class MessageStore {
    private String message;

    public MessageStore() {
        this.message = "Hello Struts User";
    }
}
