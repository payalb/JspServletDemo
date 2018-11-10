<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("name1", "kiran", PageContext.APPLICATION_SCOPE);
	%>
	<%
		pageContext.setAttribute("name2", "Ravi", PageContext.SESSION_SCOPE); // session spans across request 
	%>
	<%
		pageContext.setAttribute("name3", "Praveen", PageContext.REQUEST_SCOPE); // 
	%>
	<%
		pageContext.setAttribute("name4", "venkat", PageContext.PAGE_SCOPE);
	
	%>
	<%  %>


</body>
</html>