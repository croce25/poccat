<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.container {
	margin-top:50px;
	}
	.table{
			text-align: center;
			border:1px;
			font-size:15px;
	}
	.title{
			margin-bottom:10px;
			text-align:center;	
			font-size:30px;	
	}
	#comment-layout{
			padding-top:30px;
			padding-bottom:30px;
	}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container-fluid">
	<div class="container">
		<div class="col-md-12">
			<div class="page-header">
			<h2 class="">게시판 글 쓰기</h2>
		</div>
			<div class="page-body">
				<div class="col-md-12">
					<textarea class="form-control" rows="25" name="text-box" placeholder="내용을 적어주세요."></textarea>
				</div>
			</div>
			<div class="page-footer">
				<div class="col-md-12">
					<div class="row">
						<div class="col-md-12" id="comment-layout">
								    <div class="form-group">
      								<input type="text" class="form-control-plaintext" placeholder="태그를 넣어주세요." name="comment-box">
   									</div>
						</div>
						
					</div>
				</div>
			</div>
							<div class="row">
								<div class="col-md-2">
								</div>
								<div class="col-md-2">
								</div>
								<div class="col-md-2">
								</div>
								<div class="col-md-2">
								</div>
								<div class="col-md-2">
								</div>
								<div class="col-md-1">
									<div class="button">
									<button type="button" class="btn btn-outline-secondary" onclick="location.href='nanumBoard.jsp'">
									 등록
									</button>
							    	</div>	
								</div>
									<div class="button">
									<button type="button" class="btn btn-outline-secondary" onclick="location.href='#top-page'">
									<span class="glyphicon glyphicon-chevron-up"></span>
									TOP
									</button>
								    </div>	
							</div>
					</div>
				</div>
			</div>
</body>
</html>