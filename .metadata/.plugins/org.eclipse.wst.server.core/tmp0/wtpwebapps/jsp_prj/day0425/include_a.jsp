<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="common_external.jsp"/>
<style type = "text/css">

</style>
<script type = "text/javascript">
    $(function() {
		
    }); // ready
</script>
</head>
<body>
<div>
외부 JSP
<div>

<jsp:include page="include_b.jsp"/>
내부 JSP
</div>
</div>

</body>
</html>