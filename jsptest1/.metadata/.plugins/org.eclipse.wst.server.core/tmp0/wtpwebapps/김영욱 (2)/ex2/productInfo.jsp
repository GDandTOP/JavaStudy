<%@page import="com.dto.Product"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록정보</title>
</head>
<body>
	<b>상품입력 결과</b>
	<hr />
	<table border='1'>
		<tr>
			<th>상품명</th>
			<th>상품아이디</th>
			<th>수량</th>
		</tr>
	<%
		HashMap<String, Product> products= (HashMap<String, Product>)request.getAttribute("products");
		for(Product product: products.values()) {%>
		<tr><td><%=product.getId() %></td><td><%=product.getName() %></td><td><%=product.getAmount() %></td></tr>
	<%	} %>


	</table>
	<a href="productReg">상품 입력하기</a>
</body>
</html>