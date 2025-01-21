<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="withdrawltohome">
<label>Account</label>
<input type="number" name="accno" value="${data.accno}">
<br>
<label>Enter Amount </label>
<input type="number" name="balence" >
<input type="submit" value="withdraw">
</form>

</body>
</html>