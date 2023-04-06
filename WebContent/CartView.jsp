<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Shopping</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>

<body>
	<%@include file="/includes/navbar.jsp"%>
	<div class="container m-5">

		<div align="left" class="h5">Total Price$: ${total}</div>

		<table class="table table-light">
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
					<th scope="col" >Quantity</th>
					<th scope="col">Buy Now</th>
           			<th scope="col">Cancel</th>
				</tr>
			</thead>
			<tbody>


				<c:forEach var="p" items="${cvlist}">
					<tr>
						<td>${ p.getProduct_name()}</td>
						<td>RS${p.getPrice()}</td>
						<td><a href="./inc-dec-qt?action=inc&id=${p.getProduct_id()}&price=${p.getPrice()}"
							class="link-primary"><b>+</b></a> <input type="text"
							readonly="readonly" value=${p.getPquantity()}> <a
							href="./inc-dec-qt?action=dec&id=${p.getProduct_id()}"
							class="link-primary"><b>-</b></a></td>
                        <td><input type="submit" class="btn btn-success" value="Buy"></td>
						<td><input type="submit" class="btn btn-danger"  value="Remove"></td>
						
					</tr>


				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>