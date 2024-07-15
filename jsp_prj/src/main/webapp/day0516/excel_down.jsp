<%@ page language="java" contentType="application/vnd.ms-excel; charset=UTF-8"
    pageEncoding="UTF-8"
    info="엑셀로 다운로드 하기"%>
<%
response.setHeader("Content-Disposition", "attachment;fileName=download.xslx");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,th,td{border: 1px solid #333}
</style>


</head>
<body>
<table border="1">
<tr>
	<th>번호</th>
	<th>이름</th>
	<th>이메일</th>
</tr>
<tr>
	<td style="width: 100px; background-color: #B4CFBO">번호</td>
	<td style="width: 150px; background-color: #B4CFBO">이름</td>
	<td style="width: 300px; background-color: #B4CFBO">이메일</td>
</tr>
<tr>
	<td>1</td>
	<td>테스트</td>
	<td>test@test.com</td>
</tr>
<tr>
	<td>2</td>
	<td>테스트2</td>
	<td>test@test.com</td>
</tr>
<tr>
	<td>3</td>
	<td>테스트3</td>
	<td>test@test.com</td>
</tr>
</table>
</body>
</html>