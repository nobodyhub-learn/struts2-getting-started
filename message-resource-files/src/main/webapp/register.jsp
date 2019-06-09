<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Register</title>
  <s:head/>
</head>
<body>
<h1><s:text name="greeting"/></h1>
<h3><s:text name="instructions"/></h3>

<s:form action="register">
  <s:textfield key="person.firstName" />
  <s:textfield key="person.lastName" />
  <s:textfield key="person.email" />
  <s:textfield key="person.age" />
  <s:submit key="submit"/>
</s:form>
<hr/>
<s:text name="contact"/>
</body>
</html>
