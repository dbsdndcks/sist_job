<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="application/octet-stream; charset=UTF-8"
    pageEncoding="UTF-8"
    info="파일다운로드"%>
<%
	String downloadName = request.getParameter("fileName");
	//2.응답헤더 변경
	//파일명이 한글인 경우 한글파일로 다운로드 되지 않는다. => URL에서 사용할 수 있도록 파일명을 encoding
	response.setHeader("Content-Disposition", "attachment;fileName="+downloadName);
	URLEncoder.encode(downloadName,"UTF-8");
	//3.다운로드할 파일의 정보얻기
	File file = new File("C:/E/dev/workspace//src/main/webapp/upload/"+downloadName);
	
	if(file.exists()){
		FileInputStream fis = null;
		OutputStream os = null;
		try{
		//4.IOStream
			fis = new FileInputStream(file.getAbsoluteFile());
			os = response.getOutputStream();
		//5.파일의 내용을 읽어들여 스트림으로 기록
		byte[] readData = new byte[512];
		int readSize = 0;
		
		while((readSize = fis.read(readData))!= -1){
			os.write(readData,0,readSize);
		}
		//6. 분출
		os.flush();
		//7.출력 스트림을 초기화 : HTML을 출력할 스트림이 File을 출력할 수 있게
		out.clear();
		//8.응답헤더를 다운로드 파일을 가지도록 재설정
		out = pageContext.pushBody();
		
		
		}finally{
			if(fis != null){fis.close();}
			if(os != null){os.close();}
		}
		
	}
%>