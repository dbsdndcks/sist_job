<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://192.168.10.231/mybatis_prj/common/favicon.ico">
<!-- bootstrap ���� -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!-- bootstrap �� -->
<!--sist��Ÿ�Ͻ�Ʈ ����-->
<link rel="stylesheet" href="http://192.168.10.231/mybatis_prj/common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.231/mybatis_prj/common/css/board.css" type="text/css" media="all" />
<!--sist��Ÿ�Ͻ�Ʈ ��-->
<!-- JQUERY CDN ����-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--JQUERY CDN ��-->
<style type="text/css">
	.margin{margin-bottom: 10px}
</style>

<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$("#frm").submit();
		})
	
	}); //ready
</script>
</head>
<body>
        <h2>메일전송</h2>
        <form action="email_process.jsp" method="post">
            <div>
                <label>수신</label>
                <input type="text" name="email" style="width: 300px" autofocus="autofocus"/><br/>
            </div>
            <div>
                <label>제목</label>
                <input type="text" name="subject" style="width: 300px"/><br/>
            </div>
            <div>
                <label>내용</label>
                <textarea name="content" style="width: 500px; height: 100px"></textarea><br/>
            </div>
            <input type="submit" value="전송" class="btn btn-sm btn-info"/><br/>
        </form>
</body>
</html>