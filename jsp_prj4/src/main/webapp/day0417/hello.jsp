<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hello</title>
<style type = "text/css">
div{
	border: 1px solid #333;
	width: 400px;
	height: 300px;
}
</style>
</head>
<body>
<%
String name = "윤웅찬";
%>
<div>
<marquee><%= name %>님 안녕하세요?</marquee>
</div>
</body>
</html>