<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="userResult" method="POST" modelAttribute="user">
Name:<form:input type="text" path="uname" /><br/>
Email:<form:input type="text" path="email" /><br/>
Phone No:<form:input type="text" path="phno" /><br/>
<input type="submit" value="Submit"/>
</form:form>

<h1>${name}</h1>
<h1>${email}</h1>
<h1>${mobile}</h1>
</body>
</html>