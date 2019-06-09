<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Exception Handling - Security Error</title>
</head>
<body>
<h4>There has been a security error.</h4>

<p> Please contact technical support with the following information:</p>

<h4>Exception Name: <s:property value="exception"/></h4>
<h4>Exception Details: <s:property value="exceptionStack"/></h4>

<p><a href="index.jsp">Return to the home page.</a></p>
</body>
</html>
