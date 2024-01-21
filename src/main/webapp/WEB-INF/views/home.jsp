
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>한글</h1>
	<div>
		<c:forEach var="user" items="${list}" >
			<span>
				${user.num}
			</span>
			<span>
				${user.name}
			</span>
		</c:forEach>
	</div>
</body>
</html>
