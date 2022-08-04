<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passenger Registration</title>
</head>
<body>

<div class="form">
		<h3>Passenger Registration</h3>
		<form action="savePassenger" method="post" modelAttribute="passenger">
			<!-- modelAttribute="passenger" -->

			<p class="contact">
				<label for="title">Title</label>
			</p>
			<input id="title" name="title" placeholder="Enter Title" required
				tabindex="1" type="text">


			<p class="contact">
				<label for="first_name">First Name</label>
			</p>
			<input id="first_name" name="first_name" placeholder="Enter first name"
				required tabindex="2" type="text">

			<p class="contact">
				<label for="last_name">Last Name</label>
			</p>
			<input id="last_name" name="last_name" placeholder="Enter last name" required
				tabindex="3" type="text">
				
			<p class="contact">
				<label for="email">Email</label>
			</p>
			<input id="email" name="email" placeholder="Enter Email" required
				tabindex="1" type="email">
				

			<p class="contact">
				<label for="pass">Enter a password</label>
			</p>
			<input type="pass" id="pass" name="pass" required
				tabindex="4">
	
			<p class="contact">
				<label for="cpass">Confirm Password</label>
			</p>
			<input type="cpass" id="pass" name="cpass" required
				tabindex="4">
			
			<label for="dob">Date Of Birth:</label>
			<input type="date" id="dob" name="dob" tabindex="5">

			<p class="contact">
				<label for="contactNo">Contact Number</label>
			</p>
			<input type="number" id="contactNo" name="contactNo" required
				tabindex="4">
				
			<div><input class="buttom" name="submit" id="submit" tabindex="9"
				value="Sign me up!" type="submit">
				</div> 
		</form>
			

</body>
</html>