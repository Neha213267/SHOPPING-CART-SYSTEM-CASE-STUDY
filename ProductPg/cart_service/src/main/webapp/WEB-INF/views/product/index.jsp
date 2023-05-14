<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Page</title>
<style>
body
 {
 background-image: url("https://images.unsplash.com/photo-1566041510394-cf7c8fe21800?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8d2hpdGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60");
}</style>
</head>
<body>

	<h3>Products Page</h3>
	<table cellpadding="3" cellspacing="2" border="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Photo</th>
			<th>Description</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td><img src="https://images.unsplash.com/photo-1618354691551-44de113f0164?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDJ8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500" width="100"></td>
				<td>${product.desc }</td>
				<td>${product.price }</td>
				<td align="center">
					<a href="${pageContext.request.contextPath}/cart/buy/${product.id}">Buy Now</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>