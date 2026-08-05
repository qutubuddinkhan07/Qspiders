<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response Message</title>
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
        max-width: 550px;
        text-align: center;
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

    /* Dynamic icon based on message type */
    .icon-container {
        margin-bottom: 25px;
        animation: bounce 0.6s ease-out;
    }

    @keyframes bounce {
        0%, 100% {
            transform: scale(1);
        }
        50% {
            transform: scale(1.1);
        }
    }

    .icon-circle {
        width: 100px;
        height: 100px;
        border-radius: 50%;
        display: inline-flex;
        align-items: center;
        justify-content: center;
        margin: 0 auto;
    }

    .icon-circle i {
        font-size: 50px;
    }

    /* Success styling */
    .success-bg {
        background: linear-gradient(135deg, #e0f7f0 0%, #c8f0e3 100%);
    }
    .success-bg i {
        color: #00b894;
    }

    /* Error styling */
    .error-bg {
        background: linear-gradient(135deg, #ffe6e6 0%, #ffd4d4 100%);
    }
    .error-bg i {
        color: #d63031;
    }

    /* Info styling */
    .info-bg {
        background: linear-gradient(135deg, #e3f2fd 0%, #d4e9ff 100%);
    }
    .info-bg i {
        color: #0984e3;
    }

    /* Warning styling */
    .warning-bg {
        background: linear-gradient(135deg, #fff3e0 0%, #ffe6cc 100%);
    }
    .warning-bg i {
        color: #fdcb6e;
    }

    h1 {
        font-size: 32px;
        font-weight: 700;
        margin-bottom: 20px;
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        background-clip: text;
    }

    .message-box {
        padding: 20px;
        border-radius: 15px;
        margin: 25px 0;
        animation: fadeIn 0.5s ease-out;
    }

    @keyframes fadeIn {
        from {
            opacity: 0;
            transform: translateY(10px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }

    /* Success message box */
    .message-success {
        background: #d4edda;
        border-left: 4px solid #28a745;
        color: #155724;
    }

    /* Error message box */
    .message-error {
        background: #f8d7da;
        border-left: 4px solid #dc3545;
        color: #721c24;
    }

    /* Info message box */
    .message-info {
        background: #d1ecf1;
        border-left: 4px solid #17a2b8;
        color: #0c5460;
    }

    /* Warning message box */
    .message-warning {
        background: #fff3cd;
        border-left: 4px solid #ffc107;
        color: #856404;
    }

    .message-content {
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 12px;
        font-size: 16px;
        font-weight: 500;
        line-height: 1.5;
    }

    .message-content i {
        font-size: 20px;
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
        border-radius: 12px;
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
        font-family: 'Inter', sans-serif;
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

    .btn-danger {
        background: linear-gradient(135deg, #d63031 0%, #c0392b 100%);
        color: white;
    }

    .btn-danger:hover {
        transform: translateY(-2px);
        box-shadow: 0 10px 20px rgba(214, 48, 49, 0.3);
    }

    .btn-success {
        background: linear-gradient(135deg, #00b894 0%, #019875 100%);
        color: white;
    }

    .btn-success:hover {
        transform: translateY(-2px);
        box-shadow: 0 10px 20px rgba(0, 184, 148, 0.3);
    }

    /* Timer/progress bar */
    .progress-container {
        margin-top: 25px;
        padding-top: 20px;
        border-top: 1px solid #e9ecef;
    }

    .progress-text {
        font-size: 12px;
        color: #6c757d;
        margin-bottom: 8px;
    }

    .progress-bar {
        height: 4px;
        background: #e9ecef;
        border-radius: 2px;
        overflow: hidden;
    }

    .progress-fill {
        height: 100%;
        background: linear-gradient(90deg, #667eea, #764ba2);
        width: 0%;
        animation: progress 5s linear forwards;
    }

    @keyframes progress {
        from {
            width: 100%;
        }
        to {
            width: 0%;
        }
    }

    /* Responsive Design */
    @media (max-width: 768px) {
        .container {
            padding: 35px 25px;
        }

        h1 {
            font-size: 26px;
        }

        .icon-circle {
            width: 80px;
            height: 80px;
        }

        .icon-circle i {
            font-size: 40px;
        }

        .message-content {
            font-size: 14px;
            flex-direction: column;
            text-align: center;
        }

        .button-group {
            flex-direction: column;
        }

        .btn {
            justify-content: center;
        }
    }

    /* Additional animations */
    @keyframes pulse {
        0%, 100% {
            transform: scale(1);
        }
        50% {
            transform: scale(1.05);
        }
    }

    .icon-circle:hover {
        animation: pulse 0.5s ease-in-out;
    }
</style>
</head>
<body>

<%
    // Determine message type based on message content
    String message = (String) request.getAttribute("message");
    String messageType = "info"; // default
    
    if (message != null) {
        String lowerMsg = message.toLowerCase();
        if (lowerMsg.contains("success") || lowerMsg.contains("saved") || lowerMsg.contains("updated") || 
            lowerMsg.contains("deleted") || lowerMsg.contains("added")) {
            messageType = "success";
        } else if (lowerMsg.contains("error") || lowerMsg.contains("failed") || lowerMsg.contains("not found")) {
            messageType = "error";
        } else if (lowerMsg.contains("warning") || lowerMsg.contains("careful")) {
            messageType = "warning";
        }
    }
    
    // Set icon and styling based on message type
    String iconClass = "";
    String iconName = "";
    String messageBoxClass = "";
    
    if ("success".equals(messageType)) {
        iconClass = "success-bg";
        iconName = "fa-check-circle";
        messageBoxClass = "message-success";
    } else if ("error".equals(messageType)) {
        iconClass = "error-bg";
        iconName = "fa-times-circle";
        messageBoxClass = "message-error";
    } else if ("warning".equals(messageType)) {
        iconClass = "warning-bg";
        iconName = "fa-exclamation-triangle";
        messageBoxClass = "message-warning";
    } else {
        iconClass = "info-bg";
        iconName = "fa-info-circle";
        messageBoxClass = "message-info";
    }
%>

<div class="container">
    <div class="icon-container">
        <div class="icon-circle <%= iconClass %>">
            <i class="fas <%= iconName %>"></i>
        </div>
    </div>
    
    <h1>Response Message</h1>
    
    <div class="message-box <%= messageBoxClass %>">
        <div class="message-content">
            <i class="fas <%= iconName %>"></i>
            <span>${message}</span>
        </div>
    </div>
    
    <div class="button-group">
        <a href="/" class="btn btn-primary">
            <i class="fas fa-home"></i> Go to Home
        </a>
        <a href="javascript:history.back()" class="btn btn-secondary">
            <i class="fas fa-arrow-left"></i> Go Back
        </a>
    </div>
    
    <div class="progress-container">
        <div class="progress-text">
            <i class="fas fa-clock"></i> Redirecting in 5 seconds...
        </div>
        <div class="progress-bar">
            <div class="progress-fill"></div>
        </div>
    </div>
</div>

<script>
    // Auto redirect to home page after 5 seconds
    setTimeout(function() {
        window.location.href = "/";
    }, 5000);
    
    // Optional: Update timer text
    let seconds = 5;
    const timerElement = document.querySelector('.progress-text');
    const interval = setInterval(function() {
        seconds--;
        if (seconds > 0) {
            timerElement.innerHTML = '<i class="fas fa-clock"></i> Redirecting in ' + seconds + ' seconds...';
        } else {
            clearInterval(interval);
        }
    }, 1000);
</script>

</body>
</html>