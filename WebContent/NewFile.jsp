<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"></script>
	<%-- <%request.getRequestDispatcher("/ProductServ").forward(request, response); %> --%>
	<%-- <jsp:include page="includes/navbar.jsp" /> --%>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="./ProductServ">KRISHNA'S SHOPING</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="">Home</a></li>
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
</html>