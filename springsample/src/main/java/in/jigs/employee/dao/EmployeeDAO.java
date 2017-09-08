package in.jigs.employee.dao;

import java.util.List;

import in.jigs.employee.model.Employee;

public interface EmployeeDAO {
	public void addEmployee(Employee employee);
	public List<Employee> listEmployees();
	public Employee getEmployee(int code);
	public void deleteEmployee(Employee employee);
	
}
