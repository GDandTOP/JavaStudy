<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String language = "korea";
	String cookie = request.getHeader("Cookie");
	if (cookie!=null) {
		Cookie[] cookies= request.getCookies();
		for (Cookie ck : cookies) {
			if(ck.getName().equals("language")){
				language=ck.getValue();
			}
		}
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키를 이용한 화면 설정 예제</title>
</head>
<body>

<%if(language.equals("korea")) {%>
<h3>안녕하세요. 이것은 쿠키 예제입니다.</h3>
<%} else { %>
<h3>Hello. This is Cookie Example.^^</h3>
<%} %>

<form action="cookieexam" method="post">
	<input type="radio" name="Language" value="korea"
	<%if(language.equals("korea")) {%> checked <%} %>/>한국어 페이지 보기
	<input type="radio" name="Language" value="english"
	<%if(language.equals("english")) {%> checked <%} %>/>영어 페이지 보기
	<input type="submit" value="설정"/>
</form>
</body>
</html>