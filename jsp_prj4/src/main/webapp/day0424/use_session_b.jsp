<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "" %>
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
<%
	String ip = request.getRemoteAddr();
	String paramName = request.getParameter("name");
	String paramAge = request.getParameter("age");
	
	
	Integer age =  null;
	if(! "".equals(paramAge)){
		age = Integer.valueOf(paramAge);
	}
	
	//세션에 값 생존시간 설정 : session은 was에서 하나이기때문에 어디에서든 생존시간을 설정하면
	//모든페이지에 설정된다
	session.setMaxInactiveInterval(60);
	
	
	//세션에 값 설정
	session.setAttribute("ipAddr", ip);
	session.setAttribute("name", paramName);
	session.setAttribute("age", paramAge);
	%>
	
	세션에 값이 설정되었습니다.
	<a href="use_session_a.jsp">세션읽기</a>
</div>
</body>
</html>