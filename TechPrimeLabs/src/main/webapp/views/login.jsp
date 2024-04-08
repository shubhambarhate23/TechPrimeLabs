<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="/CSS/login.css">
</head>
<body>

 
    <form action="/loginD" method="post">
    <h2>Login To Get Started</h2>
        <div>
            <label for="email">Email</label><br>
            <input type="email" id="email" name="email" required>
        </div><br>
        <div>
            <label for="password">Password</label><br>
             <div class="password-container">
                <input type="password" id="password" name="password" required>
               	<input type="checkbox" id="showPassword" onclick="togglePasswordVisibility()">
                <label for="showPassword">&#x1f441;</label>
            </div>
            <a href="#" id="forgotP">Forgot Password...!</a>
        </div><br><br>
        
        <button type="submit">Login</button>
    </form>
    
    <p>
        ${m}</p>
    
    
    
    <script>
        function togglePasswordVisibility() {
            var passwordInput = document.getElementById("password");
            var showPasswordCheckbox = document.getElementById("showPassword");
            
            if (showPasswordCheckbox.checked) {
                passwordInput.type = "text";
            } else {
                passwordInput.type = "password";
            }
        }
    </script>

</body>
</html>