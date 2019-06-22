package com.nobodyhub.learn.struts.annotations.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}
