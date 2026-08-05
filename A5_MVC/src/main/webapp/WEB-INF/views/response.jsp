<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Response</title>
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
    --accent: #c8f04a;
    --text: #f0f0f0;
    --muted: #6b6b7a;
    --card: #16161a;
    --input-bg: #0f1117;
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
    padding: 2rem;
    position: relative;
    overflow: hidden;
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
    background: radial-gradient(ellipse, rgba(200, 240, 74, 0.07) 0%, transparent 70%);
    pointer-events: none;
    z-index: 0;
  }

  .container {
    position: relative;
    z-index: 1;
    width: 100%;
    max-width: 480px;
    text-align: center;
    animation: fadeUp 0.6s ease both;
  }

  @keyframes fadeUp {
    from { opacity: 0; transform: translateY(24px); }
    to   { opacity: 1; transform: translateY(0); }
  }

  .icon-wrap {
    display: flex;
    align-items: center;
    justify-content: center;
    width: 64px;
    height: 64px;
    border-radius: 50%;
    background: rgba(200, 240, 74, 0.1);
    border: 1px solid rgba(200, 240, 74, 0.25);
    margin: 0 auto 1.75rem;
    font-size: 1.6rem;
    animation: popIn 0.5s cubic-bezier(0.34, 1.56, 0.64, 1) 0.2s both;
  }

  @keyframes popIn {
    from { opacity: 0; transform: scale(0.6); }
    to   { opacity: 1; transform: scale(1); }
  }

  .tag {
    font-family: 'DM Mono', monospace;
    font-size: 0.7rem;
    color: var(--accent);
    letter-spacing: 0.18em;
    text-transform: uppercase;
    margin-bottom: 0.75rem;
    display: flex;
    align-items: center;
    justify-content: center;
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

  .title {
    font-size: clamp(1.6rem, 4vw, 2.2rem);
    font-weight: 800;
    letter-spacing: -0.03em;
    margin-bottom: 0;
  }

  .divider {
    height: 1px;
    background: linear-gradient(90deg, transparent, var(--accent), transparent);
    margin: 2rem auto;
    opacity: 0.3;
    width: 60%;
  }

  .message-card {
    background: var(--card);
    border: 1px solid var(--border);
    border-radius: 16px;
    padding: 2rem 2.5rem;
    animation: fadeUp 0.6s ease 0.15s both;
  }

  .message-label {
    font-family: 'DM Mono', monospace;
    font-size: 0.65rem;
    letter-spacing: 0.14em;
    text-transform: uppercase;
    color: var(--muted);
    margin-bottom: 0.75rem;
  }

  .message-text {
    font-size: 1.15rem;
    font-weight: 600;
    color: var(--accent);
    line-height: 1.5;
    word-break: break-word;
  }

  .actions {
    margin-top: 2rem;
    display: flex;
    gap: 0.75rem;
    justify-content: center;
    animation: fadeUp 0.6s ease 0.25s both;
  }

  .btn {
    padding: 0.7rem 1.4rem;
    border-radius: 8px;
    font-family: 'Syne', sans-serif;
    font-size: 0.85rem;
    font-weight: 700;
    text-decoration: none;
    cursor: pointer;
    transition: transform 0.15s, box-shadow 0.2s, background 0.2s;
  }

  .btn:hover {
    transform: translateY(-2px);
  }

  .btn-primary {
    background: var(--accent);
    color: #0d0d0f;
    border: none;
    box-shadow: 0 4px 16px rgba(200, 240, 74, 0.2);
  }

  .btn-primary:hover {
    background: #b8e03a;
    box-shadow: 0 8px 24px rgba(200, 240, 74, 0.3);
  }

  .btn-ghost {
    background: transparent;
    color: var(--muted);
    border: 1px solid var(--border);
  }

  .btn-ghost:hover {
    color: var(--text);
    border-color: var(--muted);
  }
</style>
</head>
<body>
  <div class="container">

    <div class="icon-wrap">✓</div>

    <div class="tag">MVC Response</div>
    <h1 class="title">Operation Complete</h1>

    <div class="divider"></div>

    <div class="message-card">
      <p class="message-label">// server message</p>
      <p class="message-text">${message}</p>
    </div>

    <div class="actions">
      <a href="/" class="btn btn-primary">← Back to Home</a>
      <a href="javascript:history.back()" class="btn btn-ghost">Go Back</a>
    </div>

  </div>
</body>
</html>