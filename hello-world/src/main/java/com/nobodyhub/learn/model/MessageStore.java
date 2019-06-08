package com.nobodyhub.learn.model;

import lombok.Getter;

@Getter
public class MessageStore {
    private String message;

    public MessageStore() {
        this.message = "Hello Struts User";
    }
}
