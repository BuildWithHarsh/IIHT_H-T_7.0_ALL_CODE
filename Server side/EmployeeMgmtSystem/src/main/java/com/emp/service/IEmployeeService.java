package com.emp.service;

import java.util.List;

import com.emp.entity.Employee;

public interface IEmployeeService {
	
	public int saveEmployee(Employee e);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(Integer id);
	
	public void deleteEmployee(Integer id);
	
	public Employee updateEmployee(Employee e , Integer id);

}
