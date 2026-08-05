<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
	min-height: 100vh;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 20px;
	position: relative;
}

.container {
	background: white;
	border-radius: 20px;
	box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
	padding: 40px;
	width: 100%;
	max-width: 500px;
	transform: translateY(0);
	transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.container:hover {
	transform: translateY(-5px);
	box-shadow: 0 25px 50px rgba(0, 0, 0, 0.15);
}

h1 {
	color: #333;
	margin-bottom: 30px;
	font-size: 28px;
	font-weight: 600;
	text-align: center;
	position: relative;
	padding-bottom: 15px;
}

h1:after {
	content: '';
	position: absolute;
	bottom: 0;
	left: 50%;
	transform: translateX(-50%);
	width: 60px;
	height: 3px;
	background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
	border-radius: 2px;
}

.form-group {
	margin-bottom: 25px;
}

label {
	display: block;
	margin-bottom: 8px;
	color: #555;
	font-weight: 500;
	font-size: 14px;
	text-transform: uppercase;
	letter-spacing: 0.5px;
}

input {
	width: 100%;
	padding: 12px 15px;
	border: 2px solid #e1e8ed;
	border-radius: 10px;
	font-size: 16px;
	transition: all 0.3s ease;
	outline: none;
	font-family: inherit;
}

input:focus {
	border-color: #667eea;
	box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);
}

input:hover {
	border-color: #764ba2;
}

button {
	width: 100%;
	padding: 14px;
	background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
	color: white;
	border: none;
	border-radius: 10px;
	font-size: 16px;
	font-weight: 600;
	cursor: pointer;
	transition: all 0.3s ease;
	text-transform: uppercase;
	letter-spacing: 1px;
}

button:hover {
	transform: translateY(-2px);
	box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
}

button:active {
	transform: translateY(0);
}

/* Back link styling */
.back-link {
	display: inline-block;
	margin-top: 20px;
	color: #667eea;
	text-decoration: none;
	font-weight: 500;
	transition: color 0.3s ease;
}

.back-link:hover {
	color: #764ba2;
	text-decoration: underline;
}

/* Animation for form appearance */
@keyframes fadeInUp {
	from {
		opacity: 0;
		transform: translateY(30px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}

.container {
	animation: fadeInUp 0.6s ease-out;
}

/* Responsive design */
@media (max-width: 768px) {
	.container {
		padding: 30px 20px;
		margin: 20px;
	}
	h1 {
		font-size: 24px;
	}
	input, button {
		padding: 10px 12px;
	}
}

/* Subtle pattern overlay */
body::before {
	content: '';
	position: fixed;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
	background-image: radial-gradient(circle at 25% 50%, rgba(255, 255, 255, 0.05)
		2%, transparent 2.5%);
	background-size: 30px 30px;
	pointer-events: none;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Read Employee Details</h1>

		<form action="readempform" method="post">
			<div class="form-group">
				<label for="employeeId">Employee ID</label> 
				<input type="text"
					id="employeeId" 
					name="id" 
					placeholder="Enter employee ID" 
					required>
			</div>

			<button type="submit">Search Employee</button>
		</form>
	</div>
</body>
</html>