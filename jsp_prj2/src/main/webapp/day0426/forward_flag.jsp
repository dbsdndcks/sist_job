<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "" %>


<%request.setCharacterEncoding("UTF-8"); %>
<%
String serverName = request.getServerName();

String url="kor.jsp";
String language="한국어";

if(!"localhost".equals(serverName)){
	url="eng.jsp";
	language="english";
}
%>
<%-- 
<jsp:forward page="<%= url %>"/> --%>
<!-- 이전페이지의 웹 파라미터와 JSP의 변수를 파라미터로 만들어서 전송 -->
<jsp:forward page="<%= url %>">
    <jsp:param name="lang" value="<%= language %>"/>
</jsp:forward>