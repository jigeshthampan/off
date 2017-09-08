package in.jigs.employee.services;

import java.util.List;

import in.jigs.employee.model.Employee;

public interface EmployeeService {

		public void addEmployee(Employee employee);
		public List<Employee> listEmployees();
		public Employee getEmployee(int code);
		public void deleteEmployee(Employee employee);
		

}
