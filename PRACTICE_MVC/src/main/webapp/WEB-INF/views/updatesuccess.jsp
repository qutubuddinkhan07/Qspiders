<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Successful</title>
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
    max-width: 500px;
    text-align: center;
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

.success-icon {
    font-size: 80px;
    margin-bottom: 20px;
}

h1 {
    color: #10b981;
    margin-bottom: 15px;
    font-size: 28px;
    font-weight: 600;
}

.message-box {
    background: #d4edda;
    color: #155724;
    padding: 12px;
    border-radius: 10px;
    margin-bottom: 30px;
    border-left: 4px solid #28a745;
}

.btn-group {
    display: flex;
    gap: 15px;
    justify-content: center;
}

.btn {
    padding: 12px 24px;
    background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
    color: white;
    text-decoration: none;
    border-radius: 10px;
    font-weight: 600;
    transition: all 0.3s ease;
    text-transform: uppercase;
    letter-spacing: 1px;
    display: inline-block;
}

.btn:hover {
    transform: translateY(-2px);
    box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
}

.btn-secondary {
    background: #6c757d;
}

@media (max-width: 768px) {
    .btn-group {
        flex-direction: column;
    }
}
</style>
</head>
<body>
    <div class="container">
        <div class="success-icon">✅</div>
        <h1>Update Successful!</h1>
        <div class="message-box">
            ${message}
        </div>
        <div class="btn-group">
            <a href="readrequest" class="btn">Search Another Employee</a>
        </div>
    </div>
</body>
</html>