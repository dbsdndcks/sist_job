<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="사용자가 값을 입력하는 폼"%>
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
	#wrap{width : 1000px; height: 600px; margin: 0px auto;}
	#divGet{width : 500px; height: 598px; border: 1px solid #333; float: left;}
	#divPost{width : 500px; height: 598px; border: 1px solid #FF0000; float: right;}
</style>

<script type="text/javascript">
	$(function(){
		$("#getBtn").click(function(){
			$("#frmGet").submit();
		})
		
		$("#postBtn").click(function(){
			$("#frmPost").submit();
		})
	
	}); //ready
</script>
</head>
<body>
<div>
	<div id="wrap">
	<div id="divGet">
	<h3>Get방식요청</h3>
	<form action="use_parameter_frm_process.jsp" method="get" id="frmGet">
		<label>text</label>
		<input type="text" name="txt" value="get연습"><br/>
		<label>password</label>
		<input type="password" name="pass" value="password"><br/>
		<label>hidden</label>
		<input type="hidden" name="hid" value="숨겨진 정명호씌"><br/>
		<label>checkbox</label>
		<input type="checkbox" name="chk" value="save">저장<br/>
		<label>select</label>
		<select name="loc">
			<option value="서울">서울</option>
			<option value="경기도">경기</option>
			<option value="충청도" selected="selected">충청</option>
			<option value="경상도">경상</option> 
			<option value="전라도">전라</option> 
			<option value="제주도">제주</option>
		</select><br/>
		<label>textarea</label>
		<textarea style="width: 300px;height: 100px;" name="ta">textarea 연습</textarea><br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>취미</label>
		<input type="checkbox" name="hobby" value="등산">등산<br/>
		<input type="checkbox" name="hobby" value="낚시">낚시<br/>
		<input type="checkbox" name="hobby" value="독서">독서<br/>
		<input type="checkbox" name="hobby" value="운동">운동<br/>
		
		<input type="button" value="Get" class="btn btn-success" id="getBtn">
	</form>
	</div>
	
	<div id="divPost">
		<h3>Post방식요청</h3>		
		<form action="use_parameter_frm_process.jsp" method="post" id="frmPost">
		<label>text</label>
		<input type="text" name="txt" value="post연습"><br/>
		<label>password</label>
		<input type="password" name="pass" value="password"><br/>
		<label>hidden</label>
		<input type="hidden" name="hid" value="숨겨진 정명호씌"><br/>
		<label>checkbox</label>
		<input type="checkbox" name="chk" value="save">저장<br/>
		<label>select</label>
		<select name="loc">
			<option value="서울">서울</option>
			<option value="경기도">경기</option>
			<option value="충청도" >충청</option>
			<option value="경상도">경상</option> 
			<option value="전라도">전라</option> 
			<option value="제주도" selected="selected">제주</option>
		</select><br/>
		<label>textarea</label>
		<textarea style="width: 300px;height: 100px;" name="ta">post연습</textarea>
		<br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>이름</label>
		<input type="text" name="name"><br/>
		<label>취미</label>
		<input type="checkbox" name="hobby" value="등산">등산<br/>
		<input type="checkbox" name="hobby" value="낚시">낚시<br/>
		<input type="checkbox" name="hobby" value="독서">독서<br/>
		<input type="checkbox" name="hobby" value="운동">운동<br/>
		
		
		<input type="button" value="Post" class="btn btn-success" id="postBtn">		
	</form>	
	</div>
	</div>
</div>
</body>

</html>