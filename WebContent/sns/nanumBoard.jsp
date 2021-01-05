<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
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
	.pg-center { 
    display: flex;
    flex-direction: row;
    flex-wrap: nowrap;
    justify-content: flex-start;
	}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container">
  <h2 class="title">나눔 게시판</h2>          
  <table class="table table-hover">
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
				</div>
				<div class="col-md-4">
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
								<div class="button">
								<button type="button" class="btn btn-outline-secondary" onclick="location.href='nanumBoardInsert.jsp'">
								<span class="glyphicon glyphicon-pencil"></span>
								 글쓰기
								</button>
						    	</div>	
						</div>
						<div class="col-md-2">
						</div>
					</div>
				</div>
			</div>
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
</div>
	<% 
	
	%>
</body>
</html>