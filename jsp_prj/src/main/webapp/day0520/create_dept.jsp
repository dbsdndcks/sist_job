<%@page import="day0520.CreateXML"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://192.168.10.231/jsp_prj/common/favicon.ico">
<!-- bootstrap ���� -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!-- bootstrap �� -->
<!--sist��Ÿ�Ͻ�Ʈ ����-->
<link rel="stylesheet" href="http://192.168.10.231/jsp_prj/common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.231/jsp_prj/common/css/board.css" type="text/css" media="all" />
<!--sist��Ÿ�Ͻ�Ʈ ��-->
<!-- JQUERY CDN ����-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--JQUERY CDN ��-->
<style type="text/css">
	
</style>

<script type="text/javascript">
	$(function(){
		
	
	}); //ready
</script>
</head>
<body>
<div>
<%
String type = request.getParameter("type");
if(type != null){
	CreateXML cXML = new CreateXML();
	if("0".equals(type)){
		cXML.createDept(0,null);
	}
	if("1".equals(type)){
		cXML.createDept(1,null);
	}
	
}
%>
<a href="create_dept.jsp?type=0">콘솔 출력</a>
<a href="create_dept.jsp?type=1">파일 출력</a>
<a href="create_dept_2.jsp?">브라우저 출력</a>
</div>
</body>
</html>