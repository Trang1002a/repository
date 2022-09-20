<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../layout/header.jsp"%>
		
		<table class="table table-hover">
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

<%@include file="../layout/footer.jsp"%>