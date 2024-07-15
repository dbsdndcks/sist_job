<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.sql.SQLException"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="kr.co.sist.user.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.user.board.BoardDAO"%>
<%@page import="kr.co.sist.user.board.SearchVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="복합형태 제이슨"%>

<%

//1. 데이터와 부자겆ㄱ인 정보를 저장할 JSONObject 생성
JSONObject jsonObj = new JSONObject();
//2.부가적인 정보를 추가
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
jsonObj.put("pubDate", sdf.format(new Date()));
jsonObj.put("producer","박시현");

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
JSONArray jsonArr = new JSONArray();
sVO.setStartNum(1);
sVO.setEndNum(10);
try{
	List<BoardVO> list = bDAO.selectBoard(sVO);
	
	JSONObject jsonTemp = null;
	for(BoardVO bVO : list){
		//jsonobject생성
		jsonTemp = new JSONObject();
		//jsonobject값 할당
		jsonTemp.put("num",bVO.getNum());
		jsonTemp.put("title",bVO.getTitle());
		jsonTemp.put("id",bVO.getId());
		jsonTemp.put("cnt",bVO.getCnt());
		
		jsonArr.add(jsonTemp);
	}
	jsonObj.put("result","SUCCESS");
	jsonObj.put("dataSize",list.size());
	
}catch(SQLException se){
	se.printStackTrace();
	jsonObj.put("result","FAIL");
}
//4. 문자열로 받기
String jsonStr = jsonArr.toJSONString();
%>
<%=jsonStr%>