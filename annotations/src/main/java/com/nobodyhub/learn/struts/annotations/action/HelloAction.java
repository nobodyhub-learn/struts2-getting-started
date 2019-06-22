package com.nobodyhub.learn.struts.annotations.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Log4j2
@Results(
        @Result(name = com.opensymphony.xwork2.Action.SUCCESS, location = "/hello-success.jsp")
)
@Namespace("/")
public class HelloAction extends ActionSupport {
    @Getter
    @Setter
    private String message;

    @Action("hello")
    @Override
    public String execute() throws Exception {
        log.info("In execute method of Hello Action");
        this.message = "Hello from Struts 2 with no XML configuration.";
        return SUCCESS;
    }

}
