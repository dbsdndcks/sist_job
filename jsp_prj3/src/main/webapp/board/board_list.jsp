<%@page import="kr.co.sist.user.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.user.board.BoardDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
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
	#wrap{width: 1462px; height: 794px; margin: 0px auto;}
	#header{height: 100px; background: #ffffff url('http://192.168.10.231//common/images/header.png')}
	.num{width: 80px}
	.title{width: 350px}
	.id{width: 120px}
	.date{width:150px}
	.cnt{width: 100px}
</style>

<script type="text/javascript">
	$(function(){
		
	
	}); //ready
</script>
</head>
<body>
<div id="wrap">
<div id="header"></div>
<div id="content">
<jsp:useBean id="sVO" class="kr.co.sist.user.board.SearchVO" scope="page"/>
<jsp:setProperty property="*" name="sVO"/>
<%
try{
	BoardDAO bDAO = BoardDAO.getInstance();
	
	//1.총 레코드의 수 얻기
	int totalCount = bDAO.selectTotalCount(sVO);
	//2.한 화면에 보여줄 게시물의 수
	int pageScale = 10;
	//3. 총 페이지수
	/*
	int totalPage = totalCount/pageScale;
	if(totalCount % pageScale != 0){
		totalPage++;
	}
	*/
	int totalPage =(int)Math.ceil((double)totalCount/pageScale);
	//4. 게시물의 시작 번호
	String tempPage = sVO.getCurrentPage();
	int currentPage = 1;
	if(tempPage != null){
		try{
		currentPage = Integer.parseInt(tempPage);			
		}catch(NumberFormatException nfe){
			
		}
	}//end if	
	int startNum = currentPage * pageScale - pageScale+1;
	
	//5.끝번호
	int endNum = startNum + pageScale - 1;
	
	//6.
	sVO.setStartNum(startNum);
	sVO.setEndNum(endNum);
	
	List<BoardVO> list = bDAO.selectBoard(sVO);
	System.out.println( "------"+list.size());
	pageContext.setAttribute("list", list);
	
	%>
	총 레코드의 수 : <%=totalCount %>건<br/>
	한 화면에 보여줄 게시물의 수 : <%=pageScale %> 건 <br/>
	총 페이지 수 : <%=totalPage %> 건 <br/>
	클릭한 페이지 : <%=tempPage %>/<%=currentPage %>번 <br/>
	시작번호 : <%=startNum %> 번 <br/>
	끝번호 : <%=endNum %> 번 <br/>
	
	<div>
	<table class="table">
		<thead>
		<tr>
		<th class="num">번호</th>
		<th class="title">제목</th>
		<th class="id">작성자</th>
		<th class="date">작성일</th>
		<th class="cnt">조회수</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="bVO" items="${ list }" varStatus="i">
		<tr>
		<td><c:out value="${bVO.rnum}"/></td>
		<td><c:out value="${bVO.title }"/></td>
		<td><c:out value="${bVO.id }"/></td>
		<td><c:out value="${bVO.input_date }"/></td>
		<td><c:out value="${bVO.cnt }"/></td>
		</tr>
		
		</c:forEach>
		</tbody>
	</table>
	</div>
	<div>
	<%for(int i=1 ; i<totalPage ; i++){%>
		[<a href="board_list.jsp?currentPage=<%= i %>"><%=i %></a>]
	<%} %>
	</div>
	<%	
	
}catch(SQLException se){
	se.printStackTrace();
	out.print("ㅈㅅㅈㅅㅈㅅㅈㅅㅈㅅ");
}
%>
</div>
</div>
</body>

</html>