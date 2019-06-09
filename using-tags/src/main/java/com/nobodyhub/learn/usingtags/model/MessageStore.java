package com.nobodyhub.learn.usingtags.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class MessageStore {
    @Getter
    @Setter
    private String message;

    public MessageStore() {
        this.message = "Hello Struts User";
    }
}
