<%@page import="kr.co.sist.util.cipher.DataEncrypt"%>
<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.user.member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "회원가입 폼에서 입력된 값을 받는 jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "icon" href = "http://192.168.10.232//common/favicon.ico">
<!--bootstrap ����-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap ��-->
<!--sist css ����-->
<link rel="stylesheet" href="http://192.168.10.231//common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.231//common/css/board.css" type="text/css" media="all" />
<!--sist css ��-->
<!--jQuery CDN ����-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN ��-->
<style type = "text/css">
	#success{margin: 0px auto; width: 597px; height: 508px; background: #ffffff url('http://192.168.10.231//member/images/member_success_bg.png')}
	#result{position:absolute; top:110px; left: 110px;}
</style>
<script type = "text/javascript">
    $(function() {

    }); // ready
</script>
</head>
<body>
<div>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="wmVO" class="kr.co.sist.user.member.WebMemberVO" scope="page"/>
<jsp:setProperty property="*" name="wmVO"/>

<c:catch var="e">
<%
//입력값에 대한 전처리,유효성검증
wmVO.setEmail(wmVO.getEmail1()+wmVO.getEmail2());
wmVO.setIp(request.getRemoteAddr());

//암호화 복호화
//정보의 중요도
//일방향 HASH
wmVO.setPassword(DataEncrypt.messageDigest("MD5", wmVO.getPassword()));
//복호화 가능한 암호화 (이름,전번,이메일)
String key ="DMF1ucDxtqgxw5niaXcmYQ==";

DataEncrypt de = new DataEncrypt(key);
wmVO.setName(de.encryption(wmVO.getName()));
wmVO.setCell(de.encryption(wmVO.getCell()));
wmVO.setEmail(de.encryption(wmVO.getEmail()));

//DB TABLE 추가
MemberDAO mDAO = MemberDAO.getInstance();

try{
	String existingId = mDAO.selectId(wmVO.getId());
	if(existingId != null){
	%>
		입력하신 아이디는 이미사용중이다.	
	<% 	
	}else{
	mDAO.insertWebMember(wmVO);		
	}
	%>
	<div id="success">
		<div id="result">
		<h2>회원가입 ㄳㄳ</h2>
		<strong>${param.name }</strong>님의 회원가입을 축하드립니다.<br/>
		입력하신정보는 아래와 같습니다.
		<ul>
			<il><strong>아이디 : </strong><c:out value="${param.id}"/></il>
			<il><strong>전화번호 : </strong><c:out value="${param.cell}"/></il>
			<il><strong>이메일 : </strong><c:out value="${param.email1}@${param.email2}"/></il>
			<il><strong>성별 : </strong><c:out value="${param.gender eq '1'?'남자':'여자'}"/></il>
			<il><strong>주소 : </strong>
				<c:out value="${param.zipcode}"/><br>
				<c:out value="${param.addr0}"/><br>
				<c:out value="${param.addr1}"/><br>		
			</il>
			
		</ul>
		</div>
	</div>
	
	<%
}catch(SQLException se){
	se.printStackTrace();
	%>
	아따매 오류났는교 콘솔로그 잘보라구
<% }
%>
</c:catch>
<c:if test="${not empty e }">

</c:if>

</div>
</body>
</html>