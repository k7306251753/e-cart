<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Shopping</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<style>
#first {
	margin-top: 30px;
	margin-left: 20%;
}

#useLogin {
	align-content: center;
	color: blue;
}
</style>

</head>

<body>
<body>
<jsp:include page="includes/navbar.jsp" />
	<div class="container m-5">

		<div id="first" class="mx-auto" style="width: 500px;">

			<h1 id="useLogin" align="center">User login</h1>

			<form action ="login" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Email address</label> <input
					type="email" class="form-control col-lg-6" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email">

			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Password</label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password" name="pwd">
			</div>
<
			<button type="submit" class="btn btn-primary" align="center">Submit</button>
			</form>
		</div>
	</div>
	
	<!-- <form action="ProductServ"><button> press here</button></form> -->
	
	
	
</body>
</html>