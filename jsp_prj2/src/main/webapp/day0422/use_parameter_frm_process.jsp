<%@page import="java.net.URLEncoder"%>
<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="HTML FORM CONTROL의 입력 값을 받는 페이지"%>
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
<strong><%= request.getMethod() %>방식의 요청</strong>
	<%
	//request 내장 객체를 사용하여 Form Control의 입력값을 받기(web parameter)
	//name 속성의 값이 유일한 경우 request.getParameter로 받는다.
	String txt = request.getParameter("txt"); // <input type="text" name="txt"
	String pass = request.getParameter("pass"); // <input type="password" name="pass"
	String hid = request.getParameter("hid"); // <input type="hidden" name="hid"
	String chk = request.getParameter("chk"); // <input type="checkbox" name="chk"
	String loc = request.getParameter("loc"); // <selected name="loc"> 
	String ta = request.getParameter("ta"); // <textarea name="ta"> 
	
	//String class로 encoding
	String str = new String(txt.getBytes("8859_1"),"UTF-8");
	String str2 = URLDecoder.decode(URLEncoder.encode(hid,"8859_1"),"UTF-8");
	
	//name 속성에 값이 같으면 배열로 처리되고, request.getParameterValues("이름")받는다.
	String[] names = request.getParameterValues("name"); // <input type="text" name="name">
	String[] hobbys = request.getParameterValues("hobby"); // <input type="text" name="name">
	
	
	%>
	<ul>
	<li><strong> text : </strong><%=txt%>,<%=str %></li>
	<li><strong> password : </strong><%=pass %></li>
	<li><strong> hidden : </strong><%=hid %>,<%=str2 %></li>
	<li><strong> checkbox : </strong><%=chk %></li>
	<li><strong> select : </strong><%=loc %></li>
	<li><strong> textarea : </strong><%=ta %></li>
	</ul>
	이름 :
	<%
	for(String name : names){%>
	<%= name %>
	<%}%>
	<br/>
	취미 : 
	<%
	try{
		for(String temp : hobbys){%>  //체크박스는 체크하지않으면 파라미터로 생성되지않아 배열에 null이 들어감
	
	//반박하면 nullpointerException 발생
	<%= temp %>
	<%}
	}catch(NullPointerException npe){
		out.println("선택취미 없음");
	}%>
	<br/>
	<a href="use_parameter_frm.jsp">뒤로</a>
</div>
</body>

</html>