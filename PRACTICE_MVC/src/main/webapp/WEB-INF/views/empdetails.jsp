<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<style>
/* Add your CSS styles here - same as previous styling */
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
    margin-bottom: 20px;
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

.success-badge {
    display: inline-block;
    background: linear-gradient(135deg, #10b981 0%, #059669 100%);
    color: white;
    padding: 5px 12px;
    border-radius: 20px;
    font-size: 12px;
    font-weight: 600;
    text-transform: uppercase;
    margin-left: 10px;
}

.message-box {
    background: #d4edda;
    color: #155724;
    padding: 12px;
    border-radius: 10px;
    margin-bottom: 20px;
    text-align: center;
    border-left: 4px solid #28a745;
}

.employee-card {
    background: #f8f9fa;
    border-radius: 15px;
    padding: 25px;
    margin-bottom: 25px;
}

.info-row {
    display: flex;
    padding: 12px 0;
    border-bottom: 1px solid #e1e8ed;
}

.info-row:last-child {
    border-bottom: none;
}

.info-label {
    font-weight: 600;
    width: 120px;
    color: #555;
    text-transform: uppercase;
    font-size: 13px;
    letter-spacing: 0.5px;
}

.info-value {
    flex: 1;
    color: #333;
    font-size: 16px;
}

.button-group {
    display: flex;
    gap: 15px;
    margin-top: 25px;
}

.btn {
    flex: 1;
    padding: 12px;
    border: none;
    border-radius: 10px;
    font-size: 14px;
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
    .info-row {
        flex-direction: column;
    }
    .info-label {
        margin-bottom: 5px;
    }
    .button-group {
        flex-direction: column;
    }
}
</style>
</head>
<body>
    <div class="container">
        <h1>
            Employee Details
            <span class="success-badge">Found</span>
        </h1>
        
        <!-- Display success message -->
        <div class="message-box">
            ${message}
        </div>
        
        <div class="employee-card">
            <div class="info-row">
                <div class="info-label">Employee ID:</div>
                <div class="info-value">${employee.id}</div>
            </div>
            <div class="info-row">
                <div class="info-label">Full Name:</div>
                <div class="info-value">${employee.name}</div>
            </div>
            <div class="info-row">
                <div class="info-label">Email:</div>
                <div class="info-value">${employee.email}</div>
            </div>
            <div class="info-row">
                <div class="info-label">Department:</div>
                <div class="info-value">${employee.department}</div>
            </div>
            <div class="info-row">
                <div class="info-label">Salary:</div>
                <div class="info-value">$${employee.salary}</div>
            </div>
        </div>
        
        <div class="button-group">
            <a href="updateempform?id=${employee.id}" class="btn btn-primary">Update Employee</a>
            <a href="readrequest" class="btn btn-secondary">Back to Search</a>
        </div>
    </div>
</body>
</html>