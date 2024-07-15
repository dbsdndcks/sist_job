<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="옵션을 동적 생성"%>
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
		$("#car_country").change(function(){
			if($("#car_country").val()!="N/A"){
				
				var param = {country : $("#car_country").val()};
				$.ajax({
					url: "search_maker.jsp",
					type: "GET",
					data: param,
					dataType:"JSON",
					error: function(xhr){
						alert("문제 발생");
						console.log(xhr.status)
					},
					success: function(jsonObj){
						//응답된 데이터를 Parsiong 하여 사용
						if(!jsonObj.result){
							alert("검색이 원할하지 않습니다. 잠시후 다시 시도해주세요.")
							return;
						}//end if
						
						//<select>의<option>등을 동적으로 생성.
						//1. select 얻기
						var makerSel = $("car_maker")[0];
						
						//2.select에 남아있는 옵션의 개수 설정
						//select 객채.length = 남아있을 옵션의 개수;
						//alert(makerSel.length);
						makerSel.length=1;
						
						//3. option들을 생성.
						//select객체.options[i] = new Option("보여질 값","속성값");
						$.each(jsonObj.data,function(i,jsonTemp){
							makerSel.options[i] = new Option(jsonTemp.maker, jsonTemp.maker);
						})						
					}//success
				})
			}//end if
		})
	}); //ready
</script>
</head>
<body>
<div>
	<select name="car_country" id="car_country">
		<option value="N/A">-------제조국 선택-------</option>
		<option value="1">국산</option>
		<option value="2">수입</option>
	</select>
	<select name="car_maker" id="car_maker">
		<option value="N/A">-------제조사 선택-------</option>
	</select>

</div>
</body>
</html>