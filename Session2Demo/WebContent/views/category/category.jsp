<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Category</h1>
	<a href="category?action=add">Them moi</a>
	<table border="1" Cellpadding="2">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Counts</th>
			<th>Action</th>
		</tr>
		<c:forEach var="c" items="${lists}">
			<tr>
				<td>${ c.catId }</td>
				<td>${ c.catname }</td>
				<td>${ c.counts }</td>
				<td>
				<a href="category?action=update&id=${ c.catId }">Update</a> 
				<a href="category?action=remove&id=${ c.catId }">Remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>