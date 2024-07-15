<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "scope 객체의 생성과 범위" %>
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
<!-- 
scope
-page : 이페이지를 요청할 때마다 생성, 생성된 객체는 jsp에만 사용
-request : 이 페이지를 요청할 때마다 생성, 생성된 객체는 해당 jsp와 forward로 이동한 jsp에서 사용가능하다
-session : 브라우저마다 하나의 객체가 생성된다,
-application : 최초 접속자에 의해 하나의 객체만 생성되고 생성된 객체는 모든 접속자가 공유 하여 사용하고
모든 페이지에서 객체를 사용할 수있다.
 -->

<!-- 객체생성 -->
<jsp:useBean id="cVO" class="day0426.CounterVO" scope="application"/>
<!-- setter method 호출 -->
<jsp:setProperty property="cnt" name="cVO" value="1"/>
<!-- getter method 호출 -->
당신은 이페이지에 <strong><jsp:getProperty property="cnt" name="cVO"/></strong> 
번째 방문자입니다.
<%
String cnt =String.valueOf( cVO.getCnt());
for(int i=0; i < cnt.length() ; i++){
%>
<img src="images/num_<%= cnt.charAt(i)%>.png"/>
<%} %>

<%-- <jsp:forward page="couunter2.jsp"/> --%>

<% log(request.getRemoteAddr()); %>
<a href="http://192.168.10.210/jsp_prj/day0426/counter.jsp">요청</a>
<a href="counter2.jsp">링크이동</a>
</div>
</body>
</html>