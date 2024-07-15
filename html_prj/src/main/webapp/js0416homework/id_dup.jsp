<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID 중복검사</title>
<!--bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap 끝-->
<!--sist스타일시트 시작-->
<link rel="stylesheet" href="https://www.sist.co.kr/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="https://www.sist.co.kr/css/board.css" type="text/css" media="all" />
<!--sist스타일시트 시작-->
<!--jQuery CDN 시작-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN 끝-->
<style type = "text/css">
	#idWrap{
	    width: 468px;
	    height: 330px;
	    margin: 0px auto;
	}
	#background{
	    width: 464px;
	    height: 326px;
	    background: #FFFFFF url(images/id_background.png) no-repeat;
	    position: relative;
	}
	#inputWrap{
	    position: absolute;
	    top: 186px;
	    left: 103px;
	}
</style>
<script type = "text/javascript">
	$(function() {
		$("#btn").click(function() {
			sendId();
		}); // click
	}); // ready
	
	function sendId() {
		// 현재 창에 입력된 id를 얻어와서 부모 창(opener)에 전달
		opener.$("#id").val($("[name = 'id']").val());
		// 자식 창을 닫는다.
		self.close();
	} // sendId
</script>
</head>
<body>
<div id = "idWrap">
    <div id = "background">
        <div id = "inputWrap">
        <form name = "subFrm">
            <input type = "text" name = "id" value = "${param.id}" class="inputTxt inputIdtype">
            <input type = "button" id = "btn" value = "사용" class = "btn btn-success btn-sm">
        </form>
        </div>
    </div>
</div>
</body>
</html>