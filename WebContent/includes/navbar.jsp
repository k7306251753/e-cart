<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="dto.UserDto"%> 
<%@page import="java.lang.String"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Shopping</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">



</head>
<body>
	<%-- <%request.getRequestDispatcher("/ProductServ").forward(request, response); %> --%>
	<%-- <jsp:include page="includes/navbar.jsp" /> --%>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="./ProductServ">KRISHNA'S SHOPING</a>
			</div>
			<ul class="nav navbar-nav">
				<!-- <li class="active"><a href="">Home</a></li> -->
				<!-- <li><a href="#">Page 1</a></li>
				<li><a href="#">Page 2</a></li> -->
			</ul>
			<%
			request.getSession().getAttribute("cart_list");
			
			%>
				
			<%
			String sessionl = (String) request.getSession().getAttribute("username");
			%>

			<ul class="nav navbar-nav navbar-right">

				<%
				if (sessionl != null) {
				%>
				<li><a href=""><span class="glyphicon glyphicon-user"></span>
						Home</a></li>
				<li><a href="./CartView"><span class="glyphicon glyphicon-user"></span>
						cart<span class="badge badge-danger">${cart_list.size()}</span></a></li>
				<li><a href="./Logout"><span class="glyphicon glyphicon-user"></span>
						logout</a></li>
						<li><span style="color: white;"><%= sessionl %><span></li>
				<%
				}
				%>

				<%
				if (sessionl == null) {
				%>
				<li><a href="registration.jsp"><span
						class="glyphicon glyphicon-user"> register </a></li>
				<li><a href="login.jsp">Login</a></li>
				<%
				}
				%>

			</ul>
		</div>

	</nav>
</body>