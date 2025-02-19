<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Add a New Pet</title>
    <style>
        body { font-family: Arial, sans-serif; background: #f9f9f9; margin: 0; padding: 0; }
        .container { max-width: 600px; margin: 50px auto; padding: 20px; background: #ffffff; border-radius: 10px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); }
        h2 { color: #333; }
        input, select { width: 100%; padding: 10px; margin-bottom: 15px; border: 1px solid #ddd; border-radius: 5px; }
        .btn { padding: 12px; width: 100%; border: none; border-radius: 5px; cursor: pointer; font-size: 16px; }
        .submit-btn { background-color: #28a745; color: white; }
        .submit-btn:hover { background-color: #218838; }
        .back-btn { background-color: #007bff; color: white; text-align: center; display: block; text-decoration: none; padding: 12px; margin-top: 10px; border-radius: 5px; }
        .back-btn:hover { background-color: #0056b3; }
    </style>
</head>
<body>
<div class="container">
    <h2>Add a New Pet</h2>
    <form action="addPet" method="post">
        <input type="text" name="name" placeholder="Pet Name" required>
        <input type="number" name="age" placeholder="Age" required>
        <input type="text" name="breed" placeholder="Breed" required>
        <input type="text" name="type" placeholder="Type (Dog, Cat, etc.)" required>
        <input type="text" name="health_status" placeholder="Health Status" required>
        <input type="url" name="image_url" placeholder="Image URL" required>
        <input type="number" name="center_id" placeholder="Center ID" required>
        <input type="text" name="status" placeholder="Status" required>
        <button type="submit" class="btn submit-btn">Add Pet</button>
    </form>
    <a href="pets" class="back-btn">Back to Pets</a>
</div>
</body>
</html>