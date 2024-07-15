<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="day0531.ExamMapper7DAO"%>
<%@page import="day0530.ExamMapper6DAO"%>
<%@page import="kr.co.sist.domain.CarDomain"%>
<%@page import="day0529.ExamMapper5Service"%>
<%@page import="kr.co.sist.domain.JoinDomain"%>
<%@page import="day0529.ExamMapper5DAO"%>
<%@page import="kr.co.sist.domain.EmpDomain"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="$사용 조회"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<form name="frm" action="index.jsp">
	<input type="hidden" name="link" value="day0531/set"/>
	<h2>사원정보 변경</h2>
	<label>사원번호</label>
	<input type="text" name="empno" value="7654"><br>
	<label>사원명</label>
	<input type="text" name="ename" value="MARTIN"><br>
	<label>연봉</label>
	<input type="text" name="sal"><br>
	<label>직무</label>
	<%  String empno =request.getParameter("empno"); 
		String[] jobs = "SALESMAN,MANAGER,CLERK,PRESIDENT".split(",");
		pageContext.setAttribute("jobs", jobs);
		%>
	<select name="job">
	<c:forEach var="job" items="${jobs}">
	<option value="${job}"><c:out value="${job}"/></option>
	</c:forEach>
	</select>	
	<input type="submit" value="변경" class="btn btn-success btn-sm"/>
	
</form>
<div>
<c:if test="${not empty param.empno }">
<c:out value="${param.empno}"/>사원정보가<br>

<c:catch var="e">
<jsp:useBean id="ceVO" class="kr.co.sist.vo.CpEmpVO" scope="page"/>
<jsp:setProperty property="*" name="ceVO"/>
<%
ExamMapper7DAO em7DAO=ExamMapper7DAO.getInstance();
int cnt = em7DAO.dynamicUpdate(ceVO);

pageContext.setAttribute("cnt", cnt);

%>
<c:choose>
<c:when test="${cnt eq 0}">
변경되지않았음
</c:when>
<c:otherwise>
변경되었음

</c:otherwise>
</c:choose>

</c:catch>
<c:if test="${not empty e}">
문제 발생
</c:if>
</c:if>
</div>
