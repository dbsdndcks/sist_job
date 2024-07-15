<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="RFC 1867 파일업로드"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://192.168.10.231//common/favicon.ico">
<!-- bootstrap ���� -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!-- bootstrap �� -->
<!--sist��Ÿ�Ͻ�Ʈ ����-->
<link rel="stylesheet" href="http://192.168.10.231//common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.231//common/css/board.css" type="text/css" media="all" />
<!--sist��Ÿ�Ͻ�Ʈ ��-->
<!-- JQUERY CDN ����-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--JQUERY CDN ��-->
<style type="text/css">
	
</style>

<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			var file=$("#upFile").val(); 
			var selectExt =  file.substring(file.lastIndexOf(".")+1);
			
			var extArr = ["png","gif","jpg","jpeg","bmp",""];
			
			var flag = false;
			
			for(var i=0; i < extArr.length ; i++){
				if(extArr[i] == selectExt){
					flag = true;
					break;
				}
			}
			if(!flag){
			alert(selectExt + "는 업로드 가능한 확장자 아님요");'				
			}
			
			$("#frm").submit();
			
		});
	
	}); //ready
</script>
</head>
<body>
<div>
	<form action="upload_process.jsp" name="frm" id="frm" method="post" enctype="multipart/form-data">
	<label>업로더명</label>
	<input type="text" name="uploader" value="김본좌"/><br/>
	<label>나이</label>
	<select>
	<c:forEach var="i" begin="10" end="40" step="10">
	<option value=${ i } ><c:out value="${ i }"/>대</option>
	</c:forEach>
	</select><br/>
	<label>업로드파일</label>
	<input type="file" name="upFile" id="upfile" style="width:300px" >
	<input type="button" value="업로드" class="btn btn-info btn-sm" id="btn"/><br/>
	</form>
	
</div>
</body>
</html>