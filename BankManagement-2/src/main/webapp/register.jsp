<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 25;
            padding: 15;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 120vh;
        }
        .form-container {
            background: #fff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            max-width: 400px;
            width: 100%;
        }
        .form-container h1 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }
        .form-container label {
            display: block;
            font-size: 14px;
            margin-bottom: 5px;
            color: #555;
        }
        .form-container input[type="text"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        .form-container input[type="submit"] {
            width: 100%;
            background: #4CAF50;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s;
        }
        .form-container input[type="submit"]:hover {
            background: #45a049;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h1>Register</h1>
        <form action="registertologin">

            <label for="accno">Account Number</label>
            <input type="text" id="accno" name="accno" placeholder="Enter your account number">

            <label for="name">Name</label>
            <input type="text" id="name" name="name" placeholder="Enter your full name">

            <label for="age">Age</label>
            <input type="text" id="age" name="age" placeholder="Enter your age">

            <label for="email">Email</label>
            <input type="text" id="email" name="email" placeholder="Enter your email">

            <label for="contact">Contact</label>
            <input type="text" id="contact" name="contact" placeholder="Enter your contact number">

            <label for="address">Address</label>
            <input type="text" id="address" name="address" placeholder="Enter your address">

            <label for="balance">Balance</label>
            <input type="text" id="balence" name="balence" placeholder="Enter initial balance">

            <label for="username">Username</label>
            <input type="text" id="username" name="username" placeholder="Choose a username">

            <label for="password">Password</label>
            <input type="text" id="password" name="password" placeholder="Create a password">

            <input type="submit" value="Register">
        </form>
    </div></body>
</html>
