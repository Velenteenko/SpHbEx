<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cars Management</title>
</head>
<body>
<h1>Cars Data</h1>
<form:form action="car-action.do" method="POST" commandName="car">
	<table>
		<tr>
			<td>Car ID</td>
			<td><form:input path="carId" /></td>
		</tr>
		<tr>
			<td>Mark</td>
			<td><form:input path="mark" /></td>
		</tr>
		<tr>
			<td>Model</td>
			<td><form:input path="model" /></td>
		</tr>
		<tr>
			<td>Producing</td>
			<td><form:input path="producer" /></td>
		</tr>
		<tr>
			<td>Rating</td>
			<td><form:input path="rating" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Show" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>Mark</th>
	<th>Model</th>
	<th>Producer</th>
	<th>Rating</th>
	<c:forEach items="${carList}" var="car">
		<tr>
			<td>${car.carId}</td>
			<td>${car.mark}</td>
			<td>${car.model}</td>
			<td>${car.producer}</td>
			<td>${car.rating}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>