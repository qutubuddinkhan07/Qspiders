<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Successful</title>
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body {
        font-family: 'Inter', sans-serif;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        min-height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 20px;
    }

    .container {
        background: white;
        border-radius: 30px;
        box-shadow: 0 25px 50px rgba(0, 0, 0, 0.15);
        padding: 50px 40px;
        width: 100%;
        max-width: 500px;
        text-align: center;
        animation: slideUp 0.5s ease-out;
    }

    @keyframes slideUp {
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
        margin-bottom: 25px;
        animation: bounce 0.6s ease-out;
    }

    @keyframes bounce {
        0%, 100% {
            transform: scale(1);
        }
        50% {
            transform: scale(1.2);
        }
    }

    .success-icon i {
        font-size: 80px;
        color: #00b894;
        background: #e0f7f0;
        padding: 20px;
        border-radius: 50%;
    }

    h1 {
        color: #00b894;
        font-size: 28px;
        font-weight: 700;
        margin-bottom: 15px;
    }

    .message-box {
        background: #d4edda;
        color: #155724;
        padding: 15px;
        border-radius: 10px;
        margin: 20px 0;
        border-left: 4px solid #28a745;
        text-align: center;
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 10px;
    }

    .button-group {
        display: flex;
        gap: 15px;
        margin-top: 30px;
        justify-content: center;
    }

    .btn {
        padding: 12px 24px;
        border: none;
        border-radius: 10px;
        font-size: 14px;
        font-weight: 600;
        cursor: pointer;
        transition: all 0.3s ease;
        text-transform: uppercase;
        letter-spacing: 1px;
        text-decoration: none;
        display: inline-flex;
        align-items: center;
        gap: 8px;
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
            padding: 30px 25px;
        }
        
        .button-group {
            flex-direction: column;
        }
        
        .success-icon i {
            font-size: 60px;
            padding: 15px;
        }
        
        h1 {
            font-size: 24px;
        }
    }
</style>
</head>
<body>
    <div class="container">
        <div class="success-icon">
            <i class="fas fa-check-circle"></i>
        </div>
        
        <h1>Employee Deleted!</h1>
        
        <div class="message-box">
            <i class="fas fa-info-circle"></i> 
            ${message}
        </div>
        
        <div class="button-group">
            <a href="deleterequest" class="btn btn-primary">
                <i class="fas fa-trash-alt"></i> Delete Another
            </a>
            <a href="/" class="btn btn-secondary">
                <i class="fas fa-home"></i> Main Menu
            </a>
        </div>
    </div>
</body>
</html>