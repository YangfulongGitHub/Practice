package cn.com.yang.EntityClass;
public class Employees {
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
/*	private String phone_number;
	private String job_id;
	private double salary;
	private double commission_pct;
	private int manager_id;
	private int department_id;
	private Date hiredate;*/
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employees(int employee_id, String first_name, String last_name, String email) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	
	
}
