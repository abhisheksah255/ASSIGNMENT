package com.abhisheksah.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhisheksah.model.Employee;
import com.abhisheksah.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllDetails();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getById(id);
	}
	
	@PutMapping("/employees/{id}")
	public void UpdateEmployeeById(@RequestBody Employee employee,@PathVariable int id) {
		
		employeeService. updatedetail(employee, id);
		 
	}
	
	@PostMapping("/employees")
	public void getEmployee(@RequestBody Employee employee) {
		employeeService.addDetail(employee);
	}
	
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable int id) {
		employeeService.deleteDetail(id);
	}
}
