package cn.com.yang.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.yang.EntityClass.Employees;

/**
 * Servlet implementation class EmployeesServlet
 */
@WebServlet("/EmployeesServlet")
public class EmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Employees> emplist = new ArrayList<>();
		emplist.add(new Employees(1,"张","三","emalaaaaa@.com"));
		emplist.add(new Employees(2,"张","三","emalaaaaa@.com"));
		emplist.add(new Employees(3,"张","三","emalaaaaa@.com"));
		emplist.add(new Employees(4,"张","三","emalaaaaa@.com"));
		request.setAttribute("empall", emplist);
		request.getRequestDispatcher("/Text.jsp").forward(request, response);
	}


}
