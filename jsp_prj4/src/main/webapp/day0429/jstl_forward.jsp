<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "icon" href = "http://192.168.10.232//common/favicon.ico">
<!--bootstrap ����-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap ��-->
<!--sist css ����-->
<link rel="stylesheet" href="http://192.168.10.231//common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.231//common/css/board.css" type="text/css" media="all" />
<!--sist css ��-->
<!--jQuery CDN ����-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN ��-->
<style type = "text/css">

</style>
<script type = "text/javascript">
    $(function() {

    }); // ready
</script>
</head>
<body>
<div>
	<c:forEach var="i" begin="1" end="10" step="3">
	<c:out value="${i}"/>
	</c:forEach>
	<c:forEach var="i" begin="1" end="6" step="1">
	<h${i}>안녕하세요?</h>
	</c:forEach>
	
	<hr>
	<%
	int nowYear = Calendar.getInstance().get(Calendar.YEAR);
	int nowMonth = Calendar.getInstance().get(Calendar.MONTH);
	int nowDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	int lastDay = Calendar.getInstance().getMaximum(Calendar.DATE);
	pageContext.setAttribute("nowYear", nowYear);
	pageContext.setAttribute("nowMonth", nowMonth);
	pageContext.setAttribute("nowDay", nowDay);
	pageContext.setAttribute("lastDay", lastDay);
	%>
	<!-- 1950~현재년도까지를 가진 select 출력 -->
	<select>
		<c:forEach var="year" begin="${nowYear - 2 }" end="${nowYear+2}" step="1">
		<option value="${year}" <c:if test="${year eq nowYear}">selected</c:if>>
			<c:out value="${year}"/>
		</option>
		</c:forEach>
	</select>년
	<select>
		<c:forEach var="month" begin="1" end="12" step="1">
		<option value="${month}" <c:if test="${month eq nowMonth + 1}">selected</c:if>>
			<c:out value="${month}"/>
		</option>
		</c:forEach>
	</select>월
		<select>
		<c:forEach var="day" begin="1" end="${lastDay}" step="1">
		<option value="${day}" <c:if test="${day eq nowDay}">selected</c:if>>
			<c:out value="${day}"/>
		</option>
		</c:forEach>
	</select>일
</div>
</body>
</html>