<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Shopping</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<jsp:include page="includes/navbar.jsp" />




	<div class="container">

		<div class="card-header m-3">All Products</div>
		<div class="row">

			<c:forEach var="p" items="${plist}">
				<!-- product_id, product_name, price, rs, product_details, product_addres -->
				<div class="col-md-3 my-3">
					<div class="card w-100">
						<img class="card-img-top" src="product-image/${p.product_addres}"
							alt="Card image cap" height="250px">
						<div class="card-body">
							<h5 class="card-title">
								<b>${p.product_name}</b>
							</h5>
							
							<h6 class="category">
								<b>Details:</b>${p.product_details}</h6>
							<div class="mt-3 d-flex justify-content-between">
								<a class="btn btn-dark" href="add-to-cart?id=${p.product_id}">Add
									to Cart</a> <a class="btn btn-primary"
									href="order-now?quantity=1&id=${p.product_id}">Buy Now</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>