<%@page import="cn.com.yang.EntityClass.Employees"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
	 List<Employees> alllist=(List<Employees>)request.getAttribute("empall");
		
		for(Employees employees:alllist){
			%>
				<%=employees.getEmployee_id() %>
				<%=employees.getFirst_name() %>
				<%=employees.getLast_name() %>
				<%=employees.getEmail() %><br>
			<%
		}
		
	%>
</body>
</html>