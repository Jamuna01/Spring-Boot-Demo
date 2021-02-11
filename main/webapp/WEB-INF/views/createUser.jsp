<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
	<div>
		<form action="save_user" method="post">
		
			<div>
				<label>User Name</label>
				<input type="text" name="username">
			</div>
			<br>
			<div>
				<label>Password</label>
				<input type="password" name="password">
			</div>
			<br>
			<div>
				<label>Email</label>
				<input type="email" name="email">
			</div>
			<br>
			<div>
				<label>Mobile No</label>
				<input type="number" name="mobileNo">
			</div>
			<br>
			<div>
				<label>DOB</label>
				<input type="date" name="dob">
			</div>
			<br>
			<div>
				<label>Gender</label>
				<input type="radio" name="gender" value="Male">Male
				<input type="radio" name="gender" value="Female">Female
			</div>
			<br>
			<div>
				<label>Hobbies</label>
				<input type="checkbox" name="hobbies" value="Reading">Reading
				<input type="checkbox" name="hobbies" value="Playing">Playing
			</div>
			<br>
			<div>
				<label>Nationality</label>
				<select name="nationality">
					<option value="Nepalease">Nepalease</option>
					<option value="American">American</option>
					<option value="Indian">Indian</option>
				</select>
			</div>
			<br>
			<div>
				<label>Comment</label>
				<textarea rows="5" cols="25"></textarea>
			</div>
			<br>
			<div>
				<input type="submit" value="Submit">
			</div>
		
		</form>
	</div>
</body>
</html>