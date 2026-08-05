<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
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
}

.container {
    background: white;
    border-radius: 20px;
    box-shadow: 0 20px 40px rgba(0, 0, 0, 0.1);
    padding: 40px;
    width: 100%;
    max-width: 600px;
    animation: fadeInUp 0.6s ease-out;
}

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
    margin-bottom: 20px;
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

input[readonly] {
    background-color: #f8f9fa;
    cursor: not-allowed;
}

.button-group {
    display: flex;
    gap: 15px;
    margin-top: 30px;
}

.btn {
    flex: 1;
    padding: 14px;
    border: none;
    border-radius: 10px;
    font-size: 16px;
    font-weight: 600;
    cursor: pointer;
    transition: all 0.3s ease;
    text-transform: uppercase;
    letter-spacing: 1px;
    text-decoration: none;
    text-align: center;
    display: inline-block;
}

.btn-primary {
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    color: white;
}

.btn-primary:hover {
    transform: translateY(-2px);
    box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
}

.btn-secondary {
    background: #6c757d;
    color: white;
}

.btn-secondary:hover {
    background: #5a6268;
    transform: translateY(-2px);
}

@media (max-width: 768px) {
    .container {
        padding: 25px;
    }
    .button-group {
        flex-direction: column;
    }
}
</style>
</head>
<body>
    <div class="container">
        <h1>Update Employee</h1>
        
        <form action="updateemployee" method="post">
            <!-- Hidden field for ID -->
            <input type="hidden" name="id" value="${employee.id}">
            
            <div class="form-group">
                <label for="id">Employee ID</label>
                <input type="text" id="id" value="${employee.id}" readonly>
            </div>
            
            <div class="form-group">
                <label for="name">Full Name</label>
                <input type="text" id="name" name="name" value="${employee.name}" required>
            </div>
            
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" value="${employee.email}" required>
            </div>
            
            <div class="form-group">
                <label for="department">Department</label>
                <input type="text" id="department" name="department" value="${employee.department}" required>
            </div>
            
            <div class="form-group">
                <label for="salary">Salary</label>
                <input type="number" id="salary" name="salary" value="${employee.salary}" step="0.01" required>
            </div>
            
            <div class="button-group">
                <button type="submit" class="btn btn-primary">Update Employee</button>
                <a href="readrequest" class="btn btn-secondary">Cancel</a>
            </div>
        </form>
    </div>
</body>
</html>