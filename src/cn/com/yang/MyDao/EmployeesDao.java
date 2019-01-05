package cn.com.yang.MyDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.List;

import cn.com.yang.EntityClass.Employees;
import cn.com.yang.EntityClass.MyEmployees;

public class EmployeesDao {
	
	public List<MyEmployees> getAllEmployees() throws ClassNotFoundException, Exception{
		
		List<MyEmployees> employeess = new ArrayList<>();
		Connection connection =null;
		PreparedStatement preparedStatement =null;
		ResultSet resultSet =null;
		
		String	driverClass="com.mysql.jdbc.Driver";
		String	urljdbc="jdbc:mysql://localhost:3306/myemployees";
		String	user="root";
		String	password="admin";
		try {
			Class.forName(driverClass);
			connection =DriverManager.getConnection(urljdbc, user, password);
			String sql ="SELECT employee_id,first_name,last_name,email,phone_number,job_id,salary,commission_pct,manager_id,department_id,hiredate from employees";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				int employee_id=resultSet.getInt(1);
				String first_name = resultSet.getString(2);
				String last_name =resultSet.getString(3);
				String email =resultSet.getString(4);
				String phone_number =resultSet.getString(5);
				String job_id =resultSet.getString(6);
				double salary =resultSet.getDouble(7);
				double commission_pct =resultSet.getDouble(8);
				int manager_id =resultSet.getInt(9);
				int department_id = resultSet.getInt(10);
				
				//将遍历的数据存入MyEmployees对象中；
				MyEmployees myEmployees = new MyEmployees(employee_id, first_name, last_name, email, phone_number, job_id, salary, commission_pct, manager_id, department_id);
				//放入List中
				employeess.add(myEmployees);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				resultSet.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employeess;
	}
}
