<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Orders Tracker</title>
</head>
<body>
   <table>
     <tr>
       <th>ID</th>
       <th>User contact</th>
       <th>Customer</th>
       <th>Products</th>
       <th>Order date</th>
       <th>Price (in €)</th>
     </tr>

     <c:forEach var="order" items="${orders}">
      <tr>
         <td> ${order.id} </td>
         <td> ${order.users.id} </td>
         <td> ${order.customer} </td>
         <td> ${order.products} </td>
         <td> ${order.orderDate} </td>
         <td> ${order.price} </td>
      </tr>
    </c:forEach>
   </table>
</body>
</html>