<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "세션의 값읽기" %>
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
		//세션값 얻기
		String name = (String) session.getAttribute("name");

		int age = 0;
		String ageStr = (String) session.getAttribute("age");
		if (ageStr != null) {
			try {
				age = Integer.parseInt(ageStr);
			} catch (NumberFormatException e) {
				// 예외 처리
				e.printStackTrace();
			}
		}
		String ip = (String)session.getAttribute("ipAddr");
		%>
		
		<% if(name == null || age == 0) {%>
	세션에 값이 없습니다
	<form action="use_session_b.jsp">
	<label>이름</label>
	<input type="text" name="name"/><br/>
	<label>나이</label>
	<input type="text" name="age"/><br/>
	<input type="submit" value="세션에 값설정">
	</form>
<%} else{ %>
	<%=ip %> 컴퓨터에서 접속했습니다<br/>
	세션에서 꺼내온 값 : <%= name %>, <%=age %><br/>
	<a href="use_session_c.jsp">세션에 값 삭제</a>
	<a href="temp_a.jsp">로그인후 작업 A</a>
	<a href="temp_b.jsp">로그인후 작업 B(로그인을 하지 않아도 사용가능)</a>
	<a href="temp_c.jsp">로그인후 작업 C</a>
<%} %>
</div>

</body>
</html>