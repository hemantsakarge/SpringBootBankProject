<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f9;
        }

        /* Navigation Bar */
        .navbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #333;
            padding: 0.5rem 1rem;
        }

        .navbar a {
            color: white;
            text-decoration: none;
            margin: 0 1rem;
            font-size: 1rem;
        }

        .navbar a:hover {
            text-decoration: underline;
        }

        .navbar .nav-links {
            display: flex;
        }

        /* Login Form */
        .login-container {
            max-width: 500px;
            margin: 3rem auto;
            background: white;
            padding: 5rem;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        .login-container h2 {
            margin-bottom: 2rem;
            color: #333;
            text-align: center;
        }

        .form-group {
            margin-bottom: 1rem;
        }

        .form-group label {
            display: block;
            margin-bottom: 0.5rem;
            color: #555;
        }

        .form-group input {
            width: 100%;
            padding: 0.5rem;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 1rem;
        }

        .form-group input:focus {
            border-color: #007bff;
            outline: none;
        }

        .btn {
            display: block;
            width: 100%;
            padding: 0.75rem;
            font-size: 1rem;
            color: white;
            background-color: #007bff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
        }
       
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
    
    <script type="text/javascript">
    
    function withdrawl()
    {
    	document.fn.action="withdraw";
    	document.fn.submit();
    	
    }
    function diposite()
    {
    	document.fn.action="diposite";
    	document.fn.submit();
    	
    }
    function editaccount()
    {
    	document.fn.action="editaccount";
    	document.fn.submit();
    	
    }
    function lasttransaction()
    {
    	
    	document.fn.action="lasttransaction";
    	document.fn.submit();
    	
    }
    function transferMoneytoother()
    {
    	document.fn.action="transferMoneytoother";
    	document.fn.submit();
    }
    
    
    </script>
    
    
    
</head>
<body>

    <!-- Navigation Bar -->
    
    <!-- Login Form -->
    <div class="login-container">
        <h2>User Login</h2>
        <form name="fn" >
            <div class="form-group">
                <label for="username">accNo</label>
                <input type="number" name="accno" readonly="readonly" value="${data.accno}" >
            </div>
            <div class="form-group">
                <label for="balence">balance</label>
                <input type="number"  name="balence" value="${data.balence}" >
            </div>
            
             
         
         <table>
         <tr> <td><button type="button"  onclick="withdrawl()">WITHDRAWL</button></td>
         
         <td><button type="button"  onclick="diposite()">DIPOSITE</button></td>
          <td><button type="button"  onclick="editaccount()">KYCUPDATE</button></td>
          <td><button type="button"  onclick="lasttransaction()">lasttransaction</button></td>
           <td><button type="button"  onclick="transferMoneytoother()">TransferMoneyToOther</button></td>
         </tr>
         </table>
         
        </form>
    </div>

</body>
</html>
