/*
 3)	Store at least 10 Employee Objects in an TreeSet<Employee>.
  When the application runs the user should be asked to select one of the options upon which you will print the employee details in a sorted manner.
For E.g.
Run Application:
a)	ID
b)	Name
c)	Department
d)	Salary
Your choice: b
<Should print all the employee’s details sorted by name>
 
 */

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
	class Employee{
		 int id;
		 String Name;
		 String Department;
		double Salary;
		public Employee(int id, String name, String department, double salary) {
			
			this.id = id;
			this.Name = name;
			this.Department = department;
			this.Salary = salary;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return Name;
		}
		public String getDepartment() {
			return Department;
		}
		public double getSalary() {
			return Salary;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", Name=" + Name + ", Department=" + Department + ", Salary=" + Salary + "]";
		}
		
	}
		class EId implements Comparator<Employee>{
			public int compare(Employee e1, Employee e2) {
				return e1.getId()-e2.getId();
			}
		}
		class EName implements Comparator<Employee>{
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		}

		class EDept implements Comparator<Employee>{
			public int compare(Employee e1, Employee e2) {
				return e1.getDepartment().compareTo(e2.getDepartment());
			}
		}

		class ESalary implements Comparator<Employee>{
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.getSalary()-e2.getSalary());
			}
		
	}
	
		public class Question3 {
		
		public static void main(String[] args) throws Exception {
			TreeSet<Employee> data = new TreeSet<Employee>(new EId());
		data.add(new Employee(103, "Rahul", "MTech",3454.45d) );
		data.add( new Employee(101, "Abhishek", "MCA",34543255.32d) );
		data.add(new Employee(102, "Ankit", "MCA",5455.342d) );
		data.add(new Employee(104, "Ankush", "MtTech",5255.532d) );
		data.add(new Employee(106, "Mukesh", "MBA",675.31d) );
		data.add(new Employee(107, "Kuldeep", "BBA",4325.32d) );
		data.add(new Employee(109, "Ramu", "MA",1215.32d) );
		data.add(new Employee(110, "Nitish", "MA",32155.51d) );
		data.add(new Employee(121, "Vikash", "B.Sc",67255.542d) );
		data.add(new Employee(108, "Anirban", "MCA",34515.42d) );
		data.add(new Employee(103, "Rajat", "BBA",9015.12d) );
		data.add(new Employee(110, "Shayam", "MBA",1212.312d) );
		data.add(new Employee(105, "Golu", "B.Ed",3425.33d) );
		
		TreeSet<Employee> data1=new TreeSet<>(new EName());
		data1.add(new Employee(103, "Rahul", "MTech",3454.45d) );
		data1.add( new Employee(101, "Abhishek", "MCA",34543255.32d) );
		data1.add(new Employee(102, "Ankit", "MCA",5455.342d) );
		data1.add(new Employee(104, "Ankush", "MtTech",5255.532d) );
		data1.add(new Employee(106, "Mukesh", "MBA",675.31d) );
		data1.add(new Employee(107, "Kuldeep", "BBA",4325.32d) );
		data1.add(new Employee(109, "Ramu", "MA",1215.32d) );
		data1.add(new Employee(110, "Nitish", "MA",32155.51d) );
		data1.add(new Employee(121, "Vikash", "B.Sc",67255.542d) );
		data1.add(new Employee(108, "Anirban", "MCA",34515.42d) );
		data1.add(new Employee(103, "Rajat", "BBA",9015.12d) );
		data1.add(new Employee(110, "Shayam", "MBA",1212.312d) );
		data1.add(new Employee(105, "Golu", "B.Ed",3425.33d) );
		
		TreeSet<Employee> data2=new TreeSet<>(new EDept());
		data2.add(new Employee(103, "Rahul", "MTech",3454.45d) );
		data2.add( new Employee(101, "Abhishek", "MCA",34543255.32d) );
		data2.add(new Employee(102, "Ankit", "MCA",5455.342d) );
		data2.add(new Employee(104, "Ankush", "MtTech",5255.532d) );
		data2.add(new Employee(106, "Mukesh", "MBA",675.31d) );
		data2.add(new Employee(107, "Kuldeep", "BBA",4325.32d) );
		data2.add(new Employee(109, "Ramu", "MA",1215.32d) );
		data2.add(new Employee(110, "Nitish", "MA",32155.51d) );
		data2.add(new Employee(121, "Vikash", "B.Sc",67255.542d) );
		data2.add(new Employee(108, "Anirban", "MCA",34515.42d) );
		data2.add(new Employee(103, "Rajat", "BBA",9015.12d) );
		data2.add(new Employee(110, "Shayam", "MBA",1212.312d) );
		data2.add(new Employee(105, "Golu", "B.Ed",3425.33d) );
		
		
		TreeSet<Employee> data3=new TreeSet<>(new ESalary());
		data3.add(new Employee(103, "Rahul", "MTech",3454.45d) );
		data3.add( new Employee(101, "Abhishek", "MCA",34543255.32d) );
		data3.add(new Employee(102, "Ankit", "MCA",5455.342d) );
		data3.add(new Employee(104, "Ankush", "MtTech",5255.532d) );
		data3.add(new Employee(106, "Mukesh", "MBA",675.31d) );
		data3.add(new Employee(107, "Kuldeep", "BBA",4325.32d) );
		data3.add(new Employee(109, "Ramu", "MA",1215.32d) );
		data3.add(new Employee(110, "Nitish", "MA",32155.51d) );
		data3.add(new Employee(121, "Vikash", "B.Sc",67255.542d) );
		data3.add(new Employee(108, "Anirban", "MCA",34515.42d) );
		data3.add(new Employee(103, "Rajat", "BBA",9015.12d) );
		data3.add(new Employee(110, "Shayam", "MBA",1212.312d));
		data3.add(new Employee(105, "Golu", "B.Ed",3425.33d) );
		System.out.println("****************************");
		System.out.println("---------Value after sorting----");
		System.out.println("---------By default Value is sorted on the bases of Name----");
		for(Employee em:data) {
			System.out.println(em);
		}	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice: ");
		System.out.println("1 - ID");
		System.out.println("2 - Name");
		System.out.println("3 - Department");
		System.out.println("4 - Salary");
		int x = sc.nextInt();
		sc.close();
		if(x==1) {
			for(Employee em:data) {
				System.out.println(em.getId() +" "+ em.getName()+" "+ em.getDepartment()+" "+ em.getSalary());	
			}
			
		} 
		else if(x==2) {
			for(Employee em:data1) {
				System.out.println(em.getName()+" "+em.getId() +" "+ em.getDepartment()+" "+ em.getSalary());	
			}
		}
		else if(x==3) {
			for(Employee em:data2) {
				System.out.println(em.getDepartment()+" "+em.getName()+" "+em.getId() +" "+ em.getSalary());	
			}
		}
		else if(x==4) {
			for(Employee em:data3) {
				System.out.println(em.getSalary()+" "+em.getDepartment()+" "+em.getName()+" "+em.getId());	
			}
		}
		else {
			System.out.println("Wrong Input Please try to enter valid value from 1 to 4 ");
		}
		
		}
		}
