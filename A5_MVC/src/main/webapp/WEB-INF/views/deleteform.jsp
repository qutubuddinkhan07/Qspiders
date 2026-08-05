<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Student</title>
<link href="https://fonts.googleapis.com/css2?family=Syne:wght@400;600;700;800&family=DM+Mono:wght@300;400;500&display=swap" rel="stylesheet">
<style>
  *, *::before, *::after {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
  }

  :root {
    --bg: #0d0d0f;
    --border: #2a2a32;
    --accent: #f04a4a;
    --text: #f0f0f0;
    --muted: #6b6b7a;
    --card: #241a1a;
    --input-bg: #0f1117;
    --input-border: #2a2a32;
  }

  body {
    font-family: 'Syne', sans-serif;
    background-color: var(--bg);
    color: var(--text);
    min-height: 100vh;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    padding: 3rem 2rem 4rem;
    position: relative;
    overflow-y: auto;
  }

  body::before {
    content: '';
    position: fixed;
    inset: 0;
    background-image:
      linear-gradient(var(--border) 1px, transparent 1px),
      linear-gradient(90deg, var(--border) 1px, transparent 1px);
    background-size: 48px 48px;
    opacity: 0.35;
    pointer-events: none;
    z-index: 0;
  }

  body::after {
    content: '';
    position: fixed;
    top: -20%;
    left: 50%;
    transform: translateX(-50%);
    width: 600px;
    height: 400px;
    background: radial-gradient(ellipse, rgba(240, 74, 74, 0.07) 0%, transparent 70%);
    pointer-events: none;
    z-index: 0;
  }

  .container {
    position: relative;
    z-index: 1;
    width: 100%;
    max-width: 440px;
    animation: fadeUp 0.6s ease both;
  }

  @keyframes fadeUp {
    from { opacity: 0; transform: translateY(24px); }
    to   { opacity: 1; transform: translateY(0); }
  }

  .back-link {
    font-family: 'DM Mono', monospace;
    font-size: 0.7rem;
    color: var(--muted);
    text-decoration: none;
    letter-spacing: 0.1em;
    display: inline-flex;
    align-items: center;
    gap: 0.4rem;
    margin-bottom: 2rem;
    transition: color 0.2s;
  }

  .back-link:hover { color: var(--text); }

  .tag {
    font-family: 'DM Mono', monospace;
    font-size: 0.7rem;
    color: var(--accent);
    letter-spacing: 0.18em;
    text-transform: uppercase;
    margin-bottom: 0.75rem;
    display: flex;
    align-items: center;
    gap: 0.5rem;
  }

  .tag::before {
    content: '';
    display: inline-block;
    width: 6px;
    height: 6px;
    background: var(--accent);
    border-radius: 50%;
    animation: pulse 2s ease infinite;
  }

  @keyframes pulse {
    0%, 100% { opacity: 1; transform: scale(1); }
    50%       { opacity: 0.5; transform: scale(0.7); }
  }

  h1 {
    font-size: clamp(1.8rem, 5vw, 2.6rem);
    font-weight: 800;
    line-height: 1.05;
    letter-spacing: -0.03em;
  }

  h1 span { color: var(--accent); }

  .divider {
    height: 1px;
    background: linear-gradient(90deg, var(--accent) 0%, transparent 100%);
    margin: 2rem 0;
    opacity: 0.4;
  }

  .form-card {
    background: var(--card);
    border: 1px solid var(--border);
    border-radius: 16px;
    padding: 2rem;
  }

  .warning-banner {
    display: flex;
    align-items: center;
    gap: 0.75rem;
    background: rgba(240, 74, 74, 0.08);
    border: 1px solid rgba(240, 74, 74, 0.2);
    border-radius: 8px;
    padding: 0.85rem 1rem;
    margin-bottom: 1.75rem;
  }

  .warning-icon {
    font-size: 1rem;
    flex-shrink: 0;
  }

  .warning-text {
    font-family: 'DM Mono', monospace;
    font-size: 0.68rem;
    color: var(--accent);
    letter-spacing: 0.04em;
    line-height: 1.5;
  }

  .field {
    display: flex;
    flex-direction: column;
    gap: 0.5rem;
    margin-bottom: 1.5rem;
    animation: fadeUp 0.6s ease 0.1s both;
  }

  label {
    font-family: 'DM Mono', monospace;
    font-size: 0.68rem;
    letter-spacing: 0.12em;
    text-transform: uppercase;
    color: var(--muted);
  }

  input[type="text"] {
    width: 100%;
    padding: 0.75rem 1rem;
    background: var(--input-bg);
    border: 1px solid var(--input-border);
    border-radius: 8px;
    color: var(--text);
    font-family: 'Syne', sans-serif;
    font-size: 0.95rem;
    outline: none;
    transition: border-color 0.2s, box-shadow 0.2s;
  }

  input[type="text"]::placeholder { color: var(--muted); }

  input[type="text"]:focus {
    border-color: var(--accent);
    box-shadow: 0 0 0 3px rgba(240, 74, 74, 0.12);
  }

  .btn-row {
    margin-top: 2rem;
    animation: fadeUp 0.6s ease 0.2s both;
  }

  input[type="submit"] {
    width: 100%;
    padding: 0.85rem 1.5rem;
    background: var(--accent);
    color: #fff;
    border: none;
    border-radius: 8px;
    font-family: 'Syne', sans-serif;
    font-size: 0.95rem;
    font-weight: 700;
    letter-spacing: 0.02em;
    cursor: pointer;
    transition: background 0.2s, transform 0.15s, box-shadow 0.2s;
  }

  input[type="submit"]:hover {
    background: #d93a3a;
    transform: translateY(-2px);
    box-shadow: 0 8px 24px rgba(240, 74, 74, 0.3);
  }

  input[type="submit"]:active {
    transform: translateY(0);
  }
</style>
</head>
<body>
  <div class="container">
    <a href="javascript:history.back()" class="back-link">← back</a>

    <div class="tag">Remove Record</div>
    <h1>Delete <span>Student</span></h1>

    <div class="divider"></div>

    <div class="form-card">
      <div class="warning-banner">
        <span class="warning-icon">⚠</span>
        <span class="warning-text">// this action is permanent and cannot be undone</span>
      </div>

      <form action="deleteaction">
        <div class="field">
          <label for="id">Student ID</label>
          <input type="text" name="id" id="id" placeholder="e.g. 101">
        </div>

        <div class="btn-row">
          <input type="submit" value="Delete Student →">
        </div>
      </form>
    </div>
  </div>
</body>
</html>