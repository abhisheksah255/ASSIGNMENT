/*
1) Use a HashSet to hold Employee Objects. Upon running the application, the details of the
employees added to the HashSet should be displayed.
Employee <<class>>
|-- id
|-- name
|-- salary
|-- department
|-- displayDetails()
Feel free to add properties and methods to Employee Class
Note: if we try to store any object other than Employee Object in HashSet, we should not be
allowed to.
*/

import java.util.HashSet;
import java.util.Set;

public class Employee1 {
	int id;
	String name;
	float salary;
	String department;
	
	
	public Employee1(int id, String name, float salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}



	public static void main(String[] args) {
		displayDetails();
	}
		public static  void displayDetails() {
			Set<Employee1> emp=new HashSet<>();
			emp.add(new Employee1(101,"Abhishek",34532,"MCA"));
			emp.add(new Employee1(103,"Aman",31232,"M.SC"));
			emp.add(new Employee1(105,"Arvind",33232,"MBBS"));
			emp.add(new Employee1(102,"Aditya",13332,"MA"));
			emp.add(new Employee1(109,"Ankit",54632,"M.Tech"));
			emp.add(new Employee1(107,"Anirban",24332,"MBA"));
		
		for(Employee1 detail:emp) {
	//detail.displayDetails();
			System.out.println("Detail of employee :-"+detail);
		}
		

}
}
