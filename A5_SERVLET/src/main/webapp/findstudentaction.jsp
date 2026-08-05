<%@page import="java.sql.ResultSet"%>
<%@page import="com.qsp.repository.StudentRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<div class="container">
		<h1>Student details</h1>
		<%!StudentRepository studentrepo = StudentRepository.getInstance();%>
		<%
		String email = request.getParameter("email");
		ResultSet rs = studentrepo.getStudentByEmail(email);
		String name = "demo";
		int age = -1;
		String phone = "demo";
		while (rs.next()) {
			name = rs.getString(1);
			age = rs.getInt(2);
			phone = rs.getString(3);
			break;
		}
		%>

		<div class="table-wrapper">
			<table>
				<thead>
					<tr>
						<td>Name</td>
						<td>Age</td>
						<td>Phone</td>
						<td>Email</td>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><%=name%></td>
						<td><%=age%></td>
						<td><%=phone%></td>
						<td><%=email%></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>