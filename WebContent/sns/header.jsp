<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/bootstrap_common.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<!-- 헤더 -->
<%@include file="./modal/logInModal.jsp" %>
<%@include file="./modal/signUpModal.jsp" %>
        <div class="navbar navbar-expand-sm navbar-light bg-light">
            	<div class="col-sm-3">
		        	<a class="navbar-brand" href="mainPage.jsp"><i class="fas fa-cat fa-2x"></i>메인화면</a>
		       		<a class="navbar-brand" href="subPage.jsp"><i class="fas fa-external-link-alt fa-2x"></i> 서브화면</a>
		       	</div>
            	<div class="col-sm-6">
            		<nav class="navbar navbar-light bg-light">
					  <form class="form-inline">
					    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
					    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
					  </form>
					</nav>	
				</div>
				<div class="col-sm-3">
            		<a class="navbar-brand" href="javascript:logInModal()" data-toggle="modal" data-target="#logInModal"><i class="fas fa-user-circle fa-2x"></i></a>
		       		<a class="navbar-brand" href="javascript:signUpModal()" data-toggle="modal" data-target="#signUpModal"><i class="fas fa-user-cog fa-2x"></i></a>
		       		<a class="navbar-brand" href="#"><i class="fas fa-heart fa-2x"></i></a>
		       		<a class="navbar-brand" href="#"><i class="fas fa-paper-plane fa-2x"></i></a>
            	</div>
            </div>
            <!-- 헤더 -->
            

</body>
</html>