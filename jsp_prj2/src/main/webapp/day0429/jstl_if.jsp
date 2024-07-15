<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "icon" href = "http://192.168.10.232/jsp_prj/common/favicon.ico">
<!--bootstrap ����-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap ��-->
<!--sist css ����-->
<link rel="stylesheet" href="http://192.168.10.231/jsp_prj/common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.231/jsp_prj/common/css/board.css" type="text/css" media="all" />
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
<c:if test="false">
이것은 보입니다.
</c:if>

<c:if test="${empty param.flag}">
<strong>아래의 요청 링크를 클릭해주세요.</strong>
</c:if>
<a href="jstl_if.jsp?flag=1">요청</a>

<c:if test="${empty sessionScope.id}">
<a href="jstl_if_1.jsp?">로그인</a>
</c:if>

<c:if test="${not empty sessionScope.id}">
<c:out value="${name}"/>님 로그인했습니다
</c:if>

<a href="logout.jsp?flag=out">로그아웃</a>

</div>
</body>
</html>