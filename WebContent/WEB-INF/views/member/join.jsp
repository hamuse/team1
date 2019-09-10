<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<h2>회원가입</h2>
<form id="join_form" action="<%=request.getContextPath()%>/member.do">
							아이디<input type="text"  name="id"/><br />
							비밀번호<input type="text"  name="pw"/><br />
							주민번호<input type="text"  name="ssn"/><br />
							이름<input type="text"  name="name"/><br />
							신용도<input type="text"  name="credit"/><br />
							<input type="hidden"  name="action" value = "join"/><br />
							<input type="hidden"  name="page" value="login"/><br />
							<input type="submit"  id="btn" value="전송"/><br />

</form>
</div>


</body>
</html>