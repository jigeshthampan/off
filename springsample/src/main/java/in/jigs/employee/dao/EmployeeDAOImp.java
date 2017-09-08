package in.jigs.employee.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.jigs.employee.model.Employee;


@Repository("employeeDAO")
public class EmployeeDAOImp implements EmployeeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}

	@Override
	public List<Employee> listEmployees() {
		return (List<Employee>)sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
		 
	}

	@Override
	public Employee getEmployee(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

}
