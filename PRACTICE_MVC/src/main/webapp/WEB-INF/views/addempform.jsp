<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Employee</title>
<link href="https://fonts.googleapis.com/css2?family=Inter:wght@400;600&display=swap" rel="stylesheet">
<style>
    body {
        font-family: 'Inter', sans-serif;
        background-color: #f4f7f6;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        min-height: 100vh;
        margin: 0;
    }

    .form-card {
        background: white;
        padding: 2.5rem;
        border-radius: 12px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.05);
        width: 100%;
        max-width: 400px;
        border-top: 5px solid #00b894; /* Matching the green "Add" color from home */
    }

    h2 {
        margin-top: 0;
        color: #2d3436;
        font-size: 1.5rem;
        text-align: center;
    }

    .form-group {
        margin-bottom: 1.2rem;
    }

    label {
        display: block;
        margin-bottom: 0.5rem;
        font-weight: 600;
        color: #636e72;
        font-size: 0.9rem;
    }

    input, select {
        width: 100%;
        padding: 0.8rem;
        border: 1px solid #dfe6e9;
        border-radius: 6px;
        box-sizing: border-box; /* Critical for layout */
        font-family: inherit;
        font-size: 1rem;
        transition: border-color 0.2s;
    }

    input:focus {
        outline: none;
        border-color: #00b894;
    }

    .btn-submit {
        width: 100%;
        padding: 1rem;
        background-color: #00b894;
        color: white;
        border: none;
        border-radius: 6px;
        font-weight: 600;
        cursor: pointer;
        transition: background 0.2s;
        margin-top: 1rem;
    }

    .btn-submit:hover {
        background-color: #00a082;
    }

    .back-link {
        display: block;
        text-align: center;
        margin-top: 1.5rem;
        color: #0984e3;
        text-decoration: none;
        font-size: 0.9rem;
    }

    .back-link:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>
    <div class="form-card">
        <h2>Register New Employee</h2>
        
        <form action="saveEmployee" method="post">
            <div class="form-group">
                <label for="empName">Full Name</label>
                <input type="text" id="empName" name="name" placeholder="e.g. John Doe" required>
            </div>

            <div class="form-group">
                <label for="empEmail">Email Address</label>
                <input type="email" id="empEmail" name="email" placeholder="john@company.com" required>
            </div>

            <div class="form-group">
                <label for="department">Department</label>
                <select id="department" name="department">
                    <option value="IT">Information Technology</option>
                    <option value="HR">Human Resources</option>
                    <option value="Sales">Sales & Marketing</option>
                    <option value="Finance">Finance</option>
                </select>
            </div>

            <div class="form-group">
                <label for="salary">Base Salary ($)</label>
                <input type="number" id="salary" name="salary" step="0.01" min="1" max="9999999" required>
            </div>

            <button type="submit" class="btn-submit">Add Employee</button>
        </form>

        <a href="/" class="back-link">← Back to Dashboard</a>
    </div>

</body>
</html>