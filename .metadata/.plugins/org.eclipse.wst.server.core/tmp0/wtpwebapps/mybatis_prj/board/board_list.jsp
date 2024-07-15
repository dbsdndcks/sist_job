<%@page import="org.apache.ibatis.exceptions.PersistenceException"%>
<%@page import="kr.co.sist.user.board.BoardDomain"%>
<%@page import="kr.co.sist.user.board.BoardUtil"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.user.board.BoardDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "게시판 리스트" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board_list</title>
<link rel = "icon" href = "http://192.168.10.232/jsp_prj/common/favicon.ico">
<!--bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap 끝-->
<!--sist css 시작-->
<link rel="stylesheet" href="http://192.168.10.232/jsp_prj/common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.232/jsp_prj/common/css/board.css" type="text/css" media="all" />
<!--sist css 끝-->
<!--jQuery CDN 시작-->

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN 끝-->
<style type = "text/css">
	#wrap{
		width: 1462px;
		height: 749px;
		margin: 0px auto;
	}
	
	#header{
		width: 1462px;
		height: 75px;
		background: #ffffff url('http://192.168.10.232/jsp_prj/common/images/header.png') no-repeat;
	}
	
	.num{
		width: 80px;
	}

	.title{
		width: 350px;
	}

	.id{
		width: 120px;
	}

	.date{
		width: 150px;
	}

	.cnt{
		width: 100px;
	}
</style>
<script type = "text/javascript">
	$(function() {
		$("#btnSearch").click(function() {
			chkNull();
		}); // click

		$("#btnAllSearch").click(function() {
			location.href="board_list.jsp";
		}); // click
		
		$("#btnWrite").click(function() {
			location.href="board_write_frm.jsp";
		}); // click
		
		$("#keyword").keydown(function(evt){
			if(evt.which == 13) {
				chkNull();
			} // end if
		}); // keydown
	}); // ready
	
	function chkNull() {
		if($("#keyword").val().trim() != "") {
			$("#frmBoard").submit();
		} // end if
	} // chkNull
</script>
</head>
<body>
<div id = "wrap">
	<div id = "header"></div>
	<div id = "content">
		<%
		request.setCharacterEncoding("UTF-8");
		%>
		<jsp:useBean id="sVO" class="kr.co.sist.user.board.SearchVO" scope="page"/>
		<jsp:setProperty property="*" name="sVO"/>
		<%
		BoardDAO bDAO = BoardDAO.getInstance();
		
		// 1. 총 레코드의 수 얻기
		int totalCount = bDAO.selectTotalCount(sVO);
		
		// 2. 한 화면에 보여줄 게시물의 수
		int pageScale = 10;
		
		// 3. 총 페이지 수
		int totalPage = (int)Math.ceil((double)totalCount / pageScale);
		
		// 4. 게시물의 시작 번호
		String tempPage = sVO.getCurrentPage();
		int currentPage = 1;
		if(tempPage != null) {
			try { 
				currentPage = Integer.parseInt(tempPage);
			} catch (NumberFormatException ne) {
			} // end catch
		} // end if
		
		int startNum = currentPage * pageScale - pageScale + 1;
		
		// 5. 게시물의 끝 번호
		int endNum = startNum + pageScale - 1;
		
		sVO.setStartNum(startNum);
		sVO.setEndNum(endNum);
		
		List<BoardDomain> boards = bDAO.selectBoard(sVO); // 시작번호와 끝번호 사이의 글 조회
		
		pageContext.setAttribute("boards", boards);
		
		pageContext.setAttribute("totalCount", totalCount);
		pageContext.setAttribute("pageScale", pageScale);
		pageContext.setAttribute("currentPage", currentPage);
		%>
			총 레코드의 수 : <%= totalCount %>건<br>
			한 화면에 보여줄 게시물의 수 : <%= pageScale %>건<br>	
			총 페이지 수 : <%= totalPage %>장<br>
			클릭한 페이지 : <%= tempPage %>/<%= currentPage %>장<br>
			게시물의 시작 번호 : <%= startNum %>번<br>
			게시물의 끝 번호 : <%= endNum %>번<br>

			<div style="height: 500px;">
			<input type="button" value="전체글" class="btn btn-primary btn-sm" id="btnAllSearch">
			<input type="button" value="글쓰기" class="btn btn-warning btn-sm" id="btnWrite">
			<table class = "table">
				<thead>
				<tr>
				<th class = "num">번호</th>
				<th class = "title">제목</th>
				<th class = "id">작성자</th>
				<th class = "date">작성일</th>
				<th class = "cnt">조회수</th>
				</tr>
				</thead>
				
				<tbody>
				<c:forEach var="bVO" items="${ boards }" varStatus="i">
				<tr>
				<td><c:out value="${ totalCount - (currentPage - 1) * pageScale - i.index }"/></td>
				<td><a href="board_read_frm.jsp?seq=${ bVO.num }&currentPage=${ empty param.currentPage ?1:param.currentPage}"><c:out value="${ bVO.title }"/></a></td>
				<td><c:out value="${ bVO.id }"/></td>
				<td><c:out value="${ bVO.input_date }"/></td>
				<td><c:out value="${ bVO.cnt }"/></td>
				</tr>
				</c:forEach>
				</tbody>
			</table>
			</div>
			
			<div style="text-align: center;">
			<form action="board_list.jsp" name="frmBoard" id="frmBoard">
				<select name="field" id="field">
					<option value = "0"${ param.field eq 0?" selected = 'selected'":"" }>제목</option>
					<option value = "1"${ param.field eq 1?" selected = 'selected'":"" }>내용</option>
					<option value = "2"${ param.field eq 2?" selected = 'selected'":"" }>작성자</option>
				</select>			
				<input type="text" name="keyword" id="keyword" value="${ param.keyword }" style="width: 230px;">
				<!-- 폼컨트롤이 하나일 때 웹브라우저는 엔터하면 바로 submit하게 되므로 막기 위해 display none 폼컨트롤을 하나 더 생성해 막아준다. -->
				<input type="text" style="display: none;">
				<input type="button" value="검색" class="btn btn-info btn-sm" id="btnSearch">
			</form>
			</div>
			
			<div style="text-align: center;">
			<%
			String paramLink = "";
			%>
			<c:if test="${ not empty param.keyword }">
				<%
				paramLink = "&field="+ request.getParameter("field") + "&keyword=" + request.getParameter("keyword");
				%>
				<c:set var="link" value="&field=${ param.field }&keyword=${ param.keyword }"/>
			</c:if>
			<%-- <% for(int i = 1; i <= totalPage; i++) { %>
				[ <a href = "board_list.jsp?currentPage=<%= i %>${ link }"><%= i %></a> ]
			<% } // end for %> --%>
			
			<%
			String pageNation = BoardUtil.getInstance().pageNation("board_list.jsp", paramLink, totalPage, currentPage);
			%>
			<br>
			<%-- 시작번호: <%= startPage %><br>
			끝번호: <%= endPage %><br> --%>
			<%= pageNation %>
			</div>
	</div>	
</div>
</body>
</html>