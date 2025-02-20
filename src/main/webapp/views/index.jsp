<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pet Adoption System</title>
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
            color: #333;
        }
        .hero {
            background: url('https://cdn.vectorstock.com/i/500p/61/91/group-of-dog-breeds-holding-banner-vector-20466191.jpg') no-repeat center center/cover;
            height: 100vh;
            position: relative;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            color: white;
            overflow: hidden;
        }
        .hero-overlay {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.6);
        }
        .hero-content {
            position: relative;
            z-index: 1;
            animation: fadeIn 2s ease-in-out;
        }
        .hero h1 {
            font-size: 4rem;
            margin-bottom: 0.5rem;
        }
        .hero p {
            font-size: 1.5rem;
            margin-bottom: 1.5rem;
        }
        .btn {
            background-color: #ff7f50;
            color: white;
            padding: 12px 24px;
            border-radius: 25px;
            text-decoration: none;
            transition: transform 0.3s ease, background-color 0.3s ease;
        }
        .btn:hover {
            background-color: #ff6347;
            transform: scale(1.1);
        }
        .container {
            text-align: center;
            margin: 50px auto;
            padding: 20px;
            background: white;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            border-radius: 15px;
            max-width: 1200px;
            animation: slideUp 1.5s ease;
        }
        .grid {
            display: flex;
            justify-content: center;
            gap: 20px;
        }
        .grid-item {
            background-color: #fff;
            padding: 20px;
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease, box-shadow 0.3s ease;
            width: 30%;
            text-align: center;
            cursor: pointer;
        }
        .grid-item img {
            width: 100%;
            height: 150px;
            object-fit: cover;
            border-radius: 8px;
            margin-bottom: 15px;
        }
        .grid-item:hover {
            transform: translateY(-10px);
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        }
        nav {
            background-color: black;
            padding: 15px;
            text-align: center;
            position: sticky;
            bottom: 0;
            z-index: 10;
        }
        nav a {
            margin: 0 10px;
            color: white;
            text-decoration: none;
            transition: color 0.3s ease;
        }
        nav a:hover {
            color: #ff7f50;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: scale(0.9); }
            to { opacity: 1; transform: scale(1); }
        }
        @keyframes slideUp {
            from { transform: translateY(50px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }
        @media (max-width: 768px) {
            .grid {
                flex-direction: column;
            }
            .grid-item {
                width: 100%;
            }
            .hero h1 {
                font-size: 2.5rem;
            }
            .hero p {
                font-size: 1.2rem;
            }
        }
    </style>
</head>
<body>
<div class="hero">
    <div class="hero-overlay"></div>
    <div class="hero-content">
        <h1>Find Your Perfect Companion!</h1>
        <p>Adopt, Rescue, and Give a Loving Home</p>
        <a href="pets" class="btn">View Pets</a>
        <a href="register" class="btn">Join Us</a>
    </div>
</div>
<div class="container">
    <h2>Our Services</h2>
    <div class="grid">
        <div class="grid-item" onclick="window.location.href='pets';">
            <img src="https://thumbs.dreamstime.com/b/group-pets-together-front-view-white-backgrou-background-73162193.jpg" alt="View Pets">
            <h3>View Pets</h3>
            <p>Browse through our adorable pets ready to find a loving home.</p>
        </div>
        <div class="grid-item">
            <img src="https://adopet-adopt.netlify.app/images/dog2.jpeg" alt="Adoption Requests">
            <h3>Adoption Requests</h3>
            <p>Submit your adoption request online with ease.</p>
        </div>
        <div class="grid-item">
            <img src="https://www.nationaldaycalendar.com/.image/ar_16:9%2Cc_fill%2Ccs_srgb%2Cg_faces:center%2Cq_auto:eco%2Cw_768/MjA2NDU3NTg5NzEyNTYxNDky/website-feature---national-rescue-day--may-20.png" alt="Rescue Reports">
            <h3>Rescue Reports</h3>
            <p>Help rescue and shelter pets in need by reporting.</p>
        </div>
    </div>
</div>
<nav>
    <a href="pets">View Pets</a>
    <a href="adopt_requests">Adoption Requests</a>
    <a href="rescue_reports">Rescue Reports</a>
    <a href="login">Login</a>
    <a href="register">Register</a>
</nav>
</body>
</html>