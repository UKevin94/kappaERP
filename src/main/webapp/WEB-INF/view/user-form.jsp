<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Users Tracker</title>
</head>
<body>

 <h3>Add Users</h3>

  <form:form action="saveUser" modelAttribute="user" method="POST">

     <form:hidden path="id"/>

     <label>Login:</label>
     <form:input path="login"/> <br/>

     <label>Password:</label>
     <form:input path="password"/> <br/>

     <label>Mail:</label>
     <form:input path="mail"/> <br/>

     <label>Admin:</label>
     <form:input path="admin"/> <br/>

     <input type="submit" value="Save" class="save" />
  </form:form>
</body>
</html>