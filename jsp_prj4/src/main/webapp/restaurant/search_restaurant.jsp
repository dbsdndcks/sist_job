<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.sist.user.restaurant.RestaurantVO"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.SQLException"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="kr.co.sist.user.restaurant.RestaurantDAO"%>
<%@ page language="java" contentType="application/json;charset=UTF-8"
    pageEncoding="UTF-8"
    info="식당조회"%>


<%
RestaurantDAO rDAO = RestaurantDAO.getInstance();
JSONObject jsonObj = new JSONObject();
try{
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEEE");
	 List<RestaurantVO> list = rDAO.selectAllRestaurant();
	 jsonObj.put("resultFlag", true);
     jsonObj.put("dataSize", list.size());
     jsonObj.put("pubDate", sdf.format(new Date()));
	
     JSONArray jsonArr = new JSONArray();
     JSONObject jsonTemp = null;
      
     
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	for(RestaurantVO rVO : list){
    	 jsonTemp = new JSONObject();
    	 
    	 jsonTemp.put("name",rVO.getName());
    	 jsonTemp.put("menu",rVO.getMenu());
    	 jsonTemp.put("lat",rVO.getLat());
    	 jsonTemp.put("lng",rVO.getLng());
    	 jsonTemp.put("date",sdf.format(rVO.getInput_date()));
     		
    	 //값을 가진 jsonobject를 jsonarray에 추가
    	 jsonArr.add(jsonTemp);
    	 
     }
	

     jsonObj.put("data",jsonArr);

}catch(SQLException se){
	jsonObj.put("resultFlag", false);
    se.printStackTrace();
}
%>
<%=jsonObj.toJSONString() %>

