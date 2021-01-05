<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/myPage.css">
<link rel="stylesheet" href="../css/modal.css">
<script type="text/javascript">
function followList(){
$('#followModal').modal('show');
}
function friendList(){
$('#friendModal').modal('show');
}
</script>
</head>
<body>
<%@ include file="header.jsp" %>
<%@ include file="./modal/friendModal.jsp" %>
<%@ include file="./modal/followModal.jsp" %>

<div class="topMiddle"></div>

                         <div class="hori_cont">
                <div class="profile_wrap">
                    <div class="profile_img">
                        <img src="./img/laputa036.jpg" alt="고양이">
                    </div>
                </div>

                <div class="detail">
                    <div class="top">
                        <div class="user_name">전영문</div>
                        <button class="btn" class="profile_edit">정보</button>
                                               <div class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
    ..
    <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
    <li><a href="#">Action</a></li>
    <li><a href="#">Another action</a></li>
    <li><a href="#">Something else here</a></li>
    <li role="separator" class="divider"></li>
    <li><a href="#">Separated link</a></li>
  </ul>
</div>
                    </div>

                    <ul class="middle">
                        <li>
                            <span>게시물</span>
                            3
                        </li>
                        <li>
                            <span><a href="javascript:followList()" data-toggle="modal" data-target="#followModal">팔로우</a></span>
                            3
                        </li>
                        <li>
                        	<span><a href="javascript:friendList()" data-toggle="modal" data-target="#friendModal">친구</a></span>
                        	5
                        </li>
                    </ul>

                </div>
            </div>

</body>
</html>