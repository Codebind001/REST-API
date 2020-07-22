<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addBook">
		<input type="text" name="b_id"><br> 
		<input type="text"name="name"><br> 
		<input type="text" name="description"><br>
		<input type="submit"> <br> <br>
	</form>

<br> <br><br> <br>

	<form action="seeBooks">
		<input type="text" name="b_id"><br> 
		<input type="submit"><br>
	</form>
</body>
</html>