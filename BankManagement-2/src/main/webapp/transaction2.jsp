<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transaction History</title>
</head>
<body>

<h2>Transaction History</h2>
<table border="2">
    <thead>
        <tr>
            <th>Transaction ID</th>
             <th>Type</th>
            <th>Amount</th>
             <th>acc no</th>
               <th>Name</th>
         <th>Date</th>
           <th> sender acc no</th>
           
              <th> reciever acc no</th>
               <th> sender name</th>
               <th> reciever name</th>
        </tr>
    </thead>
    <tbody>
<c:forEach items="${data}" var="t">
<tr>
<td>${t.tid}</td>
<td>${t.type}</td>
<td>${t.traAmt}</td>
<td>${acc}</td>
<td>${name }</td>
<td>${t.ldt}</td>
<td>${t.senderAcc}</td>
<td>${t.recieverAcc}</td>
<td>${t.senderName}</td>
<td>${t.recieverName}</td>


</tr>
</c:forEach>
    </tbody>
</table>

</body>
</html>
