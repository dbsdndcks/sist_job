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
	<input type="hidden" name="link" value="day0531/procedure_insert"/>
	<h2>Procedure 사원정보 추가</h2>
	<label>사원번호</label>
	<input type="text" name="empno"><br>
	<label>사원명</label>
	<input type="text" name="ename"><br>
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
	<input type="submit" value="프로시저를 사용한 추가" class="btn btn-success btn-sm"/>
	
</form>
<div>
<c:if test="${not empty param.empno }">
<c:out value="${param.empno}"/>사원정보가<br>

<c:catch var="e">
<jsp:useBean id="eVO" class="kr.co.sist.vo.EmployeeVO" scope="page"/>
<jsp:setProperty property="*" name="eVO"/>
<%
ExamMapper7DAO em7DAO=ExamMapper7DAO.getInstance();
em7DAO.procedureInsert(eVO); //추가될 값은 getter가 호출, 반환값은 setter가 호출된다

pageContext.setAttribute("cnt", eVO.getCnt());
pageContext.setAttribute("errMsg", eVO.getErrMsg());

%>
<c:choose>
<c:when test="${cnt eq 0}">
사원정보가 추가되지 않았습니다 <br><c:out value="${errMsg}"/>
</c:when>
<c:otherwise>
사원정보가 추가되었습니다. <br>
<c:out value="${param.empno }"/>번 사원정보가 추가되었습니다
<ul>
<li>사원명 : <strong><c:out value="${param.ename }"/></strong></li>
<li>연봉 : <strong><c:out value="${param.sal }"/></strong></li>
<li>직무 : <strong><c:out value="${param.job }"/></strong></li>
</ul>
</c:otherwise>
</c:choose>

</c:catch>
<c:if test="${not empty e}">
문제 발생
</c:if>
</c:if>
</div>
