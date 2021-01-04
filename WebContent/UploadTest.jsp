<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<fieldset>
     <legend>파일 업로드</legend>
     <form action="UploadService.ssg" method="post" enctype="multipart/form-data">
     <table>
          <tr>
              <td>글쓴이 : </td>
              <td><input type="text" name="author"/></td>
          </tr>
          <tr>
              <td>제목 : </td>
              <td><input type="text" name="title"/></td>
          </tr>
          <tr>
              <td>파일1 : </td>
              <td><input type="file" value="파일 선택" name="file1"/></td>
          </tr>
          <tr>
              <td>파일2 : </td>
              <td><input type="file" value="파일 선택" name="file2"/></td>
          </tr>
          <tr>
              <td>파일3 : </td>
              <td><input type="file" value="파일 선택" name="file3"/></td>
          </tr>
          <tr>
              <td colspan="2"><input type="submit" value="업로드"/></td>
          </tr>
     </table>
          </form>
</fieldset>

</body>
</html>