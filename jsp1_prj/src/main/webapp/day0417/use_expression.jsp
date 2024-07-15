<%@page import="day0417.DataVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info="표현식의사용"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://192.168.10.231//common/favicon.ico">
<!-- bootstrap ���� -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!-- bootstrap �� -->
<!--sist��Ÿ�Ͻ�Ʈ ����-->
<link rel="stylesheet" href="http://192.168.10.231//common/css/main.css" type="text/css" media="all" />
<link rel="stylesheet" href="http://192.168.10.231//common/css/board.css" type="text/css" media="all" />
<!--sist��Ÿ�Ͻ�Ʈ ��-->
<!-- JQUERY CDN ����-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--JQUERY CDN ��-->
<style type="text/css">
	td{border:1px solid #333;}
</style>

<script type="text/javascript">
	$(function(){
		$("#select").change(function(){
			var sel = $("#select")[0];
			
			if(sel.selectedIndex != 0){
				if(confirm(sel.value+"로 이동할건가요")){
					location.href= sel.value;
				}
			}
			
		});
		

	}); //ready
	
	function print(i,j,result){ //웹서버에서 모든일하고 결과출력
		alert(i + "x " + j +" = " + result)
	}
	function print2(i,j){ //웹서버에서 연산만
		alert(i + "x " + j +" = " (i*j))
	}
	
</script>
</head>
<body>

	<%
	for(int i=1 ; i < 9 ; i++){
	%>
	<table>
		<tr>
			<td id="num"><input type="button" value="2 x <%=i%>"
				class="btn btn-success" name="btn" onClick="print(<%=2*i%>)">
				<input type="button" value="2 x <%=i%>" class="btn btn-success"
				name="btn" onClick="print2(<%=2*i%>)"></td>
		</tr>
	</table>
	<%
	}	
	%>


	<%
	DataVO[] data = new DataVO[5];
 	data[0] = new DataVO("김동섭","http://danawa.com","danawa.png");
	data[1] = new DataVO("진수현","http://youtube.com","youtube.png");
	data[2] = new DataVO("윤웅찬","http://google.com","google.png");
	data[3] = new DataVO("홍성강","http://cupang.com","cupang.png");
	data[4] = new DataVO("김병년","http://sist.com","sist.png");			
	%>
	<select id="select">
		<option value="<%=data[0].getUrl()%>"><%= data[0].getName() %></option>
		<option value="<%=data[0].getUrl()%>"><%= data[1].getName() %></option>
		<option value="<%=data[0].getUrl()%>"><%= data[2].getName() %></option>
		<option value="<%=data[0].getUrl()%>"><%= data[3].getName() %></option>
		<option value="<%=data[0].getUrl()%>"><%= data[4].getName() %></option>
	</select>
	<br>
	<table>
		<tr>
		<thead>
			<td>이름</td>
			<td>이미지</td>
		</thead>
		</tr>
		<%
		for (int j = 0; j < data.length; j++) {
		%>
		<tr>
		<tbody>
			<td><%=data[j].getName()%></td>
			<td><a href="<%= data[j].getUrl()%>"><img src="images/<%=data[j].getImg()%>"></a></td>
		</tbody>
		</tr>
		<%
		}
		%>
	</table>
	<br>
	
	<table>
	<%for(int k=2 ; k < 10 ; k++){
	%>
	<tr>
		<%for(int t=1 ; t < 10 ; t++){	
		%>
		<td style="width:90px; height:80px;"><%=k%> X <%=t %> = <%=t*k %> </td>
	<%
		}
	 %>		
	</tr>
	<%
	}
	 %>
	</table>


</body>

</html>