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
			var param ={
					key:6468010935,
					type:"xml",
					numOfRows:$("#cnt").val(),
					pageNo:1
					}
			
			$.ajax({
				url:"https://data.ex.co.kr/openapi/business/curStateStation",
				type:"GET",
				data: param,
				dataType:"XML",
				error: function(xhr){
					alert("dk....");
					console.log(xhr.status);
				},
				success: function(xmlObj){
					var output="<table class='table'>";
					output+="<thead><tr>"
					
					output+="<th style='width:100px'>방향</th>"
					output+="<th style='width:300px'>정유사</th>"
					output+="<th style='width:150px'>가솔린</th>"
					output+="<th style='width:150px'>디젤</th>"
					output+="<th style='width:150px'>lpg</th>"
					output+="<th style='width:130px'>전화번호</th>"
					output+="</tr></thead><tbody>"
					//1.반복
					$(xmlObj).find("list").each(function(i,listNode){
						oil=$(listNode).find("oilCompany").text();
						if(oil=="AD"){oil ="GS"}
						//2.파싱
					output+="<tr>"
					output+="<td>"+ $(listNode).find("direction").text() +"</td>"
					output+="<td>"+ $(listNode).find("oilCompany").text() +"</td>"
					output+="<td>"+ $(listNode).find("gasolinePrice").text() +"</td>"
					output+="<td>"+ $(listNode).find("diselPrice").text() +"</td>"
					output+="<td>"+ $(listNode).find("lpgPrice").text() +"</td>"
					output+="<td>"+ $(listNode).find("telNo").text() +"</td>"
					});
					output+="</tr><tbody>";
					$("#output").html(output);
				}
			});
		});	
		
	}); //ready
</script>
</head>
<body>
<div>
	<select id="cnt">
		<option value="10">10</option>
		<option value="20">20</option>
		<option value="99">99</option>
	</select>
	<input type="button" value="주유소 요청" class="btn btn-info btn-sm" id="btn"/>
	<div id="output"></div>
</div>
</body>
</html>