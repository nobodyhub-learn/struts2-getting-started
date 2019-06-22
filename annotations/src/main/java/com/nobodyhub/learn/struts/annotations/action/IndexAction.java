package com.nobodyhub.learn.struts.annotations.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Namespace("/")
@Results({
        @Result(name=IndexAction.SUCCESS, location = "/index.jsp")
})
public class IndexAction extends ActionSupport {
    @Action("index")
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
