<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.user.member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
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
	window.onload = function() {
		document.getElementById("btn").addEventListener("click", idNullChk);
		document.getElementById("id").addEventListener("keydown", isEnter);		
	} // function
	
	function isEnter(evt){
		if(evt.which == 13){
			idNullChk();
		}//end if
	}// isEnter
	
	function idNullChk() {
		var obj = document.subFrm;
		var id = obj.id.value;
		
		if(id.replace(/ /g,"")==""){
			alert("중복확인할 아이디를 입력해주세요.")
			obj.id.focus();
			return;
		}//end if
		
		obj.submit();
	}
	
	function sendId(id) {
		console.log("id")
		// 현재 창에 입력된 id를 얻어와서 부모 창(opener)에 전달
		// opener.window.document.frm.id.value = document.subFrm.id.value;
		opener.window.document.getElementById("id").value = id;
		// 자식 창을 닫는다.
		self.close();
	} // sendId
</script>
</head>
<%
	//웹 파라미터 받는다
	String id = request.getParameter("id");
	boolean flag = false;
	if(id != null){ //parameter가 존재하면
		//DB에서 ID를 검색한다.
		MemberDAO mDAO = MemberDAO.getInstance();
		try{
			String returnId = mDAO.selectId(id);
			flag =  !"".equals(returnId);
			pageContext.setAttribute("flag", flag);
		}catch(SQLException se){
			se.printStackTrace();
		}
	}//end if
%>
<body>

<div id = "idWrap">
    <div id = "background">
        <div id = "inputWrap">
        <form name = "subFrm">
        <!-- web browser에서 키입력이 가능한 HTML Form Control이 하나인경우
        엔터를 치면 자동으로 submit이 된다 (자바스크립트에서 유효성 검증을 실패하더라도 submit이된다
        이것을 막기위해서 키입력이 가능한 html form control을 하나더 정의하고 숨기면 
        웹브라우저는 키입력이 가능한 폼컨트롤이 두개라고 판단하여 엔터키가 눌려도 submit을 하지않는다
         -->
            <input type = "text" name = "id" value = "${param.id}" class="inputTxt inputIdtype" id="id">
            <input type="text" style="display:none"/>
            <input type = "button" id = "btn" value = "중복검사" class = "btn btn-success btn-sm">
        </form>
        </div>
        <div id="dupResult">
        <c:if test="${not empty param.id}">
        입력하신 [<strong><c:out value="${param.id }"/></strong>]는 
    		<c:choose>
    			<c:when test="${pageScope.flag}">
    			사용불가합니다
    			</c:when>
    			<c:otherwise>
    			사용가능합니다 <a href="#void" onclick="sendId('${param.id}')">요청</a>
    			</c:otherwise>
    		</c:choose>
        </c:if>
        </div>
    </div>
</div>
</body>
</html>