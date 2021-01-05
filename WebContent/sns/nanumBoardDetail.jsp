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
										<button type="button" class="btn btn-outline-secondary" onclick="location.href='#'">
										<span class="glyphicon glyphicon-chevron-left"></span>
										 이전 글
										</button>
								    	</div>	
								</div>
								<div class="col-md-1">
										<div class="button">
										<button type="button" class="btn btn-outline-secondary" onclick="location.href='#'">
										<span class="glyphicon glyphicon-chevron-right"></span>
										다음 글
										</button>
										</div>	
								</div>
							</div>
			<div class="page-header">
			<h2 class="">글 제목</h2>
		</div>
			<div class="page-body">
				<div class="col-md-12">
					<textarea class="form-control" rows="25" name="text-box"></textarea>
				</div>
			</div>
			<div class="page-footer">
				<div class="col-md-12 pd-x1">
					<div class="row">
						<div class="col-md-12" id="comment-layout">
								    <div class="form-group">
      								<input type="text" class="form-control-plaintext" placeholder="댓글을 적어주세요." name="comment-box">
   									</div>
							<div class="row">
								<div class="col-md-6">
								</div>
								<div class="col-md-6">
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
										<div class="col-md-2">
											 <a href="#" class="btn btn-sm btn-link" type="button">댓글 쓰기</a>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
					<table class="table table-sm">
				    <thead>
				      <tr>
				        <th id="date">작성일</th>
				        <th id="title">제목</th>
				        <th id="user">작성자</th>
				        <th id="views">조회수</th>
				      </tr>
				    </thead>
				    <tbody>
				      <tr>
				        <td id="date">2020-20-20</td>
				        <td id="title">제목제목제목제목제목제목제목제목제목제목제목제목제목제목제목제목제목제목</td>
				        <td id="user">작성자작성자작성자</td>
				        <td id="views">355</td>
				      </tr>
				      <tr>
				        <td id="date">1</td>
				        <td id="title">1</td>
				        <td id="user">1</td>
				        <td id="views">1</td>
				      </tr>
				    </tbody>
					</table>
					<div class="row">
						<div class="col-md-4">
						</div>
						<div class="col-md-4">
							<nav class="pagination">
								<ul class="pagination">
									<li class="page-item disabled">
										<a class="page-link" href="#">이전 페이지</a>
									</li>
									<li class="page-item">
										<a class="page-link" href="#">1</a>
									</li>
									<li class="page-item">
										<a class="page-link" href="#">2</a>
									</li>
									<li class="page-item">
										<a class="page-link" href="#">3</a>
									</li>
									<li class="page-item">
										<a class="page-link" href="#">4</a>
									</li>
									<li class="page-item">
										<a class="page-link" href="#">5</a>
									</li>
									<li class="page-item">
										<a class="page-link" href="#">다음 페이지</a>
									</li>
								</ul>
							</nav>
						</div>
						<div class="col-md-4">
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
										 목록
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