<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">


 /* Login Form */
        .login-container {
            max-width: 400px;
            margin: 3rem auto;
            background: white;
            padding: 5rem;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            text-align: center;
           text-transform: uppercase;
        }



</style>



</head>

<body>


 <div class="login-container">
 <form action="transfermoney">
     
<pre>
 <div class="form-group">
<label >SENDER ACCOUNT NUMBER</label>
<input type="number" name="accno"  readonly="readonly"  value="${data.accno}" >
</div>
 <div class="form-group">
<label >RECIEVER ACCOUNT NUMBER</label>
<input type="number" name="rcvaccno"  placeholder="enter reciever account no">
</div>
  <div class="form-group">       
<label for="balence">balance</label>
<input type="number"  name="balence" placeholder="enter money to transfer" >
</div>


<input type="submit" value="Transfer">

</pre>

</form> 
</div>  
</body>
</html>