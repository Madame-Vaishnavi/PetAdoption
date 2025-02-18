<%@ page import="java.util.List, com.project.adoptpet.model.Rescue_reports" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Rescue Reports</title>
</head>
<body>
<h1>Reported Rescues</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Reporter</th>
        <th>Location</th>
        <th>Description</th>
        <th>Status</th>
    </tr>
    <c:forEach var="report" items="${rescueReports}">
        <tr>
            <td>${report.id}</td>
            <td>${report.user.name}</td>
            <td>${report.location}</td>
            <td>${report.description}</td>
            <td>${report.status}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
