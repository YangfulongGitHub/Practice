package cn.com.yang.Servlet;

import java.io.IOException;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.sg.prism.web.NGWebView;

import cn.com.yang.EntityClass.MyEmployees;
import cn.com.yang.MyDao.EmployeesDao;

/**
 * Servlet implementation class MyEmployeesServlet
 */
@WebServlet("/MyEmployeesServlet")
public class MyEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyEmployeesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeesDao employeesDao = new EmployeesDao();
	
		List<MyEmployees> myEmployees;
		try {
			myEmployees = employeesDao.getAllEmployees();
			request.setAttribute("myEmployees", myEmployees);
			request.getRequestDispatcher("List_Employees.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
