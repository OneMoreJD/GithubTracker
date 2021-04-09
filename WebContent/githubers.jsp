<%@page import="fr.wildcodeschool.githubtracker.model.Githuber"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<jsp:include page="header.jsp"></jsp:include>

<!-- <ul class="list-group"> -->
<%-- 	<% Githuber[] githubers = (Githuber[])request.getAttribute("githubers"); for(int i = 0; i< githubers.length; i++) { %> --%>
<!-- 	<li class="list-group-item"> -->
<%-- 		<% out.write(githubers[i].getName()); %> --%>
<!-- 	</li> -->
<%-- 	<% } %> --%>
<!-- </ul> -->
<!-- <br> -->
<br>
<div class="container">
	<ul class="list-group justify-content-center">
		<li class="list-group-item bg-info">
			<div class="container">
				<div class="row text-white">
					<div class="col-sm">Id</div>
					<div class="col-sm">Name</div>
					<div class="col-sm">Email</div>
				</div>
			</div>
		</li>
		<c:forEach items="${githubers}" var="githuber">
			<li class="list-group-item">
				<div class="container">
					<div class="row">
						<div class="col-sm">${githuber.getId()}</div>
						<div class="col-sm">${githuber.getName()}</div>
						<div class="col-sm">${githuber.getEmail()}</div>
					</div>
				</div>
			</li>
		</c:forEach>
	</ul>
</div>
</body>
</html>