<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.user.board.BoardDomain"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.user.board.BoardDAO"%>
<%@page import="kr.co.sist.user.board.SearchVO"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>

<%
// 1. JSONArray 생성 - java.util.List 기반
JSONArray jsonArr = new JSONArray();

//2. JSONObject 생성
JSONObject jsonObj = new JSONObject();
jsonObj.put("name","이명화");
jsonObj.put("age","25");
/*
JSONObject jsonObj2 = new JSONObject();
jsonObj2.put("name","박시현");
jsonObj2.put("age","24");

JSONObject jsonObj3 = new JSONObject();
jsonObj3.put("name","홍성강");
jsonObj3.put("age","33");

JSONObject jsonObj4 = new JSONObject();
jsonObj4.put("name","이예찬");
jsonObj4.put("age","53");

//3. JSONArray 추가
jsonArr.add(jsonObj);
jsonArr.add(jsonObj2);
jsonArr.add(jsonObj3);
jsonArr.add(jsonObj4);
*/
SearchVO sVO = new SearchVO();
BoardDAO bDAO = BoardDAO.getInstance();
sVO.setStartNum(1);
sVO.setEndNum(10);
try{
	List<BoardDomain> list = bDAO.selectBoard(sVO);
	JSONObject jsonTemp = null;
	for(BoardDomain bVO : list){
		//jsonobject생성
		jsonTemp = new JSONObject();
		//jsonobject값 할당
		jsonTemp.put("num",bVO.getNum());
		jsonTemp.put("title",bVO.getTitle());
		jsonTemp.put("id",bVO.getId());
		jsonTemp.put("cnt",bVO.getCnt());
		
		jsonArr.add(jsonTemp);
	}
}catch(SQLException se){
	se.printStackTrace();
}
//4. 문자열로 받기
String jsonStr = jsonArr.toJSONString();
%>
<%=jsonStr%>