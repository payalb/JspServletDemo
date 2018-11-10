<%@  page language="java" autoFlush="true" buffer="8kb"
	import="java.awt.*" info="this is test jsp " errorPage="/RJTWebPro1/error.jsp" 
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!class A {
		String f() {
			return "HELLO";
		}
	}%>
	<%
		System.out.println("Hello"); // 
		response.getWriter().println("GOT with getwriter " + new A().f()); // 
        response.getWriter();
		out.write("This is with out write "); // built in out
	%>
	with expression
	




</body>
</html>