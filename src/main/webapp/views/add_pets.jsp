<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Pet</title>
</head>
<body>
<h1>Add a New Pet</h1>
<form action="addPet" method="post">
    Name: <input type="text" name="name" required><br>
    Type: <input type="text" name="type" required><br>
    Age: <input type="number" name="age" required><br>
    <input type="submit" value="Add Pet">
</form>
</body>
</html>
