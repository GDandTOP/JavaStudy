<%@page import="com.dto.Product"%>
<%@ page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
<h3>[ 상품 목록]</h3>
<table border="1">
	<tr>
		<td>상품아이디</td>
		<td>상품명</td>
		<td>갯수</td>
	</tr>
	<%
	Enumeration e = session.getAttributeNames();
	while(e.hasMoreElements()) {
		String id = (String)e.nextElement();
		Product product = (Product)session.getAttribute(id);
%>
	<tr><td><%=product.getId() %></td><td><%=product.getName() %></td><td><%=product.getAmount() %></td></tr>
<%		
	}
%>

</table>
<a href="ProductAddFormServlet">상품등록</a><br>	
<a href="ProductDeleteFormServlet">상품삭제</a><br>	
<a href="ProductAllDeleteServlet">상품전체삭제</a><br>		
</body>
</html>