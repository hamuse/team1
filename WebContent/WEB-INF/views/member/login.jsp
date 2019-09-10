<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<div>
<h2>회원가입</h2>
<form id="login" action="<%=request.getContextPath()%>/member.do">
				아이디<input type="text"  name="id"/><br />
				비밀번호<input type="text"  name="pw"/><br />
				<input type="hidden"  name="action" value = "login"/><br />
				<input type="hidden"  name="page" value="mypage"/><br />
				<input type="submit"  value="전송"/><br />
</form>
</div>

</body>
</html>