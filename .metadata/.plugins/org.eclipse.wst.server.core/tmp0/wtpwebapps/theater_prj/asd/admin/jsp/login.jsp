<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    info = "명화관 관리자 로그인" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>명화관 관리자 페이지</title>
<link rel = "icon" href = "http://localhost/theater_prj/asd/favicon.ico">
<!--bootstrap 시작-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<!--bootstrap 끝-->
<!--jQuery CDN 시작-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!--jQuery CDN 끝-->
<!-- Custom fonts for this template-->
<link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
    rel="stylesheet">
<!-- Custom styles for this template-->
<link href="../css/sb-admin-2.css" rel="stylesheet">
<!--외부CSS끝-->
<style type = "text/css">
	
</style>
<script type = "text/javascript">
$(function() {
    $("#inputId").focus();
    $("#inputId").on('keypress', function(e) {
        if (e.which === 13) {
            e.preventDefault(); 
            let id = $("#inputId").val();
            if (id === "") {
                alert("아이디를 입력해주세요.");
            } else {
                $("#inputPassword").focus();
            }
        }
    });

    $("#inputPassword").on('keypress', function(e) {
        if (e.which === 13) { 
            e.preventDefault(); 
            let pw = $("#inputPassword").val();
            if (pw === "") {
                alert("비밀번호를 입력해주세요.");
            } else {
                $("#submit").click();
            }
        }
    });
}); // ready
	
	
	
	function checkNull(){

		
		//alert("클릭되었음")
		let id = $("#inputId").val();
		let pw = $("#inputPassword").val();

		
	    // ID나 비밀번호가 비어 있는지 확인
	    if(id === "" && pw === "") {
	        alert("ID와 비밀번호를 입력해주세요.");
	        return false;
	    } else if(id === "") {
	        alert("ID를 입력해주세요.");
	        $("#inputId").focus();
	        return false; 
	    } else if(pw === "") {
	        alert("비밀번호를 입력해주세요.");
	        $("#inputPassword").focus();
	        
	        return false; 
	    }
		

		}
	
	
	
	
	
	
	
	
</script>







</head>
<body class="bg-gradient-primary" style = "margin-top:200px; background-color:#fff;background-image: linear-gradient(180deg,#fff 10%,#fff 100%);" >
<!-- S 로그인 세션 확인  -->
<!-- prevPage에 값이 있다면 이전페이지 저장 -->
<!-- 저장되어있지 않다면 기본값 dashboard.jsp로 저장 -->
<script type="text/javascript">
<%
String prevPage ="";
String id = (String)session.getAttribute("adminId");




if (request.getParameter("prevPage")==null){
	prevPage="dashboard.jsp";
}else{
	prevPage=request.getParameter("prevPage");
}




if (id != null) {%>

var prevPage = "<%= prevPage %>";

window.location.href = prevPage;

<%}%>


</script>
<!-- E 로그인 세션 확인  -->














    <div class="container">
        <!-- Outer Row -->
        <div class="row justify-content-center">
            <div class="col-xl-10 col-lg-12 col-md-9">
                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-block bg-login-image" style = "margin: auto; padding-left: 120px;">
                            <img src="http://localhost/theater_prj/asd/logo.png">
                            </div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h1 class="h4 text-gray-900 mb-4">Admin Page Login</h1>
                                    </div>
                                    <form class="user" action="loginService.jsp" method="post" onsubmit="return checkNull()">
									    <div class="form-group">
									        <input type="text" class="form-control form-control-user"
									            id="inputId" name="inputId" aria-describedby="emailHelp"
									            placeholder="ID">
									    </div>
									    <div class="form-group">
									        <input type="password" class="form-control form-control-user"
									            id="inputPassword" name="inputPassword"  placeholder="Password">
									    </div>
									    <div>
									    <button type="submit" id="submit" class="btn btn-primary btn-user btn-block">
									        Login
									    </button>
									    </div>
									    <div style="display: flex;">
									    <a href = "../../jsp/index.html" style="font-size: 13px; margin: 0px auto; margin-top: 10px;">영화관홈</a>
									    </div>
									    <input type="hidden" id="prevPage" name="prevPage" required="required"  value=<%= prevPage %> >
									</form>
								</div>
							</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Bootstrap core JavaScript-->
    <script src="../vendor/jquery/jquery.js"></script>
    <script src="../vendor/bootstrap/js/bootstrap.bundle.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="../vendor/jquery-easing/jquery.easing.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="../js/sb-admin-2.min.js"></script>
</body>
</html>