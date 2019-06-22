package com.nobodyhub.learn.struts.themes.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private String sport;
    private String gender;
    private String residency;
    private boolean over21;
    private String[] carModels;
}
