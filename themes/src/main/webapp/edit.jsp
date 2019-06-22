<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <s:head/>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Struts 2 Form Tags - Edit Person</title>
</head>
<body>
<h1>Update Information</h1>
<p>Use the form below to edit your information</p>

<s:form action="save" method="POST">
  <s:textfield key="person.firstName"/>
  <s:textfield key="person.lastName"/>
  <s:select list="sports" key="person.sport"/>
  <s:radio list="genders" key="person.gender"/>
  <s:select list="states" listKey="stateAbbr" listValue="stateName"
            key="person.residency"/>
  <s:checkbox key="person.over21"/>
  <s:checkboxlist list="carModelsAvailable" key="person.carModels"/>
  <s:submit key="submit"/>
</s:form>
</body>
</html>
