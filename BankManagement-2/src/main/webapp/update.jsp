<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Registration Page</h1>

<form action="updatetologin">
<label>Account Number</label>
<br>
<input type="number" name="accno" value="${data.accno}">
<br>
<br>

<label> Name </label>
<br>
<input type="text" name="name" value="${data.name}">
<br>
<br>

<label>Age</label>
<br>
<input type="number" name="age" value="${data.age}">
<br>
<br>

<label>Email</label>
<br>
<input type="text" name="email" value="${data.email}">
<br>
<br>

<label>Contact</label>
<br>
<input type="number" name="contact" value="${data.contact}">
<br>
<br>

<label>Address</label>
<br>
<input type="text" name="address" value="${data.address}">
<br>
<br>

<label>Balence</label>
<br>
<input type="number" name="balence" value="${data.balence}">
<br>
<br>

<label>UserName</label>
<br>
<input type="text" name="username" value="${data.username}">
<br>
<br>

<label>Password</label>
<br>
<input type="text" name="password" value="${data.password}">
<br>
<br>

<input type="submit" value="UPDATE"> 
</form>
</body>
</html>