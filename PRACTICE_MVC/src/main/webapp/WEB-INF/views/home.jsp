<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
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

    /* Background pattern */
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
        max-width: 650px;
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

    /* Header Section */
    .header {
        text-align: center;
        margin-bottom: 40px;
    }

    .logo-icon {
        width: 80px;
        height: 80px;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        border-radius: 50%;
        display: inline-flex;
        align-items: center;
        justify-content: center;
        margin-bottom: 20px;
        box-shadow: 0 10px 20px rgba(102, 126, 234, 0.3);
    }

    .logo-icon i {
        font-size: 40px;
        color: white;
    }

    h1 {
        font-size: 32px;
        font-weight: 700;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        background-clip: text;
        margin-bottom: 10px;
    }

    .subtitle {
        color: #6c757d;
        font-size: 16px;
        font-weight: 400;
        margin-top: 5px;
    }

    /* Stats Section */
    .stats {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        gap: 15px;
        margin-bottom: 40px;
        padding: 0 10px;
    }

    .stat-card {
        text-align: center;
        padding: 15px;
        background: #f8f9fa;
        border-radius: 15px;
        transition: all 0.3s ease;
    }

    .stat-card:hover {
        transform: translateY(-5px);
        background: #ffffff;
        box-shadow: 0 5px 15px rgba(0, 0, 0, 0.08);
    }

    .stat-number {
        font-size: 28px;
        font-weight: 700;
        color: #667eea;
        display: block;
        margin-bottom: 5px;
    }

    .stat-label {
        font-size: 12px;
        color: #6c757d;
        font-weight: 500;
        text-transform: uppercase;
        letter-spacing: 0.5px;
    }

    /* Navigation Grid */
    .nav-grid {
        display: grid;
        grid-template-columns: repeat(2, 1fr);
        gap: 20px;
        margin-bottom: 30px;
    }

    .nav-card {
        background: white;
        border: 2px solid #f0f0f0;
        border-radius: 20px;
        padding: 25px 20px;
        text-decoration: none;
        transition: all 0.3s ease;
        position: relative;
        overflow: hidden;
        cursor: pointer;
        display: block;
    }

    .nav-card::before {
        content: '';
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        height: 4px;
        background: linear-gradient(90deg, #667eea, #764ba2);
        transform: scaleX(0);
        transition: transform 0.3s ease;
    }

    .nav-card:hover::before {
        transform: scaleX(1);
    }

    .nav-card:hover {
        transform: translateY(-8px);
        box-shadow: 0 15px 30px rgba(0, 0, 0, 0.1);
        border-color: transparent;
    }

    .card-icon {
        width: 60px;
        height: 60px;
        border-radius: 15px;
        display: inline-flex;
        align-items: center;
        justify-content: center;
        margin-bottom: 20px;
        transition: all 0.3s ease;
    }

    .nav-card:hover .card-icon {
        transform: scale(1.1);
    }

    .card-icon i {
        font-size: 30px;
    }

    .add-icon {
        background: linear-gradient(135deg, #00b89420, #00b89410);
    }
    .add-icon i {
        color: #00b894;
    }

    .read-icon {
        background: linear-gradient(135deg, #0984e320, #0984e310);
    }
    .read-icon i {
        color: #0984e3;
    }

    .delete-icon {
        background: linear-gradient(135deg, #d6303120, #d6303110);
    }
    .delete-icon i {
        color: #d63031;
    }

    .nav-card h3 {
        font-size: 20px;
        font-weight: 600;
        color: #2d3436;
        margin-bottom: 10px;
    }

    .nav-card p {
        font-size: 14px;
        color: #6c757d;
        line-height: 1.5;
        margin: 0;
    }

    /* Footer Section */
    .footer {
        text-align: center;
        padding-top: 20px;
        border-top: 1px solid #e9ecef;
        margin-top: 10px;
    }

    .footer p {
        color: #6c757d;
        font-size: 13px;
        margin: 0;
    }

    .footer i {
        color: #d63031;
    }

    /* Responsive Design */
    @media (max-width: 768px) {
        .container {
            padding: 35px 25px;
        }

        h1 {
            font-size: 26px;
        }

        .logo-icon {
            width: 60px;
            height: 60px;
        }

        .logo-icon i {
            font-size: 30px;
        }

        .nav-grid {
            grid-template-columns: 1fr;
            gap: 15px;
        }

        .stats {
            grid-template-columns: 1fr;
            gap: 10px;
        }

        .stat-card {
            padding: 12px;
        }

        .nav-card {
            padding: 20px;
        }

        .card-icon {
            width: 50px;
            height: 50px;
        }

        .card-icon i {
            font-size: 24px;
        }

        .nav-card h3 {
            font-size: 18px;
        }
    }

    /* Animation delay for cards */
    .nav-card:nth-child(1) {
        animation: fadeInUp 0.5s ease-out 0.1s both;
    }
    .nav-card:nth-child(2) {
        animation: fadeInUp 0.5s ease-out 0.2s both;
    }
    .nav-card:nth-child(3) {
        animation: fadeInUp 0.5s ease-out 0.3s both;
    }

    @keyframes fadeInUp {
        from {
            opacity: 0;
            transform: translateY(20px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }

    /* Hover effect for stat cards */
    .stat-card {
        cursor: default;
    }
</style>
</head>
<body>

    <div class="container">
        <div class="header">
            <div class="logo-icon">
                <i class="fas fa-users"></i>
            </div>
            <h1>Employee Management System</h1>
            <p class="subtitle">Efficiently manage your workforce</p>
        </div>

        <!-- Navigation Cards -->
        <div class="nav-grid">
            <a href="addrequest" class="nav-card">
                <div class="card-icon add-icon">
                    <i class="fas fa-user-plus"></i>
                </div>
                <h3>Add Employee</h3>
                <p>Register new employees to the system with complete details</p>
            </a>

            <a href="readrequest" class="nav-card">
                <div class="card-icon read-icon">
                    <i class="fas fa-eye"></i>
                </div>
                <h3>View Employees</h3>
                <p>Enter the id to get the employee details</p>
            </a>

            <a href="deleterequest" class="nav-card">
                <div class="card-icon delete-icon">
                    <i class="fas fa-user-minus"></i>
                </div>
                <h3>Delete Employee</h3>
                <p>Remove employee records from the database</p>
            </a>
        </div>

        <!-- Footer -->
        <div class="footer">
            <p>Made with <i class="fas fa-heart"></i> for efficient workforce management</p>
        </div>
    </div>

</body>
</html>