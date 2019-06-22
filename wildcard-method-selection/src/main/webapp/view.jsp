<%@ page language="java" pageEncoding="ISO-8859-1" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  <base href="<%=basePath%>">
  <title>View People</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">

</head>
<body>
<h3>People</h3>
<s:if test="personList.size > 0">
  <ol>
    <s:iterator value="personList">
      <li>
        <s:property value="firstName"/>
        <s:property value="lastName"/>
        <s:url action="editPerson" var="editUrl">
          <s:param name="id" value="id"/>
        </s:url>
        <s:url action="deletePerson" var="deleteUrl">
          <s:param name="id" value="id"/>
        </s:url>

        <a href="<s:property value='#editUrl'/>">Edit</a>
        <a href="<s:property value='#deleteUrl'/>">Delete</a>
      </li>
    </s:iterator>
  </ol>
</s:if>
<s:url action="createPerson" var="newUrl">
  <s:param name="id" value="0"/>
</s:url>
<p><a href="<s:property value='#newUrl' />">Create a new Person</a></p>
</body>
</html>
