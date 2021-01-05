<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>My Instagram Cat</title>
<link rel="stylesheet" href="../css/photoList.css">

<script type="text/javascript">

</script>
</head>
	<body>
<%@ include file="./header.jsp" %>
<%@include file="./modal/postingModal.jsp" %>
           <div class="photoList">
            <div class="row">
            <% for(int i=0;i<9/*변수*/;i++)
            { %>
                <div class="pic col-sm-4 col-md-4 ">
                    <a href="javascript:postingModal()" data-toggle="modal" data-target="#postingModal"><img src="../img/1.jpg" alt=""></a>
                </div>
                <% 
            }
                %>
               
                </div>
            </div>
        
	</body>
</html>