<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="test"  class="com.customer.Customer" scope="session"/>
	<jsp:setProperty name="test" property="name" value="HHHHHHHHHHHHHHHHHHH" />
	<p>Got message....</p>
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	<jsp:getProperty name="test" property="name" />
	
	<jsp:forward page="page2.jsp"></jsp:forward>
</body>
</html>