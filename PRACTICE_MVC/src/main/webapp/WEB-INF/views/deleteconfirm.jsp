<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Confirm Delete</title>
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
        padding: 40px;
        width: 100%;
        max-width: 550px;
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

    .warning-icon {
        text-align: center;
        margin-bottom: 20px;
    }

    .warning-icon i {
        font-size: 80px;
        color: #d63031;
        background: #ffe6e6;
        padding: 20px;
        border-radius: 50%;
        animation: shake 0.5s ease-in-out;
    }

    @keyframes shake {
        0%, 100% { transform: translateX(0); }
        25% { transform: translateX(-5px); }
        75% { transform: translateX(5px); }
    }

    h1 {
        text-align: center;
        color: #d63031;
        font-size: 28px;
        font-weight: 700;
        margin-bottom: 20px;
    }

    .employee-card {
        background: #f8f9fa;
        border-radius: 15px;
        padding: 20px;
        margin: 20px 0;
        border: 1px solid #e1e8ed;
    }

    .detail-row {
        display: flex;
        padding: 10px 0;
        border-bottom: 1px solid #e1e8ed;
    }

    .detail-row:last-child {
        border-bottom: none;
    }

    .detail-label {
        font-weight: 600;
        width: 120px;
        color: #555;
        font-size: 13px;
        text-transform: uppercase;
        letter-spacing: 0.5px;
    }

    .detail-value {
        flex: 1;
        color: #333;
        font-weight: 500;
    }

    .warning-message {
        background: #fff3cd;
        border: 1px solid #ffeaa7;
        color: #856404;
        padding: 15px;
        border-radius: 10px;
        margin: 20px 0;
        text-align: center;
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 10px;
    }

    .button-group {
        display: flex;
        gap: 15px;
        margin-top: 25px;
    }

    .btn {
        flex: 1;
        padding: 12px 20px;
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
        display: inline-flex;
        align-items: center;
        justify-content: center;
        gap: 8px;
    }

    .btn-danger {
        background: linear-gradient(135deg, #d63031 0%, #c0392b 100%);
        color: white;
    }

    .btn-danger:hover {
        transform: translateY(-2px);
        box-shadow: 0 10px 20px rgba(214, 48, 49, 0.3);
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
        
        .detail-row {
            flex-direction: column;
        }
        
        .detail-label {
            margin-bottom: 5px;
        }
        
        .button-group {
            flex-direction: column;
        }
        
        .warning-icon i {
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
        <div class="warning-icon">
            <i class="fas fa-exclamation-triangle"></i>
        </div>
        
        <h1>Confirm Deletion</h1>
        
        <div class="employee-card">
            <div class="detail-row">
                <div class="detail-label">Employee ID:</div>
                <div class="detail-value">${employee.id}</div>
            </div>
            <div class="detail-row">
                <div class="detail-label">Full Name:</div>
                <div class="detail-value">${employee.name}</div>
            </div>
            <div class="detail-row">
                <div class="detail-label">Email:</div>
                <div class="detail-value">${employee.email}</div>
            </div>
            <div class="detail-row">
                <div class="detail-label">Department:</div>
                <div class="detail-value">${employee.department}</div>
            </div>
            <div class="detail-row">
                <div class="detail-label">Salary:</div>
                <div class="detail-value">$${employee.salary}</div>
            </div>
        </div>
        
        <div class="warning-message">
            <i class="fas fa-info-circle"></i>
            <strong>Warning:</strong> This action cannot be undone. All data will be permanently removed.
        </div>
        
        <div class="button-group">
            <form action="deleteemployee" method="post" style="flex: 1;">
                <input type="hidden" name="id" value="${employee.id}">
                <button type="submit" class="btn btn-danger" 
                        onclick="return confirm('Are you absolutely sure? This will permanently delete the employee record!');">
                    <i class="fas fa-trash-alt"></i> Yes, Delete
                </button>
            </form>
            <a href="deleterequest" class="btn btn-secondary">
                <i class="fas fa-times"></i> Cancel
            </a>
        </div>
    </div>
</body>
</html>