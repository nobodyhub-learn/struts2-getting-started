<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Register</title>
  <s:head />
</head>
<body>
<h3>Register for a prize by completing this form.</h3>
<s:form action="register">
  <s:textfield name="person.firstName" label="First Name"/>
  <s:textfield name="person.lastName" label="Last Name"/>
  <s:textfield name="person.email" label="Email"/>
  <s:textfield name="person.age" label="Age"/>
  <s:submit/>
</s:form>
</body>
</html>
