package com.abhisheksah.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abhisheksah.model.Employee;

@Service
public class EmployeeService {

	private List<Employee>list;

	public EmployeeService() {
		list=new ArrayList<>();
		list.add(new Employee(102,"Aniket","CO","Indian Army",73000));
		list.add(new Employee(103,"Rahul","Captain","Indian Army",740000));
		list.add(new Employee(104,"Vikram","Major","Indian Army",745600));
		list.add(new Employee(105,"Akash","Hav","Indian Army",52000));
		list.add(new Employee(106,"Mohit","OR","Indian Army",48000));
		list.add(new Employee(101,"Abhishek","JCO","Indian Army",60000));
		
	}
	public List<Employee> getAllDetails(){
		return list;
	}
	public Employee getById(int id) {
		return list.stream().filter(t->t.getEmployeeId()==id).findFirst().get();
	}
	
	public void addDetail(Employee employee) {
		list.add(employee);
	}
	public void updatedetail(Employee employee,int id) {
		for(int i=0;i<list.size();i++) {
			if(employee.getEmployeeId()==id) {
				list.set(i, employee);
				return;
			}
		}
	}
	
	public void deleteDetail(int id) {
		list.removeIf(t ->t.getEmployeeId()==id );
	}
}
