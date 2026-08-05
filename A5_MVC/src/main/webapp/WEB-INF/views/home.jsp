<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Portal</title>
<link
	href="https://fonts.googleapis.com/css2?family=Syne:wght@400;600;700;800&family=DM+Mono:wght@300;400;500&display=swap"
	rel="stylesheet">
<style>
*, *::before, *::after {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

:root {
	--bg: #0d0d0f;
	--surface: #16161a;
	--border: #2a2a32;
	--accent: #c8f04a;
	--text: #f0f0f0;
	--muted: #6b6b7a;
	--card-add: #1a1f2e;
	--card-read: #1a2820;
	--card-update: #261f1a;
	--card-delete: #241a1a;
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
	background-image: linear-gradient(var(--border) 1px, transparent 1px),
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
	background: radial-gradient(ellipse, rgba(200, 240, 74, 0.08) 0%,
		transparent 70%);
	pointer-events: none;
	z-index: 0;
}

.container {
	position: relative;
	z-index: 1;
	width: 100%;
	max-width: 640px;
	animation: fadeUp 0.6s ease both;
}

@
keyframes fadeUp {from { opacity:0;
	transform: translateY(24px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}
.header {
	margin-bottom: 3rem;
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

@
keyframes pulse { 0%, 100% {
	opacity: 1;
	transform: scale(1);
}

50
%
{
opacity
:
0.5;
transform
:
scale(
0.7
);
}
}
h1 {
	font-size: clamp(2.4rem, 6vw, 3.5rem);
	font-weight: 800;
	line-height: 1.05;
	letter-spacing: -0.03em;
}

h1 span {
	color: var(--accent);
}

.subtitle {
	font-family: 'DM Mono', monospace;
	font-size: 0.8rem;
	color: var(--muted);
	margin-top: 0.75rem;
}

.divider {
	height: 1px;
	background: linear-gradient(90deg, var(--accent) 0%, transparent 100%);
	margin: 2rem 0;
	opacity: 0.4;
}

.nav-grid {
	display: grid;
	grid-template-columns: 1fr 1fr;
	gap: 1rem;
}

.nav-card {
	position: relative;
	display: flex;
	flex-direction: column;
	padding: 1.5rem;
	border: 1px solid var(--border);
	border-radius: 12px;
	text-decoration: none;
	color: var(--text);
	transition: border-color 0.2s, transform 0.2s, box-shadow 0.2s;
	overflow: hidden;
	animation: fadeUp 0.6s ease both;
}

.nav-card:nth-child(1) {
	background: var(--card-add);
	animation-delay: 0.1s;
}

.nav-card:nth-child(2) {
	background: var(--card-read);
	animation-delay: 0.2s;
}

.nav-card:nth-child(3) {
	background: var(--card-update);
	animation-delay: 0.3s;
}

.nav-card:nth-child(4) {
	background: var(--card-delete);
	animation-delay: 0.4s;
}

.nav-card::before {
	content: '';
	position: absolute;
	inset: 0;
	opacity: 0;
	transition: opacity 0.2s;
	background: linear-gradient(135deg, rgba(255, 255, 255, 0.04) 0%,
		transparent 60%);
}

.nav-card:hover {
	transform: translateY(-3px);
	box-shadow: 0 12px 40px rgba(0, 0, 0, 0.4);
}

.nav-card:nth-child(1):hover {
	border-color: #4a80f0;
}

.nav-card:nth-child(2):hover {
	border-color: #4af07a;
}

.nav-card:nth-child(3):hover {
	border-color: #f0b44a;
}

.nav-card:nth-child(4):hover {
	border-color: #f04a4a;
}

.nav-card:hover::before {
	opacity: 1;
}

.card-icon {
	font-size: 1.5rem;
	margin-bottom: 1rem;
	display: block;
}

.card-label {
	font-family: 'DM Mono', monospace;
	font-size: 0.65rem;
	letter-spacing: 0.14em;
	text-transform: uppercase;
	color: var(--muted);
	margin-bottom: 0.3rem;
}

.card-title {
	font-size: 1.1rem;
	font-weight: 700;
	letter-spacing: -0.01em;
}

.card-arrow {
	position: absolute;
	bottom: 1.2rem;
	right: 1.2rem;
	font-size: 0.9rem;
	color: var(--muted);
	transition: color 0.2s, transform 0.2s;
}

.nav-card:hover .card-arrow {
	color: var(--text);
	transform: translate(2px, -2px);
}

.footer {
	margin-top: 2.5rem;
	font-family: 'DM Mono', monospace;
	font-size: 0.68rem;
	color: var(--muted);
	text-align: center;
	letter-spacing: 0.06em;
}
</style>
</head>
<body>
	<div class="container">
		<div class="header">
			<div class="tag">Student Management System</div>
			<h1>
				Home <span>Portal</span>
			</h1>
			<p class="subtitle">// select an operation to get started</p>
		</div>

		<div class="divider"></div>

		<div class="nav-grid">
			<a href="addrequest" class="nav-card"> <span class="card-icon">＋</span>
				<span class="card-label">Create</span> <span class="card-title">Add
					Student</span> <span class="card-arrow">↗</span>
			</a> <a href="readrequest" class="nav-card"> <span class="card-icon">◎</span>
				<span class="card-label">Retrieve</span> <span class="card-title">Get
					Student</span> <span class="card-arrow">↗</span>
			</a> <a href="updaterequest" class="nav-card"> <span
				class="card-icon">⟳</span> <span class="card-label">Modify</span> <span
				class="card-title">Update Student</span> <span class="card-arrow">↗</span>
			</a> <a href="deleterequest" class="nav-card"> <span
				class="card-icon">✕</span> <span class="card-label">Remove</span> <span
				class="card-title">Delete Student</span> <span class="card-arrow">↗</span>
			</a>
		</div>

		<p class="footer">CRUD — v1.0 — Student Records</p>
	</div>
</body>
</html>