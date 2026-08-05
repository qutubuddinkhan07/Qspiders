<%@page import="java.sql.ResultSet"%>
<%@page import="com.qsp.repository.StudentRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Student Update Form</h1>
	<%!StudentRepository studentrepo = StudentRepository.getInstance();%>

	<%
	String email = request.getParameter("email");
	ResultSet rs = studentrepo.getStudentByEmail(email);
	if (rs == null)
		return;
	rs.next();
	String name = rs.getString(1);
	int age = rs.getInt(2);
	String phone = rs.getString(3);
	%>

	<form action="updatestudent">
		<input type="hidden" name="email" value="<%=email%>">
		<div>
			<label for="name">Enter new name: </label> <input type="text"
				name="name" id="name" value="<%=name%>">
		</div>
		<div>
			<label for="age">Enter new age: </label> <input type="number"
				name="age" id="age" value="<%=age%>">
		</div>
		<div>
			<label for="phone">Enter new phone no: </label> <input type="text"
				name="phone" id="phone" value="<%=phone%>">
		</div>
		<input type="submit" value="Submit">
	</form>
</body>
</html>