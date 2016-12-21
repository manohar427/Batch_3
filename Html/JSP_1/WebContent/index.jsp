<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
var xyz =100;
</script>
<body>
    HI
    
    <%!int age=10; %>
    
    
    <%
      int x =10;
      int y=20;
      System.out.println("Sum:"+(x+y));
      System.out.println(session.getId());
      System.out.println("Age:"+age);
      
      out.println("<BR> Current date:"+new Date());
    %>
    
    <%="Age:"+age %>
    
    
</body>
</html>