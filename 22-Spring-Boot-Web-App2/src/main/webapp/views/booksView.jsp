<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<thead>
<tr>
<th>BOOKID</th>
<th>BOOKNAME</th>
<th>BOOKPRICE</th>
</tr>
</thead>
<tbody>
<c:forEach var="x" items="${books}">
<tr>
<td>${x.bookId}</td>
<td>${x.bookName}</td>
<td>${x.bookPrice}</td>
</tr>
</c:forEach>
</tbody>
</table>



</body>
</html>