<%@page import="java.sql.ResultSet"%>
<%@page import="com.qsp.repository.StudentRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Students</title>
<link rel="stylesheet" href="css/index.css">
</head>
<body>
	<div class="container">
		<h1>All students data</h1>
		<%!StudentRepository studentrepo = StudentRepository.getInstance();%>
		<div class="tableWrapper">
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Age</th>
						<th>Phone</th>
						<th>Email</th>
						<th>Update</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<%
					ResultSet rs = studentrepo.getAllStudent();
					%>
					<%
					if (rs == null)
						return;
					while (rs.next()) {
					%>

					<tr>
						<td><%=rs.getString(1)%></td>
						<td><%=rs.getInt(2)%></td>
						<td><%=rs.getString(3)%></td>
						<td><%=rs.getString(4)%></td>
						<td><a class="btn update"
							href="updatestudentform.jsp?email=<%=rs.getString(4)%>">update</a></td>
						<td><a class="btn delete"
							href="deletestudent?email=<%=rs.getString(4)%>">delete</a></td>
					</tr>

					<%
					}
					%>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>