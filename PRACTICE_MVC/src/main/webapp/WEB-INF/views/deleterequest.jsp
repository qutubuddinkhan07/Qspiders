<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Employee - Search</title>
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
        position: relative;
    }

    body::before {
        content: '';
        position: fixed;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        background-image: radial-gradient(circle at 25% 50%, rgba(255,255,255,0.08) 2%, transparent 2.5%);
        background-size: 40px 40px;
        pointer-events: none;
    }

    .container {
        background: white;
        border-radius: 30px;
        box-shadow: 0 25px 50px rgba(0, 0, 0, 0.15);
        padding: 50px 40px;
        width: 100%;
        max-width: 500px;
        animation: slideUp 0.5s ease-out;
        position: relative;
        z-index: 1;
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

    .delete-icon {
        text-align: center;
        margin-bottom: 25px;
    }

    .delete-icon i {
        font-size: 80px;
        color: #d63031;
        background: #ffe6e6;
        padding: 20px;
        border-radius: 50%;
        animation: pulse 2s ease-in-out infinite;
    }

    @keyframes pulse {
        0%, 100% {
            transform: scale(1);
        }
        50% {
            transform: scale(1.05);
        }
    }

    h1 {
        text-align: center;
        color: #d63031;
        font-size: 28px;
        font-weight: 700;
        margin-bottom: 10px;
    }

    .subtitle {
        text-align: center;
        color: #6c757d;
        margin-bottom: 35px;
        font-size: 14px;
    }

    .form-group {
        margin-bottom: 25px;
    }

    label {
        display: block;
        margin-bottom: 8px;
        color: #555;
        font-weight: 600;
        font-size: 14px;
        text-transform: uppercase;
        letter-spacing: 0.5px;
    }

    .input-group {
        position: relative;
    }

    .input-group i {
        position: absolute;
        left: 15px;
        top: 50%;
        transform: translateY(-50%);
        color: #adb5bd;
        font-size: 16px;
    }

    input {
        width: 100%;
        padding: 12px 15px 12px 45px;
        border: 2px solid #e1e8ed;
        border-radius: 12px;
        font-size: 16px;
        transition: all 0.3s ease;
        outline: none;
        font-family: inherit;
    }

    input:focus {
        border-color: #d63031;
        box-shadow: 0 0 0 3px rgba(214, 48, 49, 0.1);
    }

    input:hover {
        border-color: #d63031;
    }

    button {
        width: 100%;
        padding: 14px;
        background: linear-gradient(135deg, #d63031 0%, #c0392b 100%);
        color: white;
        border: none;
        border-radius: 12px;
        font-size: 16px;
        font-weight: 600;
        cursor: pointer;
        transition: all 0.3s ease;
        text-transform: uppercase;
        letter-spacing: 1px;
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 10px;
    }

    button:hover {
        transform: translateY(-2px);
        box-shadow: 0 10px 20px rgba(214, 48, 49, 0.3);
    }

    button:active {
        transform: translateY(0);
    }

    .info-box {
        background: #f8f9fa;
        border-radius: 12px;
        padding: 15px;
        margin-top: 25px;
        text-align: center;
        border-left: 4px solid #d63031;
    }

    .info-box i {
        color: #d63031;
        margin-right: 8px;
    }

    .info-box p {
        color: #6c757d;
        font-size: 13px;
        margin: 0;
    }

    .back-link {
        display: inline-block;
        text-align: center;
        margin-top: 20px;
        color: #667eea;
        text-decoration: none;
        font-size: 14px;
        font-weight: 500;
        transition: color 0.3s ease;
        width: 100%;
    }

    .back-link:hover {
        color: #764ba2;
        text-decoration: underline;
    }

    /* Responsive Design */
    @media (max-width: 768px) {
        .container {
            padding: 35px 25px;
        }
        
        h1 {
            font-size: 24px;
        }
        
        .delete-icon i {
            font-size: 60px;
            padding: 15px;
        }
        
        button {
            padding: 12px;
            font-size: 14px;
        }
        
        input {
            padding: 10px 12px 10px 40px;
            font-size: 14px;
        }
    }
</style>
</head>
<body>
    <div class="container">
        <div class="delete-icon">
            <i class="fas fa-trash-alt"></i>
        </div>
        
        <h1>Delete Employee</h1>
        <p class="subtitle">Enter the employee ID to remove from the system</p>
        
        <form action="deleteempform" method="get">
            <div class="form-group">
                <label for="employeeId">
                    <i class="fas fa-id-card"></i> Employee ID
                </label>
                <div class="input-group">
                    <i class="fas fa-search"></i>
                    <input type="text" 
                           id="employeeId" 
                           name="id" 
                           placeholder="Enter employee ID (e.g., 1001)" 
                           required
                           autofocus>
                </div>
            </div>
            
            <button type="submit">
                <i class="fas fa-search"></i> Find Employee
            </button>
        </form>
        
        <div class="info-box">
            <i class="fas fa-info-circle"></i>
            <p>Please enter a valid employee ID to view details before deletion</p>
        </div>
        
        <a href="empform" class="back-link">
            <i class="fas fa-arrow-left"></i> Back to Main Menu
        </a>
    </div>
</body>
</html>