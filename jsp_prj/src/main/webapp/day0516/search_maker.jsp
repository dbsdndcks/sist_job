<%@page import="java.sql.SQLException"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.user.car.CarDAO"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info=""%>
<%
JSONObject jsonObj = new JSONObject();
jsonObj.put("result",false);

String country = request.getParameter("country");

if(country == null){
	country = "국산";
}else{
	if("1".equals(country)){
	country = "국산";
	}else{
		country="수입";
	}
}

CarDAO cDAO = CarDAO.getInstance();
try{
List<String> list =  cDAO.selectMaker(country);
jsonObj.put("result",true);

JSONArray jsonArr = new JSONArray();
JSONObject jsonTemp = null;
for(String maker : list){
	jsonTemp = new JSONObject();
	jsonTemp.put("maker", maker);
	jsonArr.add(jsonTemp);
}//end for
jsonObj.put("data",jsonArr);
jsonObj.put("dataSize",jsonArr.size());

}catch(SQLException se){
	se.printStackTrace();
}//end catch



%><%=jsonObj%>