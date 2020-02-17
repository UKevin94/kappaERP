<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Users Tracker</title>
</head>
<body>
   <table>
     <tr>
       <th>ID</th>
       <th>Login</th>
       <th>Password</th>
       <th>Mail</th>
       <th>Admin</th>
       <th>Update</th>
       <th>Delete</th>
     </tr>

     <c:forEach var="user" items="${users}">
      <tr>
         <td> ${user.id} </td>
         <td> ${user.login} </td>
         <td> ${user.password} </td>
         <td> ${user.mail} </td>
         <td> ${user.admin} </td>
         <td><a href="/user/viewUser?userId=${user.id}">Update</a></td>
         <td><a href="/user/deleteUser?userId=${user.id}" onclick="if(!confirm('Are you sure?')) return false;">Delete</a></td>
      </tr>
    </c:forEach>
   </table>
</body>
</html>