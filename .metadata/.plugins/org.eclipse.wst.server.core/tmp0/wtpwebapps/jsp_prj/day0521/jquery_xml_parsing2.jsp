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
		$("#btn").click(function(){
			$.ajax({
				url:"http://localhost/jsp_prj/day0520/parsing.xml",
				type:"GET",
				dayaType:"XML",
				error:function(xhr){
					alert("문자발생");
					console.log(xhr.status);
				},
				success: function(xmlObj){
					var output = "<ul>";
					// 1. Parsing XML document into jQuery object and finding nodes
					$(xmlObj).find("msg").each(function(i, msgNode){
						// 2. Parsing the found nodes
						output += "<li>" + $(msgNode).text() + "</li>";
					});
					output += "</ul>";
					$("#output").html(output); // Corrected selector
				}
			});
		}); // click
	
		
		$("#btn2").click(function(){
			$.ajax({
				url:"http://localhost/jsp_prj/day0520/create_dept2.jsp",
				type:"GET",
				dataType: "XML",
				success: function(xmlObj){
					alert(xmlObj);
				}
			})
		})
	}); //ready
</script>
</head>
<body>
<div>
	<div>
		<input type="button" id="btn" value="xml요청" class="btn btn-sm btn-success">
		<input type="button" id="btn2" value="xml요청2" class="btn btn-sm btn-success">
	</div>
	<div id="output"></div>
</div>
</body>
</html>