<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function logInModal(){
	$("#logInModal").modal('show');
}
</script>
</head>
<body>
	  <div class="modal fade" id="logInModal" role="dialog" aria-labelledby="posting_modalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	        <div class="modal-header" style="padding:35px 50px;">
	          <button type="button" class="close" data-dismiss="modal">&times;</button>
	          <h4><span class="glyphicon glyphicon-lock"></span> 로그인</h4>
	        </div>
	        <div class="modal-body" style="padding:40px 50px;">
	          <form role="form">
	            <div class="form-group">
	              <label for="usrname"><span class="glyphicon glyphicon-user"></span> 아이디</label>
	              <input type="text" class="form-control" id="usrname" placeholder="아이디">
	            </div>
	            <div class="form-group">
	              <label for="psw"><span class="glyphicon glyphicon-eye-open"></span> 비밀번호</label>
	              <input type="text" class="form-control" id="psw" placeholder="비밀번호">
	            </div>
	            <div class="checkbox">
	              <label><input type="checkbox" value="" checked>아이디 기억하기</label>
	            </div>
	              <button type="submit" class="btn btn-success btn-block"><span class="glyphicon glyphicon-off"></span> 로그인</button>
	          </form>
	        </div>
	        <div class="modal-footer">
	          <button type="submit" class="btn btn-danger btn-default pull-left" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> 취소</button>
	          <p>아이디가 없나요? <a href="signPage.jsp">회원가입</a></p>
	          <p>비밀번호를 잃어버렸나요? <a href="passwordPage.jsp">비밀번호 찾기</a></p>
	        </div>
	      	</div>
	     </div>
	  </div>
</body>
</html>