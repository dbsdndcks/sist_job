<%@page import="java.util.Random"%>
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

[
<a href="jstl_choose.jsp?type=guest">방문자</a>|
<a href="jstl_choose.jsp?type=member">회원</a>|
<a href="jstl_choose.jsp?type=admin">관리자</a>
]
<c:if test="${not empty param.type }">
<c:choose>
<c:when test="${param.type eq 'admin'}">
<a href="">읽기</a>
<a href="">쓰기</a>
<a href="">변경</a>
<a href="">삭제</a>
</c:when>
<c:when test="${param.type eq 'member'}">
<a href="">읽기</a>
<a href="">쓰기</a>
</c:when>
<c:otherwise>
손님은 권한 없음
</c:otherwise>
</c:choose>
</c:if>

<!-- 1. 0또는 1의 난수를 발생시켜, scope 객체 저장 -->
<form action="jstl_choose.jsp" >
<%
int num = new Random().nextInt(2);
pageContext.setAttribute("genderNum", num);
 %>>
 <%=num %>
<!-- 2. name="gender"인 hidden에 value 속성에 scope객체의 값을 설정-->
<input type="hidden" name="gender" value="${genderNum}">
<input type="submit" value="전송"/>
</form>

<!-- 3. submit이 클릭되면 parameter값이 존재하고 , parameter가 있을때
0이면 f이미지 보여주고 1이면 m이미지를 보여준다 -->
<c:if test="${not empty param.gender}">
	<c:choose>
		<c:when test="${param.gender eq 0}">
			<c:set var="img" value="f"/>
		</c:when>
		<c:when test="${param.gender eq 1}">
			<c:set var="img" value="f"/>
		</c:when>
	</c:choose>
</c:if>

<img src="images/${img}.png"/>
</div>
</body>
</html>