<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>project List</title>
<link rel="stylesheet" type="text/css" href="/CSS/plist.css">
<style type="text/css">
/* Your CSS styles */
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
function startProject(projectid) {
    $.ajax({
        url: 'http://localhost:8080/startProject/' + projectid,
        type: 'PUT',
        success: function(response) {
            $('#status').text(response);
            // Optionally update other parts of the UI
        },
        error: function(xhr, status, error) {
            console.error('Error starting project:', error);
        }
    });
}

function endProject(projectid) {
    $.ajax({
        url: 'http://localhost:8080/endProject/' + projectid,
        type: 'PUT',
        success: function(response) {
            $('#status').text(response);
            // Optionally update other parts of the UI
        },
        error: function(xhr, status, error) {
            console.error('Error ending project:', error);
        }
    });
}

function cancelProject(projectid) {
    $.ajax({
        url: 'http://localhost:8080/cancelProject/' + projectid,
        type: 'PUT',
        success: function(response) {
            $('#status').text(response);
            // Optionally update other parts of the UI
        },
        error: function(xhr, status, error) {
            console.error('Error canceling project:', error);
        }
    });
}
</script>
</head>
<body>
<h3>Project List</h3>
<div class="form-container">
    <table >
        <thead>
            <tr>
                <th>Project ID</th>
                <th>Project Name</th>
                <th>Reason</th>
                <th>Type</th>
                <th>Division</th>
                <th>Category</th>
                <th>Priority</th>
                <th>Department</th>
                <th>Status</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>

            <c:forEach var="data" items="${projects}">
                <tr>

                    <td>${data.projectid}</td>
                    <td>${data.pname}</td>
                    <td>${data.reason}</td>
                    <td>${data.type}</td>
                    <td>${data.division}</td>
                    <td>${data.category}</td>
                    <td>${data.priority}</td>
                    <td>${data.department}</td>
                    <td>${data.status}</td>
                    <td>
                        <button onclick="startProject(${data.projectid})" class="button-start">Start</button>
                        <button onclick="endProject(${data.projectid})" class="button-white">End</button>
                        <button onclick="cancelProject(${data.projectid})" class="button-white">Cancel</button>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
