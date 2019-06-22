<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Update Successful</title>
</head>
<body>
<h1>Updated Information</h1>
<p>Your Information: <s:property value="person"/></p>
<p><a href='<s:url action="index"/>'>Return to Home Page</a></p>
</body>
</html>
