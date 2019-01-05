<%@page import="cn.com.yang.EntityClass.MyEmployees"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>员工列表</title>
</head>
<body>
	<%
		List<MyEmployees>listEmployees=(List<MyEmployees>)request.getAttribute("myEmployees");
	%>	
	<center>
	<h5>员工信息表</h5>
	<table border="1" cellpadding="10" cellspacing="0" >
		<tr>
			<th>employee_id</th>
			<th>first_name</th>
			<th>last_name</th>
			<th>email</th>
			<th>phone_number</th>
			<th>job_id</th>
			<th>salary</th>
			<th>commission_pct</th>
			<th>manager_id</th>
			<th>department_id</th>
		</tr>
		<%
			for(MyEmployees myEmployees:listEmployees){
				%>
					<tr>
						<td><%=myEmployees.getEmployee_id() %></td>
						<td><%=myEmployees.getFirst_name() %></td>
						<td><%=myEmployees.getLast_name() %></td>
						<td><%=myEmployees.getEmail() %></td>
						<td><%=myEmployees.getPhone_number() %></td>
						<td><%=myEmployees.getJob_id() %></td>
						<td><%=myEmployees.getSalary() %></td>
						<td><%=myEmployees.getCommission_pct() %></td>
						<td><%=myEmployees.getManager_id() %></td>
						<td><%=myEmployees.getDepartment_id() %></td>
					</tr>
				<%
			}
		%>
	</table>
	</center>
	<br>
	*********************************************************************
	<h2>使用jstl</h2>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>employee_id</th>
			<th>first_name</th>
			<th>last_name</th>
			<th>email</th>
			<th>phone_number</th>
			<th>job_id</th>
			<th>salary</th>
			<th>commission_pct</th>
			<th>manager_id</th>
			<th>department_id</th>
		</tr>
	<c:forEach items="${requestScope.myEmployees}" var="emp">
		<tr>
			<td>${emp.employee_id}</td>
		</tr>
	</c:forEach>
	</table>
	
	
</body>
</html>