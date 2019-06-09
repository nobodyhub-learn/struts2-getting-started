package com.nobodyhub.learn.codingactions.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class MessageStore {

    @Getter
    @Setter
    private String message;
    
    public MessageStore() {
        setMessage("Hello Struts User");
    }

}
