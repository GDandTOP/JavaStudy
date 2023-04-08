<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.vo.Account" %>
<%@ page import="java.util.HashMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
<b>계좌 목록</b><hr>
<table border="1">
	<tr>
		<th>계좌번호</th><th>이름</th><th>입금액</th>
	</tr>
<%-- 	<%
		HashMap<String, Account> accs= (HashMap<String, Account>)request.getAttribute("accs");
		for(Account acc: accs.values()) {%>
		<tr><td><%=acc.getId() %></td><td><%=acc.getName() %></td><td><%=acc.getMoney() %></td></tr>
	<%	} %>
 --%>
 	<c:forEach items="${accs}" var="acc">
 		<tr>
 			<td>${acc.value.id }</td><td>${acc.value.name }</td><td>${acc.value.money }</td>
 		</tr>
 	</c:forEach>
</table>
<a href="accreg">계좌 등록하기</a>
</center>
</body>
</html>