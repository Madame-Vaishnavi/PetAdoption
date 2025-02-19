<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pet Adoption System</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
        }
        nav {
            margin-top: 20px;
            padding: 15px;
            background: #007bff;
            border-radius: 8px;
        }
        nav a {
            color: white;
            text-decoration: none;
            padding: 10px 15px;
            display: inline-block;
            transition: 0.3s;
        }
        nav a:hover {
            background: #0056b3;
            border-radius: 5px;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Welcome to the Pet Adoption System</h1>
    <nav>
        <a href="pets">View Pets</a>
        <a href="adopt_requests">Adoption Requests</a>
        <a href="rescue_reports">Rescue Reports</a>
        <a href="login">Login</a>
        <a href="register">Register</a>
    </nav>
</div>

</body>
</html>
