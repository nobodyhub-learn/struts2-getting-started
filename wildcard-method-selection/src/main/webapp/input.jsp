<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
  <base href="<%=basePath%>">
  <title>Edit Person</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">
</head>
<body>
<s:if test="id>0">
  <h3>Edit Person</h3>
</s:if>
<s:else>
  <h3>Create Person</h3>
</s:else>

<s:form action="saveOrUpdatePerson">
  <p>
    <s:textfield name="person.firstName" label="First name"/><br>
    <s:textfield name="person.lastName" label="Last name"/>
    <s:hidden name="person.id"/>
    <s:submit value="Save"/>
  </p>
</s:form>
</body>
</html>
