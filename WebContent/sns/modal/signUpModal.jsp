<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function signUpModal(){
	$("#signUpModal").modal('show');
}
</script>
</head>
<body>
<div class="modal fade" id="signUpModal" role="dialog" aria-labelledby="posting_modalLabel" aria-hidden="true">
	    <div class="modal-dialog">
	        <div class="modal-content">
	        <div class="modal-header" style="padding:35px 50px;">
				<h1>회원가입</h1>
	        </div>
	        <div class="modal-body" style="padding:40px 50px;">
                <div class="col-12">
                    <form method="POST" action=".">
                        <div class="form-group">
                            <label for="username">아이디</label>
                            <input type="text" class="form-control" id="userid" placeholder="아이디" name="userid" />
                        </div>
                        <div class="form-group">
                            <label for="username">이메일 주소</label>
                            <input type="text" class="form-control" id="username" placeholder="이메일 주소" name="email" />
                        </div>
                        <div class="form-group">
                            <label for="username">비밀번호</label>
                            <input type="password" class="form-control" id="password" placeholder="비밀번호" name="password" />
                        </div>
                        <div class="form-group">
                            <label for="username">비밀번호 확인</label>
                            <input type="password" class="form-control" id="re-password" placeholder="비밀번호 확인" name="re-password" />
                        </div>
                        <button type="submit" class="btn btn-primary">등록</button>
                        <button type="submit" class="btn btn-primary">취소</button>
                    </form>
                </div>
	        </div>
	      	</div>
	     </div>
	  </div>
</body>
</html>