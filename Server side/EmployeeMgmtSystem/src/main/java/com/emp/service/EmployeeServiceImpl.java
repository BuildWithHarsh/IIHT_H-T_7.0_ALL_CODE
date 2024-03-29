package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
import com.emp.exception.ResourceNotFoundExceptionHandler;
import com.emp.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public int saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		Employee savedEmployee = employeeRepository.save(e);
		return savedEmployee.getId();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		List<Employee> allEmployee = employeeRepository.findAll();
		return allEmployee;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).get();
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
		employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee e, Integer id) {
		// TODO Auto-generated method stub
		Employee oldEmployeeValue = employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundExceptionHandler("Employee", "id", Integer.toString(id)));
		oldEmployeeValue.setName(e.getName());
		oldEmployeeValue.setPosition(e.getPosition());
		oldEmployeeValue.setEmail(e.getEmail());
		oldEmployeeValue.setSalary(e.getSalary());
		Employee emp = employeeRepository.save(oldEmployeeValue);
		return emp;
	}

}
