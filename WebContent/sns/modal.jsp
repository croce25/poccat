<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 포스트 모달 -->
        <div class="modal fade" id="posting_modal" tabindex="-1" role="dialog" aria-labelledby="posting_modalLabel" aria-hidden="true">
          <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
              <div class="modal-body">
                  <textarea class="form-control" aria-label="With textarea"></textarea>
                  <!--<input class="form-control mr-sm-2 custom-search-modal" type="search" placeholder="" aria-label="Search">-->
                  <i class="fas fa-camera-retro p-1 border rounded mt-1" ></i>
                  <i class="fas fa-map-marker-alt p-1 border rounded mt-1" ></i>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-success btn-sm">등록</button>
                <button type="button" class="btn btn-secondary btn-sm" data-dismiss="modal">취소</button>
              </div>
            </div>
          </div>
        </div>
<!-- 디테일 모달 -->
        <div class="modal fade" id="detail_modal" tabindex="-1" role="dialog" aria-labelledby="posting_modalLabel" aria-hidden="true">
          <div class="modal-dialog modal-lg" role="document">
            <div class="modal-content">
              <div class="modal-body">
              <div class="row">
				<div class="col-xs-6">
					<div class="container">
					  <br>
					  <div id="myCarousel" class="carousel slide" data-ride="carousel">
					    <!-- Indicators -->
					    <ol class="carousel-indicators">
					      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					      <li data-target="#myCarousel" data-slide-to="1"></li>
					      <li data-target="#myCarousel" data-slide-to="2"></li>
					    </ol>
					
					    <!-- Wrapper for slides -->
					    <div class="carousel-inner" role="listbox">
					
					      <div class="item active">
					        <img src="./img/1.jpg" alt="cat1">
					        <div class="carousel-caption">
					        </div>
					      </div>
					    
					      <div class="item">
					        <img src="./img/3.jpg" alt="cat3">
					        <div class="carousel-caption">
					        </div>
					      </div>
					
					      <div class="item">
					        <img src="./img/5.jpg" alt="cat5">
					        <div class="carousel-caption">
					        </div>
					      </div>
					  
					    </div>
					
					    <!-- Left and right controls -->
					    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
					      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					      <span class="sr-only">이전</span>
					    </a>
					    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
					      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					      <span class="sr-only">다음</span>
					    </a>
					  </div>
					</div>
				</div>
				<div class="col-xs-6">
						<div>
							<a class="navbar-brand" href="#"><i class="fas fa-phone-square"></i> 등록</a>
							<a class="navbar-brand" href="#"><i class="fas fa-thumbs-up"></i> 추천</a>
							<a class="navbar-brand" href="#"><i class="fas fa-handshake"></i> 팔로우</a>
						</div>
					<hr class="my-5">
						<div>
							<textarea class="form-control" rows="10" id="chating"></textarea>
						</div>
					<hr class="my-15">
						<div>
		       				<a class="navbar-brand" href="#"><i class="far fa-heart"></i></a>
		       				<a class="navbar-brand" href="#"><i class="far fa-comment"></i></a>
		       				<a class="navbar-brand" href="#"><i class="far fa-paper-plane"></i></a>
		       				<a class="navbar-brand" href="#"><i class="far fa-address-book" style="align:right"></i></a>
						</div>
					<hr class="my-5">
						<div class="form-group">
							<div class="col-md-8">
							<input id="ExpirationDate" name="ExpirationDate" type="text" placeholder="댓글" class="form-control input-md" required="">
							</div>
							<div class="col-md-4">
							<button>게시</button>
							</div>
						</div>
					</div>
				</div>
              </div>
              </div>
            </div>
          </div>
<!-- 로그인 모달 -->

<!-- 회원가입 모달 -->
	  
</body>
</html>