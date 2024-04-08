<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Project Form</title>
<link rel="stylesheet" type="text/css" href="/CSS/addproject.css">
<script>
function validateDates() {
    var startDate = document.getElementById("startdate").value;
    var endDate = document.getElementById("enddate").value;

    if (startDate > endDate) {
        alert("End date must be greater than start date");
        return false;
    }
    return true;
}
</script>


<style type="text/css">




</style>
</head>
<body>
    <h2>Project Form</h2>
    <form action="/submitProject" method="post" onsubmit="return validateDates()">
        
        <td>
        <input type="text" id="pname" name="pname" placeholder="Enter project name " required>
		</td>
		<td>
		<input type="submit" id="sbutton" value="save project"><br><br>
		</td>
        <div class="form-container">
    
    <table>
        
        <tr>
            <td>
                <label for="reason">Reason:</label>
                <select id="reason" name="reason">
                    <option value="business">business</option>
                    <option value="dealership">dealership</option>
                    <option value="transport">transport</option>
                   
                </select>
            </td>
            <td>
                <label for="type">Type:</label>
                <select id="type" name="type">
                   <option value="Internal">Internal</option>
                    <option value="external">external</option>
                    <option value="vendor">vendor</option>
                    
                </select>
            </td>
            <td>
                <label for="division">Division:</label>
                <select id="division" name="division">
                    <option value="compressor">compressor</option>
                    <option value="filter">filter</option>
                    <option value="pumps">pumps</option>
                    <option value="glass">glass</option>
                    <option value="water heater">water heater</option>
                </select>
            </td>
        </tr>
       
        <tr>
            <td>
                <label for="category">Category:</label>
                <select id="category" name="category">
                    <option value="Category A">Category A</option>
                    <option value="Category B">Category B</option>
                    <option value="Category C">Category C</option>
                    <option value="Category D">Category D</option>
                </select>
            </td>
            <td>
                <label for="priority">Priority:</label>
                <select id="priority" name="priority">
                    <option value="high">high</option>
                    <option value="medium">medium</option>
                    <option value="low">low</option>
                </select>
            </td>
            <td>
                <label for="department">Department:</label>
                <select id="department" name="department">
                    <option value="strategy">strategy</option>
                    <option value="finance">finance</option>
                    <option value="quality">quality</option>
                    <option value="maintainance">maintainance</option>
                    <option value="stores">stores</option>
                </select>
            </td>
        </tr>
       
        <tr>
            <td>
                <label for="startdate">Start Date:</label>
                <input type="date" id="startdate" name="startdate" required>
            </td>
            <td>
                <label for="enddate">End Date:</label>
                <input type="date" id="enddate" name="enddate" required>
            </td>
            <td>
                <label for="location">Location:</label>
                <select id="location" name="location">
                    <option value="Pune">Pune</option>
                    <option value="Delhi">Delhi</option>
                    <option value="Mumbai">Mumbai</option>
                </select>
            </td>
        </tr>
        
        
       
    </table>
    <label for="status">Status:</label>
        <input type="text" id="status" name="status" value="Registered" readonly="readonly">
</div>

    </form>
</body>
</html>
