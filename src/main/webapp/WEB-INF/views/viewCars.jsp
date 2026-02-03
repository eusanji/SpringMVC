<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cars List</title>
</head>
<body>
<h1>Cars List</h1>
<table border="2" width="60%" cellpadding="2">
	<tr><th>CarId</th><th>Manufacturer</th><th>Model</th><th>City name</th><th>Registration Number</th><th>Edit</th><th>Delete</th></tr>
	<c:forEach var="car" items="${list}">
	<tr>
		<td>${car.carId}</td>
		<td>${car.manufacturer}</td>
		<td>${car.model}</td>
		<td>${car.city}</td>
		<td>${car.registrationNumber}</td>
		<td><a href="editCars/${carId}">Edit</a></td>
		<td><a href="deleteCars/${carId}">Delete</a></td>
	</tr>
	</c:forEach>
</table>
<br/>
<a href="addCars">Add New Car</a>

</body>
</html>