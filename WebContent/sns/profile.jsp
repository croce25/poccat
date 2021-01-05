<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/profile.css">
<script type="text/javascript">
function followList(){
	$("#followModal").modal('show');
}
</script>
</head>
<body>
<%@ include file="header.jsp" %>
<%@include file="./modal/postingModal.jsp" %>
<div class="topMiddle"></div>
        
                          
                         <div class="hori_cont">
                <div class="profile_wrap">
                    <div class="profile_img">
                        <img src="../img/1.jpg" alt="고양이">
                    </div>
                </div>

                <div class="detail">
                    <div class="top">
                        <div class="user_name">고양이</div>
                        <button class="btn" class="profile_edit">팔로우</button>
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
                            <span><a href="javascript:followList()" data-toggle="modal" data-target="#followModal">팔로워</a></span>                       
                            3
                        </li>
                    </ul>
                    
                </div>
            </div>
            

            <div class="photoList">
            <div class="row">
                <div class="pic col-sm-4 col-md-4 ">
                    <a href="javascript:postingModal()" data-toggle="modal" data-target="#postingModal">><img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"><img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"> <img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"> <img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"> <img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"> <img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"> <img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"> <img src="../img/1.jpg" alt=""></a>
                </div>
                <div class="pic col-sm-4 col-md-4">
                    <a href="#"> <img src="../img/1.jpg" alt=""></a>
                </div>
                </div>
            </div>
            
            
              <div class="modal fade" id="followModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
    <div class="modal-header">
       팔로우목록  <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
     
      </div>
      <div class="modal-body">
        <div class="followFriend">
    		<article class="story">
                    <div class="scroll_inner">
                        <div class="thumb_user">
                            <div class="profile_thumb">
                                <img src="../img/1.jpg" alt="프로필사진">
                            </div>
                            <div class="detail">
                                <div class="id">고양이1</div>
                                <div class="time">1시간 전</div>
                            </div>
                        </div>
                        <div class="thumb_user">
                            <div class="profile_thumb">
                                <img src="../img/1.jpg" alt="프로필사진">
                            </div>
                            <div class="detail">
                                <div class="id">고양이2</div>
                                <div class="time">1시간 전</div>
                            </div>
                        </div>
                        <div class="thumb_user">
                            <div class="profile_thumb">
                                <img src="../img/1.jpg" alt="프로필사진">
                            </div>
                            <div class="detail">
                                <div class="id">고양이3</div>
                                <div class="time">1시간 전</div>
                            </div>
                        </div>
                        <div class="thumb_user">
                            <div class="profile_thumb">
                                <img src="../img/1.jpg" alt="프로필사진">
                            </div>
                            <div class="detail">
                                <div class="id">고양이4</div>
                                <div class="time">1시간 전</div>
                            </div>
                        </div>
                        <div class="thumb_user">
                            <div class="profile_thumb">
                                <img src="../img/1.jpg" alt="프로필사진">
                            </div>
                            <div class="detail">
                                <div class="id">고양이5</div>
                                <div class="time">1시간 전</div>
                            </div>
                        </div>
                    </div>
                </article>
            </div>
      </div>
    </div>
  </div>
</div>
            
            
</body>
</html>