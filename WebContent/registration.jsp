<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
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

<jsp:include page="includes/navbar.jsp" />
	
	<div class="container"  WIDTH="50%">
		<h2 align="center" color="blue" >USER SIGNUP</h2>
		<form action="registration" method="post">
			<div class="form-group">
				<label for="fname">First Name:</label> <input type="text"
					class="form-control" id="fname" placeholder="Enter First Name"
					name="fname">
			</div>
			<div class="form-group">
				<label for="lname">Last name:</label> <input type="text"
					class="form-control" id="lname" placeholder="Enter LastName"
					name="lname">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email"
					name="email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="pwd">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
</html>
