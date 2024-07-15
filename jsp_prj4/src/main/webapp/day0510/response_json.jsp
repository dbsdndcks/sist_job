<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="application/json" 
pageEncoding="UTF-8" info="" trimDirectiveWhitespaces="true" %>
<%
JSONObject jsonObj = new JSONObject();
jsonObj.put("name","윤웅찬");
jsonObj.put("age",20);
jsonObj.put("hobby","농구 - 동네넘버원 가드");
%>
<%= jsonObj.toJSONString()%>
