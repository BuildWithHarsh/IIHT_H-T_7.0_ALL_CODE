package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeServiceImpl employeeService;

	// to add a new employee
	@PostMapping("/employees")
	public int addEmployee(@RequestBody Employee e) {
		return employeeService.saveEmployee(e);
	}

	// to get the list of all the employee present in the database
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	// to get the particular employee of given ID present in the database
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable Integer id) {
		return employeeService.getEmployeeById(id);
	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable Integer id) {
		ResponseEntity<Employee> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			employeeService.deleteEmployee(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
	@PutMapping("employees/{id}")
	public Employee updateEmployee(@RequestBody Employee e , @PathVariable Integer id) {
		return employeeService.updateEmployee(e, id);
	}
}
