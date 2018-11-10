<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ page import="usebeanpack.UseBeanDemo"%>

<html>

<head>
	<title>Java Code Geeks Snippets - Use a Bean in JSP Page</title>
</head>

<body>

	<jsp:useBean id="sampleBean" class="usebeanpack.UseBeanDemo" scope="session">
	    <%-- intialize bean properties --%>
	    <jsp:setProperty name="sampleBean1" property="name" value="KRISHNA" />
	     <jsp:setProperty name="sampleBean1" property="company" value="Techm" />
	</jsp:useBean>
	
	Sample Bean: <%= sampleBean %>
	
	

</body>