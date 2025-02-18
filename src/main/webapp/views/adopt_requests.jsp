<%@ page import="java.util.List, com.project.adoptpet.model.Adoption_requests" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Adoption Requests</title>
</head>
<body>
<h1>Adoption Requests</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>User</th>
        <th>Pet</th>
        <th>Status</th>
    </tr>
    <c:forEach var="request" items="${adoptionRequests}">
        <tr>
            <td>${request.id}</td>
            <td>${request.user.name}</td>
            <td>${request.pet.name}</td>
            <td>${request.status}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
